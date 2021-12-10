package Day19;

import java.io.IOException;
import java.io.InputStream;

/*
读取键盘录入
System.out: 对应的是标准的输出设备，控制台
System.in: 对应的是标准的输入设备，键盘
 */
public class Demo13
{
    public static void main(String[] args) throws IOException
    {
        InputStream in = System.in;

        int by = in.read();
        System.out.println(by);
    }
}
