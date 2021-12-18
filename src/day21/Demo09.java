package day21;

import java.io.UnsupportedEncodingException;

public class Demo09
{
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        String s = "联通";

        byte[] bytes = s.getBytes("gbk");

        for(byte b : bytes)
        {
            System.out.println(Integer.toBinaryString(b));
            //有效位
            System.out.println(Integer.toBinaryString(b&255));
        }

    }
}
