package day13;

/*
基本数据类型对象包装类

byte    Byte
short   Short
int     Integer
long    Long
boolean Boolean
float   Float
double  Double
char    Character

基本数据类型对象包装类的最常见作用
就是用于基本数据类型和字符串类型之间做转换

基本数据类型转成字符串
    基本数据类型+”“
    基本数据类型.toString(基本数据类型值);
    如:
    Integer.toString(34);   //将34整数变成”34“;

字符串转成基本数据类型
    xxx a = XXX.parseXXX(String);
    int a = Integer.parseInt("123");
    double d = Double.parseDouble("12.345");
    boolean b = Boolean.parseBoolean("true");

    Integer i = new Integer("123");
    int num = i.intValue();

十进制转成其他进制
    toBinaryString();
    toHexString();
    toOctalString();
其他进制转成十进制
    parseIng(string, radix);
 */
public class Demo08
{
    public static void sop(String str)
    {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        //整数类型的最大值
        sop("int max:"+Integer.MAX_VALUE);
        System.out.println();

        int num = Integer.parseInt("123");
        sop("num="+(num+4));
        //必须传入数字格式的字符串

        long x = Long.parseLong("123");
        sop("long="+(x+5));
        System.out.println();

        sop(Integer.toBinaryString(-6));
        sop(Integer.toHexString(60));

        int x1 = Integer.parseInt("110",2);
        sop("x1: "+x1);

        Integer x2 = new Integer("123");
        Integer y = new Integer(123);
        sop("x==y: "+(x2==y));
        sop("x.equals(y): "+x2.equals(y));
    }
}
