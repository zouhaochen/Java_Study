package day23;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo08
{

}

class TextClient
{
    public static void main(String[] args) throws IOException
    {
        Socket s = new Socket("192.168.2.13", 70000);

        BufferedReader bufr = new BufferedReader(new FileReader("client.txt"));

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        /*
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        long time = System.currentTimeMillis();
        dos.writeLong(time);
        */

        String line = null;

        while((line=bufr.readLine())!=null)
        {
            out.println(line);
        }

        s.shutdownOutput(); //关闭客户端的输出流，相当于给流中加入一个结束标记-1

        /*
        dos.writeLong(time);
        */

        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str = bufIn.readLine();
        System.out.println(str);

        bufr.close();
        s.close();
    }
}

class TextServer
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss = new ServerSocket(70000);

        Socket s = ss.accept();

        /*
        DataInputStream dis = new DataInputStream(s.getInputStream());
        long l = dis.readLong();
        */

        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

        PrintWriter out = new PrintWriter(new FileWriter("server.txt"));

        String line = null;

        while ((line=bufIn.readLine())!=null)
        {
            out.println(line);
        }

        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        pw.println("上传成功");

        out.close();
        s.close();
        ss.close();
    }
}