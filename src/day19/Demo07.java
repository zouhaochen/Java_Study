package day19;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo07
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("Demo.java");
        LineNumberReader lnr = new LineNumberReader(fr);

        String line = null;
        //行号从100开始
        lnr.setLineNumber(100);
        while((line = lnr.readLine())!=null)
        {
            //返回行号+行内容
            System.out.println(lnr.getLineNumber()+":"+line);
        }

        lnr.close();
    }
}