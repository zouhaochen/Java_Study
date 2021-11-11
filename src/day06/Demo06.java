package day06;

/*
设计模式：解决某一类问题最行之有效的方法
java中23种设计模式
单例设计模式：解决一个类在内存中只存在一个对象

想要保证对象唯一：
1. 为了避免其他程序过多建立该类对象，先控制禁止其他程序建立该类对象
2. 为了让程序可以访问到该类对象，在本类中自定义一个对象
3. 为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式

这三步怎么用代码体现？
1. 将构造函数私有化
2. 在类中创建一个本类对象
3. 提供一个方法可以获取到该对象

对于事物的描述：
当需要将该事物的对象保证在内存中唯一时，就讲以上的三步加上即可
 */

class Single
{
    private int num;
    public void setNum(int num)
    {
        this.num = num;
    }
    public int getNum()
    {
        return num;
    }
    private Single(){}
    private static Single s = new Single();

    public static Single getInstance()
    {
        return s;
    }
}

public class Demo06
{
    public static void main(String[] args)
    {
        Single s = Single.getInstance();
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        s1.setNum(23);
        System.out.println(s2.getNum());

        Student student1 = Student.getStudent();
        Student student2 = Student.getStudent();
        student1.setAge(100);
        System.out.println(student2.getAge());
    }
}

class Student
{
    private int age;

    //第一步
    private Student(){}
    //第二步
    private static Student s = new Student();
    //第三步
    public static Student getStudent()
    {
        return s;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
}
