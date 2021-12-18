package day21;

import java.io.*;

/*
IO包中的其他类
1. 打印流
   PrintWriter与PrintStream
   可以直接操作输入流和文件
2. 序列流
   SequenceInputStream
   对多个流进行合并
3. 操作对象
   ObjectInputStream与ObjectOutputStream
   被操作的对象需要实现Serializable（标记接口）
 */
public class Demo01
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        writeObj();
        readObj();
    }

    public static void writeObj() throws IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.object"));
        oos.writeObject(new Person("LiSi", 39, "KR"));
        oos.close();
    }

    public static void readObj() throws IOException, ClassNotFoundException
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
        Person p = (Person)ois.readObject();

        System.out.println(p);
        ois.close();
    }
}

/*
Serializable接口没有方法，不需要覆盖其方法
没有方法的接口称为标记接口
想要被序列化，需要用标记接口标记一下，表示具备此资格
对象被序列化后把对象存储起来了，无法看懂
 */
class Person implements Serializable
{
    //定义UID，给类定义一个固定标识，使得类中变量私有后仍然可以读取，方便序列化
    public static final long serialVersionUID = 42L;
    private String name;
    private int age;

    //静态不可以被序列化
    static String country = "CN";

    //对于非静态成员，如果不想被序列化，加transient关键字
    transient String sex = "men";

    Person(String name, int age, String country)
    {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String toString()
    {
        return name+": "+age+", "+country;
    }
}