package day20;

import java.io.*;

/*
File类
1. 用来将文件或者文件夹封装成对象
2. 方便对文件与文件夹的属性信息进行操作
3. File对象可以作为参数传递给流的构造函数
4. 了解File类中的常见方法
 */
public class Demo01
{
    public static void main(String[] args)
    {
        consMethod();
    }

    //创建File对象
    public static void consMethod()
    {
        //将a.txt封装成file对象，可以将已有的和未出现的文件或者文件夹封装成对象
        File f1 = new File("a.txt");

        /*
        父目录，目录下的文件名
        将目录和文件分开成两个参数来传递
        好处：任意其中一个可以换成变量
        File f2 = new File("c:\\abc", str);
         */
        File f2 = new File("c:\\abc", "b.txt");

        File d = new File("c:\\abc");
        File f3 = new File(d, "c.txt");

        sop("f1: "+f1);
        sop("f2: "+f2);
        sop("f3: "+f3);

        //目录分隔符separator
        File f4 = new File("c:"+File.separator+"abc.txt");
    }

    public static void sop(Object object)
    {
        System.out.println(object);
    }
}
