package day21;

import java.io.*;

public class Demo07
{
    public static void main(String[] args) throws IOException
    {
        writeText();
    }

    public static void writeText() throws IOException
    {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(("gbk.txt"), Boolean.parseBoolean("GBK")));
        osw.write("你好");
        osw.close();
    }


}
