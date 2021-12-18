package day18;

import java.io.FileWriter;
import java.io.IOException;

/*
IO异常的处理方式
 */
public class Demo10
{
    public static void main(String[] args)
    {
        FileWriter fw = null;
        try
        {
            fw = new FileWriter("Demo.txt");
            fw.write("abcde");
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
