package day07;

/*
将学生和公认的共性描述提取出来，单独进行描述
只要让学生和工人与单独描述的这个类有关系就可以

继承：
1. 提高了代码的复用性
2. 让类与类之间产生了关系，有了这个关系，才有了多态的特性

注意：千万不要为了获取其他类的功能简化代码而继承
必须是类与类之间有所属关系才可以继承（谁是谁中的一元或一种）

class A extends C
{
    //A与B之间没有继承关系
    //void demo1(){}
    void demo2(){}
}
class B extends C
{
    //void demo1(){}
    void demo3(){}
}
//A与B之间有共性
class C
{
    void demo1(){}
}

Java语言中：Java只支持但继承，不支持多继承
因为多继承容易带来安全隐患：
当多个父类中定义了相同功能，但功能内容不同时，子类对象不确定会运行哪一个
但是java保留了这种机制，并用另一种体现形式来完成表示：多实现

Java支持多层继承，也就是一个继承体系
如何使用一个继承体系中的功能？
想要使用体系，先查阅体系中父类的描述
因为父类中定义的是该体系中的共性功能
通过了解共性功能，就可以知道该体系的基本功能
那么这个体系已经可以基本使用了
在具体调用时，要创建最子类的对象
原因：
一是因为有可能父类不能创建对象
二是创建子类对象可以使用更多的功能，包括基本的也包括特有的

简单一句话：查阅父类功能，创建子类对象使用功能
 */
class Person
{
    private String name;
    Person(String name)
    {
        this.name = name;
    }
    int age;
}

//Student：子类，Person：父类，子类继承父类
class Student extends Person
{
    /*
    String name;
    int age;
    */
    Student(String name)
    {
        super(name);
    }
    void study()
    {
        System.out.println("Study");
    }
}

class Worker extends Person
{
    Worker(String name)
    {
        super(name);
    }
    /*
        String name;
        int age;
        */
    void work()
    {
        System.out.println("Work");
    }
}

public class Demo01 {
}
