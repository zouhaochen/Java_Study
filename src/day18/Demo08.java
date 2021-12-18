package day18;

//保留两位小数
public class Demo08
{
    public static void main(String[] args)
    {
        double d = 12.3456;
        show(d);
    }
    public static void show(double d)
    {
        System.out.println(String.format("%.2f", d));
    }
}
