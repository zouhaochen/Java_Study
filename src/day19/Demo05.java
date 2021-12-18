package day19;

/*
装饰设计模式:
当想要对已有的对象进行功能增强时
可以定义类将以有对象传入，基于已有对象的功能，并提供加强功能
那么自定义的该类就称为装饰类

装饰类通常会通过构造方法接收被装饰的对象
并基于被装饰的对象提供更强大的功能
 */
public class Demo05
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.eatFood();
        System.out.println();

        SuperPerson sp = new SuperPerson(p);
        sp.superEatFood();
    }
}

class Person
{
    public void eatFood()
    {
        System.out.println("吃饭");
    }
}

class SuperPerson
{
    private Person p;
    //传入增强的对象
    SuperPerson(Person p)
    {
        this.p = p;
    }
    public void superEatFood()
    {
        System.out.println("喝酒");
        /*
        System.out.println("吃饭");
         */
        p.eatFood();
        System.out.println("甜点");
        System.out.println("抽烟");
    }
}