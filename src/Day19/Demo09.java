package Day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
字符流:
操作文本
FileReader
FileWriter

BufferedReader
BufferedWriter

字节流:
InputStream(读)
OutputStream(写)
操作图片
需求:
想要操作图片数据，这时就要用到字节流

FileInputStream
FileOutputStream

BufferedInputStream
BufferedOutputStream
 */
public class Demo09
{
    public static void main(String[] args) throws IOException
    {
        writeFile();
        readFile_1();
        readFile_2();
        readFile_3();
    }

    public static void writeFile() throws IOException
    {

        FileOutputStream fos = new FileOutputStream("fos.txt");

        fos.write("abcde".getBytes());
        fos.close();
    }

    public static void readFile_1() throws IndexOutOfBoundsException, IOException
    {
        FileInputStream fis = new FileInputStream("fos.txt");

        int ch = 0;
        while((ch=fis.read())!=-1)
        {
            System.out.println((char)ch);
        }
        fis.close();
    }

    public static void readFile_2() throws IndexOutOfBoundsException, IOException
    {
        FileInputStream fis = new FileInputStream("fos.txt");

        byte[]buf = new byte[1024];
        int len = 0;
        while((len=fis.read(buf))!=-1)
        {
            System.out.println(new String(buf,0,len));
        }
        fis.close();
    }

    public static void readFile_3() throws IndexOutOfBoundsException, IOException
    {
        FileInputStream fis = new FileInputStream("fos.txt");

        //定义一个刚刚好的缓冲区，不用再循环
        byte[]buf = new byte[fis.available()];

        fis.read(buf);
        System.out.println(new String(buf));
        fis.close();
    }
}
