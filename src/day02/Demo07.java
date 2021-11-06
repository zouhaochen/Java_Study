package day02;

public class Demo07 {
    public static void main(String[] args) {

        //对两个整数变量的值进行互换
        int n = 3, m = 8;
        System.out.println("n="+n+", m="+m);

        //1.通过第三方变量
        int temp;
        temp = n;
        n = m;
        m = temp;
        System.out.println("n="+n+", m="+m);

        //2.不用第三方变量
        n = n + m;
        m = n - m;
        n = n - m;
        System.out.println("n="+n+", m="+m);
        //如果n和m的值非常大，容易超出int范围

        n = n ^ m;
        m = n ^ m; //(n ^ m) ^ m
        n = n ^ m; //(n ^ m) ^ n
        System.out.println("n="+n+", m="+m);

    }
}
