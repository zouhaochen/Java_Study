package day19;

import java.io.*;

/*
演示mp3的复制，通过缓冲区
BufferedOutputStream
BufferedInputStream
 */
public class Demo11
{
    public static void main(String[] args) throws IOException
    {
        copy_1();
    }

    //通过字节流的缓冲区完成复制
    public static void copy_1() throws IOException
    {
        BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("c:\\0.mp3"));
        BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("c:\\1.mp3"));

        int by = 0;
        while((by=bufis.read())!=-1)
        {
            bufos.write(by);
        }

        bufos.close();
        bufis.close();
    }
}
