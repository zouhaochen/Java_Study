package day14;

/*
将自定义对象作为元素存到ArrayList集合中，并去除重复元素

比如：存人对象，同姓名同年龄，视为同一个人，为重复元素

思路：
1. 对人描述，将数据封装进人对象
2. 定义容器，将人存入
3. 取出

List集合判断元素是否相同，依据的是元素的equals方法
 */

import java.util.ArrayList;
import java.util.Iterator;

class Person
{
    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Person))
            return false;
        Person p = (Person) obj;
        return this.name.equals(p.name) && this.age == p.age;
    }
}

public class Demo07
{
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add(new Person("Mike", 30)); //al.add(Object obj); Object obj = new Person("Mike", 30);
        al.add(new Person("Lucy", 20));
        al.add(new Person("Lucy", 20));
        al.add(new Person("Lucy", 20));
        al.add(new Person("Flora", 25));
        al.add(new Person("Flora", 25));
        al.add(new Person("Flora", 25));
        al.add(new Person("Tiffany", 22));
        al.add(new Person("Sunny", 24));
        al.add(new Person("Sunny", 24));

        Iterator it = al.iterator();

        while(it.hasNext())
        {
            Object obj = it.next();
            Person p = (Person) obj; //强制类型转换，将Object类型转换成Person类型
            sop(p.getName()+";"+p.getAge());
        }
        System.out.println();

        al = singleElement(al);

        Iterator it1 = al.iterator();

        while (it1.hasNext())
        {
            Person p = (Person)it1.next();
            sop(p.getName()+";"+p.getAge());
        }
        System.out.println();


        sop("remove Mike: "+al.remove(new Person("Mike",30)));
        Iterator it2 = al.iterator();

        while (it2.hasNext())
        {
            Person p = (Person)it2.next();
            sop(p.getName()+";"+p.getAge());
        }
        System.out.println();

    }

    public static ArrayList singleElement(ArrayList al)
    {
        //定义一个临时容器
        ArrayList newAl = new ArrayList();

        Iterator it = al.iterator();

        while(it.hasNext())
        {
            Object obj = it.next();

            if(!newAl.contains(obj)) //contains方法调用equals
                newAl.add(obj);
        }
        /*
        在迭代时，循环中next调用一次就要hasNext判断一次
         */
        return newAl;
    }

}
