package day09;

/*
匿名内部类：
1. 匿名内部类其实就是内部类的简写格式
2. 定义匿名内部类的前提：
   内部类必须是继承一个类或者实现接口
3. 匿名内部类的格式:
   new 父类或者接口(){定义子类的内容}
4. 其实匿名内部类就是一个匿名子类对象
   可以理解为带内容的对象
5. 匿名内部类中定义的方法最好不要超过3个
 */

abstract class AbsDemo
{
    abstract void show();
}

class Outer2
{
    int x = 3;

    /*
    class Inner2 extends AbsDemo
    {

        void show()
        {
            System.out.println("method:"+x);
        }
    }
     */

    public void function()
    {
        /*
        new Inner2().show();
         */

        //匿名内部类
        new AbsDemo()
        {
            void show()
            {
                System.out.println("x="+x);
            }

            void method()
            {
                System.out.println("method");
            }

        }.show();

        //匿名对象只能调用一次功能
        new AbsDemo()
        {
            void show()
            {
                System.out.println("x="+x);
            }

            void method()
            {
                System.out.println("method");
            }

        }.method();

        AbsDemo d = new AbsDemo()
        {
            void show() {
                System.out.println("x="+x);
            }

            void method()
            {
                System.out.println("method");
            }
        };
        d.show();
        /*
        父类中没有method，不能使用子类方法
        编译失败
        d.method();
         */
    }
}

public class Demo03 {
    public static void main(String[] args) {
        new Outer2().function();
    }
}
