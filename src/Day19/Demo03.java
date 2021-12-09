package Day19;

import java.io.*;

/*
通过缓冲区读取一个.java文件
 */
public class Demo03
{
    public static void main(String[] args)
    {
        BufferedReader bufr = null;
        BufferedWriter bufw = null;

        try
        {
            bufr = new BufferedReader(new FileReader("Demo.java"));
            bufw = new BufferedWriter(new FileWriter("DemoCopy.java"));

            String line = null;
            while((line=bufr.readLine())!=null)
            {
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        }
        catch(IOException e)
        {
            throw new RuntimeException("读写失败");
        }
        finally
        {
            try
            {
                if(bufr!=null)
                {
                    bufr.close();
                }
            }
            catch(IOException e)
            {
                throw new RuntimeException("读取关闭失败");
            }
            try
            {
                if(bufw!=null)
                {
                    bufw.close();
                }
            }
            catch(IOException e)
            {
                throw new RuntimeException("写入关闭失败");
            }
        }
    }
}
