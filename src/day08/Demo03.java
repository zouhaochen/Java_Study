package day08;

class Fu
{
    static int num1 = 10;
    int num = 5;
    void method1()
    {
        System.out.println("fu method1");
    }
    void method2()
    {
        System.out.println("fu method2");
    }
    static void method4()
    {
        System.out.println("fu method4");
    }
}

class Zi extends Fu
{
    static int num1 = 2;
    int num = 8;
    void method1()
    {
        System.out.println("zi method1");
    }
    void method3()
    {
        System.out.println("zi method3");
    }
    static void method4()
    {
        System.out.println("zi method4");
    }
}

public class Demo03 {
    public static void main(String[] args)
    {
        Zi z = new Zi();
        z.method1();
        z.method2();
        z.method3();

        /*
        在多态中成员函数的特点：
        在编译时期：
        参阅引用型变量所属的类中是否有调用的方法
        如果有，编译通过
        如果没有，编译失败
        在运行时期：
        参阅对象所属的类中是否有调用的方法
        简单总结就是：成员函数在多态调用时，编译看左边，运行看右边
         */
        Fu f = new Zi();
        f.method1();
        f.method2();
        System.out.println(f.num);
        f.method4();
        System.out.println(f.num1);

        Zi z2 = new Zi();
        System.out.println(z2.num);
        z2.method4();

        /*
        在多态中成员变量的特点(非静态)：
        无论编译和运行都参考左边（引用型变量所属的类）

        在多态中静态成员函数的特点：
        无论编译和运行都参考左边
         */
    }
}
