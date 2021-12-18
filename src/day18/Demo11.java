package day18;

import java.io.FileWriter;
import java.io.IOException;

/*
演示对已有文件的数据续写
 */
public class Demo11
{
    public static void main(String[] args)
    {
        //传递一个true参数，代表的是不覆盖已有的文件，并在已有文件的末尾处进行数据的续写
        FileWriter fw = null;
        try
        {
            fw = new FileWriter("Demo.txt", true);
            fw.write("haha");
        }
        catch (IOException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            try
            {
                if(fw!=null)
                    fw.close();
            }
            catch (IOException e)
            {
                System.out.println(e.toString());
            }
        }
    }
}
