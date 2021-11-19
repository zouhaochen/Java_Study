package day09;

/*
内部类定义在局部时：
1. 不可以被成员修饰符修饰
2. 可以直接访问外部类中的成员，因为还持有外部类中的引用
   但是不可以访问它所在的局部中的变量，只能访问被final修饰的局部变量
 */
class Outer1
{
    int x = 3;

    void method()
    {
        //从内部类中访问局部变量，需要被声明为最终类型
        final int y = 4;

        //局部内部类不能定义成静态
        //因为静态是成员修饰符
        class Inner1
        {
            void function()
            {
                System.out.println(Outer1.this.x);
                System.out.println(y);
            }
        }

        new Inner1().function();

    }

    void method(final int a)
    {
        class Inner1
        {
            void function()
            {
                System.out.println(a);
            }
        }

        new Inner1().function();

    }
}

public class Demo02 {
    public static void main(String[] args) {
        new Outer1().method();
        System.out.println();

        new Outer1().method(7);
        System.out.println();

        Outer1 out = new Outer1();
        //进栈出栈
        out.method(9);
        //进栈出栈
        out.method(8);

    }
}
