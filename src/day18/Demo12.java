package day18;

import java.io.FileReader;
import java.io.IOException;

public class Demo12
{
    public static void main(String[] args) throws IOException
    {
        /*
        创建一个文件读取流对象，和指定名称的文件相关联
        要保证该文件是已经存在的，如果不存在会发生异常FileNotFindException
         */
        FileReader fr = new FileReader("demo.txt");

        /*
        调用读取流对象的read方法
        read方法一次读一个字符，而且会自动往下读
         */
        int ch = fr.read();
        System.out.println("ch="+(char)ch);

        /*
        循环读取所有字符的方法一
         */
        while(true)
        {
            int ch1 = fr.read();
            if(ch1==-1)
                break;
            System.out.println("ch="+(char)ch1);
        }

        /*
        循环读取所有字符的方法二
         */
        int ch2 = 0;

        while((ch2=fr.read())!=-1)
        {
            System.out.println((char)ch2);
        }


        fr.close();
    }
}
