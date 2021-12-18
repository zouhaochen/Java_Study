package day18;

import java.io.FileReader;
import java.io.IOException;

/*
第二种方式: 通过字符数组进行读取
 */
public class Demo13
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("demo.txt");

        /*
        定义一个字符数组，用于存储读到字符
        该read(char[])返回的是读到的字符个数
         */
        char[] buf = new char[3];
        int num = fr.read(buf);
        System.out.println("num="+num+", "+new String(buf));

        fr.close();

        char[] buf1 = new char[1024];
        //循环获取所有字符
        int num1 = 0;
        while((num=fr.read(buf))!=-1)
        {
            System.out.println(new String(buf1, 0, num1));
        }
    }
}
