package day11;

/*
练习：
创建两个线程，和主线程交替运行

线程都有自己默认的名称
Thread-编号 该编号从0开始

static Thread CurrentThread(): 获取当前线程对象
getName()：获取线程名称

设置线程名称：setName或者构造函数

 */

class Test extends Thread
{
    Test()
    {

    }
    Test(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println(this.getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println((Thread.currentThread()==this));
    }
}

public class Demo02
{
    public static void main(String[] args)
    {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.start();
        t2.start();

        Test t3 = new Test("Three");
        Test t4 = new Test("Four");
        t3.start();
        t4.start();

    }
}
