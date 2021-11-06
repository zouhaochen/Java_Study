package day03;

public class Demo09 {

    public static void main(String[] args) {

        int x = 4;
        System.out.println(x*3+5);

        x = 6;
        System.out.println(x*3+5);

        int result =  getResult(4);
        System.out.println(result);

        showResult(4);
        displayResult(4);
    }
    //发现以上的运算因为获取不同数据的运算结果代码出现了重复，
    //为了提高代码的复用性，对代码进行了抽取，
    //将这个部分定义成一个独立的功能，方便日后使用。
    //Java中对功能的定义是通过函数的形式来体现的。
    //需要定义功能，完成一个整数的*3+5的运算，并打印结果

    //1. 先明确函数定义的格式。
    /*
    修饰符 返回值类型 函数名 （参数类型 形式参数1，参数类型 形式参数2，......）
    ｛
          执行语句
          return 返回值；
    ｝
    当函数运算后没有具体的返回值时，这时返回值类型用一个特殊的关键字来标识
    该关键字就是void，void代表的是函数没有具体返回值的情况
    当函数的返回值类型是void时，函数中的return可以省略不写
     */

    public static int getResult (int num)
    {
        return num * 3 + 5;
    }

    public static void showResult (int num)
    {
        System.out.println(num*3 + 5);
    }

    public static void displayResult (int num)
    {
        System.out.println(num*3 + 5);
        return;
    }
}
