package day19;

import java.io.IOException;
import java.io.InputStream;

public class Demo14
{
    public static void main(String[] args) throws IOException
    {
        InputStream in = System.in;

        int ch = 0;
        while((ch=in.read())!=-1)
        {
            System.out.println(ch);
        }

        in.close();
    }
}
