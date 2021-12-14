package Day21;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
RandomAccessFile

该类不算是IO体系中的子类
而是直接继承自Object

但是，它是IO包中的成员，因为它具备读和写功能
内部封装了一个数组，而且通过指针对数组中的元素进行操作
可以通过getFilePointer获取指针位置
同时可以通过seek改变指针的位置

其实完成读写的原理就是内部封装了字节输入流和输出流(byte数组)
通过构造函数可以看出，该类智能操作文件
而且操作文件还有模式
只读: r
读写: rw
等
如果模式为只读r，不会创建文件，会去读取一个已存在的文件。
如果该文件不存在，则会出现异常
如果模式为rw，那么操作的文件不存在，会自动穿件，如果存在则不会覆盖

而且该对象的构造函数要操作的文件不存在，会自动创建，如果存在，则不会覆盖
 */

public class Demo03
{
    public static void main(String[] args) throws IOException
    {
        writeFile();

        readFile();
    }

    public static void writeFile() throws IOException
    {
        RandomAccessFile raf = new RandomAccessFile("ran.txt", "rw"); //rw:读写模式

        raf.write("李四".getBytes());
        //操作基本数据类型写Int，否则传的是二进制结果，会丢失数据
        raf.writeInt(97);

        raf.write("王五".getBytes());
        //操作基本数据类型写Int，否则传的是二进制结果，会丢失数据
        raf.writeInt(100);

        raf.close();
    }

    public static void readFile() throws IOException
    {
        RandomAccessFile raf = new RandomAccessFile("ran.txt", "r"); //r:读取模式

        /*
        raf.write("haha".getBytes());
        拒绝访问，模式只读，要调用写方法
        定义成只读会屏蔽掉写动作
         */

        byte[] buf = new byte[4];

        raf.read(buf);

        String name = new String(buf);

        System.out.println("name="+name);

        int age =  raf.readInt();

        System.out.println("name="+age);



        /*
        怎么读王五数据？
        调整对象中的指针
         */
        raf.seek(8); //从第八位开始往后取

        /*
        skipBytes: 跳过指定的字节数
         */
        raf.skipBytes(8); //只能向下跳过，不能往回跳

        raf.close();
    }

    public static void writeFileNew() throws IOException
    {
        RandomAccessFile raf = new RandomAccessFile("ran.txt", "rw");

        //将内容写到指定位置
        raf.seek(8*3);

        //将第一个内容修改为周七
        raf.seek(8*0);

        raf.write("周七".getBytes());
        //操作基本数据类型写Int，否则传的是二进制结果，会丢失数据
        raf.writeInt(103);

        raf.close();
    }
}
