package day02;

public class Demo02 {
    public static void main(String[] args) {

        //类型转换: 强制类型转换
        byte b = 3;
        b = (byte) (b + 3);
        System.out.println(b);

        /*
        强制类型转换用途：
        运算结果为小数
        想把结果只保留整数部分：3.14只保留3，将结果强制转换成int
         */

        System.out.println('a' + 1);
        System.out.println((char) ('a' + 1));
        System.out.println('1' + 0);
        System.out.println((char) (5));

        /*
        char类型可以进行运算：字符在ASCII码表中都有对应的数字
         */
    }
}
