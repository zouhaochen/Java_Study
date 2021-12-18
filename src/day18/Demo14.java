package day18;

import java.io.FileReader;
import java.io.IOException;

/*
读取一个.java文件，并打印在控制台上
java文件是文本文件，文本文件可以使用字符流：专门用于处理文本数据的对象
 */
public class Demo14
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("Hello.java");

        char[] buf = new char[1024];
        int num = 0;
        while((num = fr.read(buf))!=-1)
        {
            System.out.println(new String(buf, 0, num));
        }

        fr.close();
    }
}
