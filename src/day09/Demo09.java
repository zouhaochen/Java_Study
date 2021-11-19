package day09;

/*
Exception中有一个特殊的子类异常RuntimeException运行异常
如果在函数内容抛出该异常，函数上可以不用声明，编译一样通过
如果在函数上声明了该异常，调用者可以不用进行处理，编译一样通过

之所以不用在函数上声明，是因为不需要让调用者处理
当该异常发生，希望程序停止，因为在运行时出现了无法继续运算的情况
希望停止程序后对代码进行修正

自定义异常时，如果该异常的发生无法继续进行运算
就让自定义异常继承RuntimeException

对于异常分为两种:
1. 编译时被检测的异常
2. 编译时不被检测的异常(运行时异常，RuntimeException以及其子类)
 */

class MinusExceptionNew extends RuntimeException
{
    MinusExceptionNew(String msg)
    {
        super(msg);
    }
}

class DemoNew
{
    int div(int a, int b)
    {

        if(b<0)
            throw new MinusExceptionNew("除数为负数了");

        if(b==0)
            throw new ArithmeticException("被零除了");
            return a/b;
    }
}

public class Demo09 {
    public static void main(String[] args) {
        DemoNew d = new DemoNew();

        int x = d.div(4, -10);
        System.out.println(x);
    }
}
