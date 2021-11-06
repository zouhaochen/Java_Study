package day02;

public class Demo01 {
    public static void main(String[] args) {
        //定义变量的格式
        //数据类型 变量名 = 初始化值
        //定义一个int类型变量，取值为4
        int x = 4;
        System.out.println(x);
        //重用
        x = 10;
        System.out.println(x);

        //演示其他数据类型
        // -128~127
        byte b = 2;
        System.out.println(b);
        short s = 30000;
        System.out.println(s);
        long l = 4l;
        System.out.println(4l);
        float f = 2.3f;
        System.out.println(f);
        double d = 34.56;
        System.out.println(d);

        char ch = '4';
        char ch1 = 'a';
        char ch2 = '+';
        char ch3 = ' ';
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

        boolean bo = true;
        boolean bo1 = false;

        /*
        什么时候定义变量？
        当数据不确定的时候，需要对数据进行存储时，
        就定义一个变量来完成存储操作。
         */
        int a = 5;
        a = a + 6;
        System.out.println(a);
    }
}
