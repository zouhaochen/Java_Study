package Day19;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class Demo21
{
    public static void main(String[] args) throws IOException
    {
        Properties prop = System.getProperties();

        //将信息展示在控制台上
        prop.list(System.out);

        //将信息展示在文本中
        prop.list(new PrintStream("sysinfo.txt"));

    }
}
