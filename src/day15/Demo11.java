package day15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/*
? 通配符，也可以理解为占位符
泛型的限定
? extends E: 可以接收E类型或者E的子类型，上限
? super E: 可以接收E类型或者E的父类型，下限
 */
public class Demo11
{
    public static void main(String[] args)
    {
        ArrayList<PersonNew> al = new ArrayList<PersonNew>();
        al.add(new PersonNew("abc1"));
        al.add(new PersonNew("abc2"));
        al.add(new PersonNew("abc3"));

        printColl(al);
        System.out.println();

        ArrayList<StudentNew> al1 = new ArrayList<StudentNew>();
        al1.add(new StudentNew("abc1"));
        al1.add(new StudentNew("abc2"));
        al1.add(new StudentNew("abc3"));

        /*
        printColl(al1); //错误原因: ArrayList<Person> al = new ArrayList<Student>(); 左右两边要一致
        */

        printCollNew(al1);
    }

    public static void printColl(ArrayList<PersonNew> al)
    {
        Iterator<PersonNew> it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().getName());
        }
    }

    //泛型限定: ? extends 数据类型: 数据类型及其子类都可以
    public static void printCollNew(ArrayList<? extends PersonNew> al)
    {
        Iterator<? extends PersonNew> it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().getName());
        }
    }
}

class PersonNew
{
    private String name;
    PersonNew(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}

class StudentNew extends PersonNew
{
    StudentNew (String name)
    {
        super(name);
    }
}

