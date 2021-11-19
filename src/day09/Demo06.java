package day09;

/*
异常就是程序在运行时出现的不正常情况
异常由来:
问题也是现实生活中一个具体的事物，也可以通过java的类的形式进行描述，并封装成对象
其实就是java对不正常情况进行描述后的对象体现
对于问题的划分:
两种:
一种是严重的问题，一种是非严重的问题
对于严重的问题: java通过ERROR类进行描述
对于非严重的问题: java通过Exception类进行描述
 */
class Demo
{
    int div(int a, int b)
    {
        return a/b;
    }
}

public class Demo06 {
    public static void main(String[] args) {
        Demo d = new Demo();
        int x = d.div(4, 2);
        System.out.println(x);
    }
}
