package Day21;

import java.io.*;

/*
IO包中的其他类
1. 操作基本数据类型: DataInputStream与DateOutputStream
   可以用于操作基本数据类型的流对象
2. 操作字节数组: ByteArrayInputStream与ByteArrayOutputStream
3. 操作字符数组: CharArrayReader与CharArrayWrite
4. 操作字符串: StringReader与StringWriter
 */
public class Demo04
{
    public static void main(String[] args) throws IOException
    {
        writeData();

        readData();

        writeUTFDemo();
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf.txt"), "utf-8");
        osw.write("你好");
        osw.close();

        readData();
    }

    public static void writeData() throws IOException
    {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

        dos.writeInt(234);
        dos.writeBoolean(true);
        dos.writeDouble(98.543);
        dos.close();
    }

    public static void readData() throws IOException
    {
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

        int num = dis.readInt();
        boolean b = dis.readBoolean();
        double d = dis.readDouble();

        System.out.println("num="+num);
        System.out.println("boolean="+b);
        System.out.println("double="+d);

        dis.close();
    }

    public static void writeUTFDemo() throws IOException
    {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("uftdata.txt"));

        dos.writeUTF("你好");

        dos.close();
    }

    public static void readUTFDemo() throws IOException
    {
        DataInputStream dis = new DataInputStream(new FileInputStream("utfdata.txt"));

        String s = dis.readUTF();
        System.out.println(s);
        dis.close();
    }
}
