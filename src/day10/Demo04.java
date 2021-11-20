package day10;

/*
有一个圆形和长方形
都可以获取面积，对于面积如果出现非法的数值，视为是获取面积出现的问题
问题通过异常来表示
先要对这个程序进行基本设计
 */

class NoValueException extends RuntimeException
{
    NoValueException(String message)
    {
        super(message);
    }
}

interface Shape
{
    void getArea();
}

class Rectangular implements Shape
{
    private int len, wid;

    Rectangular(int len, int wid)
    {
        if(len<=0 || wid<=0)
            throw new NoValueException("出现非法值");
        this.len = len;
        this.wid = wid;
    }

    public void getArea()
    {
        System.out.println(len*wid);
    }
}

class Circle implements Shape
{
    private int radius;
    public static final double pi = 3.1415926;

    Circle(int radius)
    {
        if(radius<=0)
            throw new NoValueException("非法");
        this.radius = radius;
    }

    public void getArea()
    {
        System.out.println(radius*radius*pi);
    }

}

class ExceptionTest1
{
    public static void main(String[] args) throws NoValueException
    {
        try
        {
            Rectangular r1 = new Rectangular(3, 4);
            r1.getArea();
        }
        catch (NoValueException e)
        {
            System.out.println(e.toString());
        }
        System.out.println();

        try
        {
            Rectangular r2 = new Rectangular(-3, 4);
            r2.getArea();
        }
        catch (NoValueException e)
        {
            System.out.println(e.toString());
        }
        System.out.println();

        Rectangular r3 = new Rectangular(-2,0);
        r3.getArea();
        System.out.println();

    }
}

public class Demo04 {
}
