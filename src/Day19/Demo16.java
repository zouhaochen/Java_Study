package Day19;

import java.io.*;

/*
通过刚才的键盘录入一行数据并打印其大写发现，其实就是读一行数据的原理
也就是readLine方法

能不能直接使用readLine方法来完成键盘录入的一行数据的读取呢？

readLine方法是字符流BufferReader类中的方法
而键盘录入的read方法是字节流InputStream的方法

那么能不能将字节流转换成字节流，再使用字符流缓冲区的readLine方法呢？
 */
public class Demo16
{
    public static void main(String[] args) throws IOException
    {
        //获取键盘录入对象
        InputStream in = System.in;

        //将字节流对象转成字符流对象，使用转换流InputStreamReader
        InputStreamReader isr = new InputStreamReader(in);

        //为了提高效率将字符流进行缓冲区技术高效操作。使用BufferedReader
        BufferedReader bufr = new BufferedReader(isr);

        //上面三句话变成一句
        //键盘录入最常见写法
        BufferedReader bufrNew = new BufferedReader(new InputStreamReader(System.in));

        OutputStream out = System.out;

        OutputStreamWriter osw = new OutputStreamWriter(out);

        BufferedWriter bufw = new BufferedWriter(osw);

        //上面三句话变成一句
        BufferedWriter bufwNew = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = null;

        while((line=bufr.readLine())!=null)
        {
            if("over".equals(line))
                break;

            /*
            System.out.println(line.toUpperCase());
             */

            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }

        bufr.close();
    }
}
