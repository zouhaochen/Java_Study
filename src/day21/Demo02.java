package day21;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
IO包中的其他类
1. RandomAccessFile
   随机访问文件，自身具备读写的方法
   通过skipBytes(int x), seek(int x)来达到随机访问

2. 管倒流
   PipedInputStream和PipedOutputStream
   输入输出可以直接进行连接，通过结合线程使用
 */
public class Demo02
{
    public static void main(String[] args) throws IOException
    {
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();
        in.connect(out);

        Read r = new Read(in);
        Write w = new Write(out);

        new Thread(r).start();
        new Thread(w).start();
    }
}

class Read implements Runnable
{
    private PipedInputStream in;
    Read(PipedInputStream in)
    {
        this.in = in;
    }

    public void run()
    {
        try
        {
            byte[] buf = new byte[1024];

            int len = in.read(buf);

            String s = new String(buf, 0, len);

            System.out.println(s);

            in.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException("管道读取流失败");
        }
    }

}

class Write implements Runnable
{
    private PipedOutputStream out;
    Write(PipedOutputStream out)
    {
        this.out = out;
    }

    public void run()
    {
        try
        {
            out.write("管道来了".getBytes());
            out.close();
        }
        catch(IOException e)
        {
            throw new RuntimeException("管道输出流失败");
        }
    }
}