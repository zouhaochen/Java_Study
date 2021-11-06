package day02;

public class Demo03 {
    public static void main(String[] args) {

        //结果：4000
        int x = 4270;
        x = x / 1000 * 1000;
        System.out.println(x);

        //%：取模，取余数
        System.out.println(10%4);

        //定义了两个变量a，b，a已经被赋值为3，b未被赋值。只有被复制了的变量才可以被使用，b无法被使用。
        int a = 3, b, c;
        b = a ++;
        c = ++a;
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        /*
        a ++: 给a这个变量中的值进行一次+1操作，并把+1操作后的值重新赋给a
        a ++ -> a = a + 1
        b = a ++：运算顺序：先把a的值进行赋值运算赋给b，然后a再自增。
        b = ++a：先自增再赋值
         */

        //字符串连接：字符串数据和任何数据使用+都是相连接，最终都会变成字符串
        System.out.println("He" + "llo");
        System.out.println("5+5="+5+5);
        System.out.println("5+5="+(5+5));

        //分别打印a与b的值
        System.out.println(a+","+b);
        System.out.println(a+b);
        System.out.println("a="+a+", "+"b="+b);
    }
}
