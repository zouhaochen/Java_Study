package day05;

/*
构造函数对象一建立就会调用与之对应的构造函数
构造函数的作用：可以用于给对象进行初始化

构造函数的小细节：
当一个类中没有定义构造函数时，那么系统会默认给该类加入一个空参数的构造函数，方便于该类进行初始化
当在类中自定义了构造函数后，默认的构造函数会消失

构造函数和一般函数在写法上有不同
在运行上也有不同：
构造函数是在对象一建立就运行，给对象初始化
而一般方法是对象调用才执行，是给对象添加对象具备的功能

一个对象建立，构造函数之运行一次
而一般方法可以被该对象调用多次

什么时候定义构造函数呢？
当分析事物时，该事物存在就预备一些特性或行为，那么将这些内容定义在构造函数中
构造函数在进行定义时需不需要未知内容参与运算？需要就定义参数
 */
class PersonNew
{
    private String name;
    private int age;

    /*
    构造代码块
    作用：给对象进行初始化
    对象一建立就运行，而且优先于构造函数执行
    和构造函数的区别：
    构造代码块是给所有对象进行统一初始化
    而构造函数是给对应的对象初始化
    构造代码块定义不同对象共性的初始化内容
     */
    {
        System.out.println("Person Code Run");
    }

    //构造函数可以被私有化
    //如果一个类中所有的构造函数都私有化了，就说明这个类不可能创建对象
    PersonNew()
    {
        System.out.println("A: name="+name+", age="+age);
        cry();
    }

    PersonNew(String name)
    {
        /*
        this:看上去，是用于区分局部变量和成员变量同名的情况
        this为什么可以解决这个问题呢？
        this到底代表的是什么呢？
        this: 就代表本类的对象，代表哪一个呢？
        this代表它所在函数所属对象的引用
        简单说：哪个对象在调用this所在的函数，this就代表哪个对象
         */
        this.name = name;
        System.out.println("B: name="+name+", age="+age);
        cry();
    }

    PersonNew(String name, int age)
    {
        /*
        this.name = name;
        上面已经有结果了
         */

        /*
        this语句：用于构造函数之间进行互相调用
        this(name) = p(name)
        this语句只能定义在构造函数的第一行，因为初始化动作要先执行
        一般函数是不能直接调用构造函数的
        this语句不能用于一般函数，只能在构造函数间
         */
        this(name);
        this.age = age;
        System.out.println("C: name="+this.name+", age="+this.age);
        cry();
    }

    PersonNew(int age)
    {
        this.age = age;
    }
    public void cry()
    {
        System.out.println("cry");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void speak()
    {
        System.out.println("name="+this.name+", age="+this.age);
        this.show();
    }

    public void show()
    {
        System.out.println(this.name);
    }

    /*
    需求：给人定义一个用于比较年龄是否相同的功能，也就是是否是同龄人

    this的应用：当定义类中功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象
    但凡本类功能内部使用了本类对象，都用this表示
     */
    public boolean compare(PersonNew p)
    {
        /*
        if(this.age == p.age)
        {
            return true;
        }
        else
            return false;
         */
        return this.age == p.age;
    }
}

public class Demo03
{
    public static void main(String[] args)
    {
        PersonNew p1 = new PersonNew();
        PersonNew p2 = new PersonNew("Mike");
        PersonNew p3 = new PersonNew("Frank",10);
        p1.cry();
        p2.cry();
        p3.cry();
        System.out.println(p2.getName());
        p2.setName("Jack");
        System.out.println(p2.getName());
        p2.speak();

        PersonNew p4 = new PersonNew(20);
        PersonNew p5 = new PersonNew(25);
        boolean b = p4.compare(p5);
        System.out.println(b);

    }
}
