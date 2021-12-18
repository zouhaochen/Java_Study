package day17;

/*
JDK 1.5版本出现的新特性

方法的可变参数
在使用时注意：可变参数一定要定义在参数列表最后面
 */
public class Demo09
{
    public static void main(String[] args)
    {
        show(3, 4);
        System.out.println();

        /*
        可变参数
        其实就是上一种数组岑书的简写形式
        不用每一次都手动的建立数组对象
        只要将要操作的元素作为参数传递即可
        隐式的将这些参数封装成了数组
         */
        show(2);
        show(2, 3, 4, 4 , 5, 6);
        show();
    }

    public static void show(int a, int b)
    {
        System.out.println(a+", "+b);
    }

    public static void show(int ... arr)
    {
        System.out.println(arr.length);
    }
}
