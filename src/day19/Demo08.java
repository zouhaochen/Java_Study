package day19;

import java.io.*;

//自定义LineNumberReader
public class Demo08
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("Demo.java");
        MyLineNumberReader mylnr = new MyLineNumberReader(fr);
        String line = null;

        mylnr.setLineNumber(100);
        while((line=mylnr.myReadLine())!=null)
        {
            System.out.println(mylnr.getLineNumber()+": "+line);
        }

        mylnr.myClose();
    }
}

class MyLineNumberReader
{
    private Reader r;
    private int lineNumber;
    MyLineNumberReader(Reader r)
    {
        this.r = r;
    }

    public void setLineNumber(int lineNumber)
    {
        this.lineNumber = lineNumber;
    }

    public int getLineNumber()
    {
        return lineNumber;
    }

    public String myReadLine() throws IOException
    {
        lineNumber++;
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while((ch = r.read())!=-1)
        {
            if(ch=='\r')
                continue;
            if(ch=='\n')
                return sb.toString();
            else
            sb.append((char)ch);
        }
        if(sb.length()!=0)
            return sb.toString();
        return null;
    }

    public void myClose() throws IOException
    {
        r.close();
    }

}