package day08;

/*
Object: 是所有对象的直接或者间接父类
该类中定义的是所有对象都具备的功能

Object中已经提供了对对象是否相同的比较方法
如果自定义类中也有比较相同的功能，没有必要重新定义
只要沿袭父类中的功能，建立自己特有的比较内容即可
这就是覆盖
 */

class Demo //extends Object
{
    private int num;
    Demo (int num)
    {
        this.num = num;
    }

    /*
    public boolean compare(Demo d)
    {
        return this.num == d.num;
    }
     */

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Demo))
            return false;
        Demo d = (Demo)obj;
        return this.num == d.num;
    }
}

class Person
{
}

public class Demo06
{
    public static void main(String[] args)
    {
        /*
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = d1;

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d1 == d2);
        System.out.println(d1 == d3);

        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.equals(p2));
         */

        Demo d4 = new Demo(6);
        Demo d5 = new Demo(10);
        System.out.println(d4.equals(d5));

        Person p1 = new Person();
        System.out.println(p1.equals(d5));
        System.out.println(p1.toString());
    }
}
