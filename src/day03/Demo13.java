package day03;

public class Demo13 {
    public static void main(String[] args) {
        //元素类型[] 数组名 = new(用于在内存中产生一个容器实体) 元素类型 [元素个数或数组长度];
        //需求：想定义一个可以存储3个整数的容器
        int [] x = new int [3];
        x [0] = 59;

        //打印数组中脚标为0的元素的值
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);

        //x不再指向数组而是值为空
        x = null;
    }
}
