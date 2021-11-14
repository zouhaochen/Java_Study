package day07;

/*
子父类出现后，类中成员的特点
类中成员：
1. 变量
2. 函数
3. 构造函数

1. 变量
如果子类中出现非私有的同名成员变量时
子类要访问本类中的变量，用this
子类要访问父类中的同名变量，用super

super的使用和this的使用几乎一致
this代表的是本类对象的引用
super代表的是父类对象的引用

如果不加this则访问父类中的同名变量（父类中同名变量未private）
如果this后的变量子类中没有而父类中有，则访问父类中的变量

2. 函数
当子类出现和父类一模一样的函数时
当子类对象调用该函数，会运行子类函数的内容
如同父类的函数被覆盖一样
这中情况是函数的另一个特性：重写（覆盖）

当子类继承父类，沿袭了父类的功能，到子类中
但是子类虽具备该功能，但是功能的内容却和父类不一致
这时没有必要定义新功能，而是使用覆盖特性，保留父类的功能定义并重写父类的功能

覆盖：
1. 子类覆盖父类，必须保证子类权限大于等于父类权限，才可以覆盖，否则编译失败
2. 静态只能覆盖静态

记住：
重载：只看同名函数的参数列表
重写：子父类方法要相同

3. 子父类中的构造函数
在对子类对象进行初始化时，父类的构造函数也会运行
因为子类的构造函数默认第一行有一条隐式语句: super();
super():会访问父类中空参数的构造函数，而且子类中所有的构造函数默认第一行都是super()

为什么子类一定要访问父类中的构造函数？
因为父类中的数据子类可以直接获取，所以子类对象在建立时，需要先查看父类是如何对这些数据进行初始化的
所以子类在对象初始化时，要先访问一下父类中的构造函数
如果要访问父类中指定的构造函数，可以通过手动定义super语句来指定

super语句一定定义在子类构造函数的第一行

子类的实例化过程
结论：
子类的所有的构造函数，默认都会访问父类中空参数的构造函数
因为子类每一个构造函数内的第一行都有一句隐式super()
当父类中没有空参数的构造函数时，子类必须手动通过super语句形式来指定要访问的构造函数
当然，子类的构造函数第一行也可以手动指定this语句来访问本类中的构造函数
子类中至少会有一个构造函数会访问父类中的构造函数

父类中也有super()，找的是父类的父类
extends Object是所有类的父类
 */
class Fu
{
    int num1 = 4;
    int num = 4;
    void show3()
    {
        System.out.println("fu show");
    }
    void show5()
    {
        System.out.println("same show fu");
    }
    void speak()
    {
        System.out.println("vb");
    }

    Fu()
    {
        System.out.println("fu run");
    }
}

class Zi extends Fu
{
    int num2 = 5;
    int num = 5;
    void show1()
    {
        //打印5
        System.out.println(this.num);
    }
    void show2()
    {
        //打印4
        System.out.println(super.num);
    }
    void show4()
    {
        System.out.println("zi show");
    }
    void show5()
    {
        System.out.println("same show zi");
    }
    void speak()
    {
        System.out.println("java");
    }

    Zi()
    {
        /*
        this():调用本类中的构造函数
        super():调用父类构造函数
        子类构造函数不写默认含有
         */
        System.out.println("zi run");
    }

    Zi(int x)
    {
        System.out.println("x="+x);
    }
}

class Telephone
{
    void show()
    {
        System.out.println("number");
    }
    void sound()
    {
        System.out.println("music");
    }
}

class NewTelephone extends Telephone
{
    void show()
    {
        /*
        System.out.println("number");
        */
        super.show();
        System.out.println("name");
        System.out.println("picture");
    }
}

public class Demo02 {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z.num1+", "+z.num2);
        z.show3();
        z.show4();
        z.show5();
        z.speak();

        Zi z1 = new Zi(4);
    }
}
