package Day19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
字符流读取流缓冲区

该缓冲区提供了一个一次读一行的方法：readLine，方便于对文本数据的获取
当返回null时，表示读到文件末尾
readLine返回的是一行中的有效数据，不包含回车
 */
public class Demo02
{
    public static void main(String[] args) throws IOException
    {
        //创建一个读取流对象和文件相关联
        FileReader fr = new FileReader("buf.txt");

        //为了提高效率，加入缓冲技术，将字符读取流对象作为参数传递给缓冲对象的构造函数
        BufferedReader bufr = new BufferedReader(fr);

        //读取一行数据
        String s1 = bufr.readLine();

        //循环读取所有数据
        String line = null;
        while((line = bufr.readLine())!=null)
        {
            System.out.println(line);
        }

        System.out.println("s1: "+s1);
        bufr.close();
    }
}
