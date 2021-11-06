package day02;

public class Demo08 {
    public static void main(String[] args) {

        int x = 3;

        if (x > 1)
        {
            System.out.println("Yes");
        }
        System.out.println("Over");

        int y = 1;

        if (y > 1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        /*
        if else 结构 简写格式：变量 = （条件表达式）？表达式1：表达式2；
        三元运算符：
        好处：可以简化if else代码
        弊端：因为是一个运算符，所以运算完必须要有一个结果
         */

        int n = 3;

        if (n > 1)
            System.out.println("a");
        else if (n > 2)
            System.out.println("b");
        else if (n > 3)
            System.out.println("c");
        else
            System.out.println("d");

        if (n > 1)
            System.out.println("a");
        if (n > 2)
            System.out.println("b");
        if (n > 3)
            System.out.println("c");
        else
            System.out.println("d");
    }
}
