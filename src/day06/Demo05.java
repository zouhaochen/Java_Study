package day06;

/*
静态代码块
格式：
static
{
    静态代码块中的执行语句
}
特点：随着类的加载而执行，只执行一次，并优先于主函数
用于给类进行初始化
 */

public class Demo05
{
    static
    {
        System.out.println("1");
    }

    public static void main(String[] args)
    {
        new StaticCode();
        new StaticCode();
        System.out.println("Finish");
    }

    static
    {
        System.out.println("2");
    }
}

class StaticCode
{
    static
    {
        System.out.println("Hello");
    }
}