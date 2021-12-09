package Day18;

import java.io.FileWriter;
import java.io.IOException;

/*
IO(Input, Output)流
1. IO流用来处理设备之间的数据传输
2. Java对数据的操作是通过流的方式
3. Java用于操作流的对象都在IO包中
4. 流按操作数据分为两种: 字节流与字符流
5. 流按流向分为: 输入流，输出流

IO流常用基类
1. 字节流的抽象基类: InputStream, OutputStream
2. 字符流的抽象基类: Reader, Writer
3. 注: 由这四个类派生出来的子类名称都是以其父类名作为子类名的后缀
   如: InputStream的子类FileInputStream
   如: Reader的子类FileReader

字符流和字节流:

字节流两个基类:
InputStream
OutputStream

字符流两个基类:
Reader
Writer

先学习一下字符流的特点

既然IO流是用于操作数据的
那么数据的最常见体现形式是：文件
那么先以操作文件为主来演示
需求: 在硬盘上创建一个文件并写入一些文字数据
找到一个专门用于操作文件的Writer子类对象: FileWriter
后缀名是文件名，前缀名是该流对象的功能
 */
public class Demo09
{
    public static void main(String[] args) throws IOException
    {
        /*
        1.
        创建一个FileWriter对象，该对象一被初始化就必须要明确被操作的文件
        而且该文件会被创建到指定的目录下
        如果该目录下已有同名文件，将被覆盖
        其实该步就是在明确数据要存放的目的地
         */
        FileWriter fw = new FileWriter("demo.txt");

        /*
        2.
        调用Write方法，将字符串写入流中
         */
        fw.write("abcde");

        /*
        刷新流对象中的缓冲中的数据
        将数据刷新到目的地中
         */
        fw.flush();

        fw.write("hhhhh");
        fw.flush();

        /*
        关闭流资源，但是关闭之前会刷新一次内部的缓冲中的数据，将数据刷新至目的地中
        和flush的区别: flush刷新后流可以继续使用。close刷新后会将流关闭
         */
        fw.close();
    }
}
