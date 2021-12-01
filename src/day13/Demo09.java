package day13;

/*
JDK 1.5 版本以后出现的新特性
 */
public class Demo09
{
    public static void main(String[] args)
    {
        Integer x1 = new Integer(4);
        Integer x2 = 4; //自动装箱

        x1 = x2 + 4;    //自动拆箱
        System.out.println(x1);

        Integer m = 128;
        Integer n = 128;
        System.out.println(m==n);

        Integer a = 127;
        Integer b = 127;
        System.out.println(a==b);
        /*
        因为a和b指向了同一个Integer对象
        因为当数值在byte范围内时，对于新特性
        如果该数值已经存在，则不会再开辟新的空间
         */
    }

}
