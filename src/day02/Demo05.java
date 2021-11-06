package day02;

public class Demo05 {
    public static void main(String[] args) {

        //把右边赋值给左边
        int x = 3;

        //+= -= *= /= %=
        //把左右两边的和赋值给左边
        //x += 4 -> x = x + 4
        x += 4;
        System.out.println(x);

        short s = 4;
        //s = s + 5; 编译失败不可以运行，运行了两次，先做加法在做赋值，自动提升
        //一次赋值运算，内部有自动转换动作
        s += 5;
        System.out.println(s);

        int a, b, c;
        a = b = c = 5;
        System.out.println(a+""+b+""+c);

        //比较运算符的值要么是真要么是假
        System.out.println(3 > 4);
        System.out.println(3 == 4);
        System.out.println(3 != 4);
    }
}
