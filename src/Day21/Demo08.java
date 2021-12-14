package Day21;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
编码:
字符串变成字节数组

解码:
字节数组变成字符串

String->Byte[]: str.getBytes();

byte[]->String: new String(byte[] bytes);
 */
public class Demo08
{
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        String s = "你好";

        byte[] b1 = s.getBytes("GBK");
        //把数组变成字符串
        System.out.println(Arrays.toString(b1));

        String s1 = new String(b1,"GBK");
        System.out.println("s1="+s1);
    }
}
