package day19;

import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo20
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            int[] arr = new int[2];
            System.out.println(arr[3]);
        }
        catch (Exception e)
        {
            e.printStackTrace(System.out);
            System.out.println();

            e.printStackTrace(new PrintStream("a.text"));
            System.out.println();

            Date d = new Date();
            //将时间转换成可以看懂的形式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = sdf.format(d);

            PrintStream ps = new PrintStream("exception.log");
            //写入时间方法一
            ps.write(s.toString().getBytes());
            //写入时间方法二
            ps.println(s.toString());
            System.setOut(ps);
        }
    }
}

/*
log4j:日志信息创建
 */