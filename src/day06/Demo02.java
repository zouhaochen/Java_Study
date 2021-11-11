package day06;

/*
主函数是一个特殊的函数，作为程序的入口，可以被jvm调用
主函数的定义: public static void main
public: 代表着该函数的访问权限是最大的
static: 代表着主函数随着类的加载就已经存在
void: 对主函数没有具体的返回值
main: 不是关键字，但是是一个特殊的单词，可以被JVM识别
(String[] arr): 参数类型是一个数组，该数组中的元素是字符串，字符串类型数组
args: arguments

主函数是固定格式的：jvm识别
jvm在调用主函数时，传入的是new String[0]
 */
public class Demo02
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        //虚拟机向主函数中传入一个数组
        System.out.println(args);
        System.out.println(args.length);

        String[] arr = {"Mike"};
        MainTest.main(arr);
    }

    //可以执行，主函数被重载
    public static void main(int x)
    {
        System.out.println("Hello World!");
    }
}

class MainTest
{
    public static void main(String[] args)
    {
        for(int x = 0; x < args.length; x++)
            System.out.println(args[x]);
    }
}
