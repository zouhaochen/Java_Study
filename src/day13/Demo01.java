package day13;

public class Demo01
{
    public static void main(String[] args)
    {
        String s = new String();

        /*
        s1是一个类类型变量
        "abc"是一个对象
        字符串最大的特点：一旦被初始化，就不可以被改变
         */
        String s1 = "abc";
        String s2 = new String("abc");
        /*
        s1和s2有什么区别？
        s1在内存中有一个对象
        s2在内存中有两个对象
         */
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); //比较内存地址值
        /*
        String类复写了Object类中equals方法
        该方法用于判断字符串是否相同
         */
    }
}
