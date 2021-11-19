package day09;

/*
对多异常的处理
1. 声明异常时，建议声明更为具体的异常，这样处理得可以更具体
2. 对方声明几个异常，就对应有几个catch块
   如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面
   不要定义多余的catch块

建议在进行catch处理时，catch中一定要定义具体处理方式
不要简单定义一句e.printStackTrace()
也不要简单的书写一条输出语句
 */
class DemoException
{
    //在功能上通过throws的关键字声明了该功能有可能会出现问题
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException
    {
        int[] arr = new int[a];
        System.out.println(arr[4]);
        return a/b;
    }
}

public class Demo07 {
    public static void main(String[] args)
    {
        DemoException d = new DemoException();
        try
        {
            int x = d.div(4,0);
            System.out.println("x="+x);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }
    }

}
