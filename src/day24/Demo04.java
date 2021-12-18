package day24;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo04
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss = new ServerSocket(11000);

        Socket s = ss.accept();
        System.out.println(s.getInetAddress().getAddress());

        InputStream in = s.getInputStream();

        byte[] buf = new byte[1024];

        int len = in.read(buf);

        System.out.println(new String(buf, 0, len));

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        out.println("<font color='red' size ='7'>客户端你好</font>");

        s.close();
        ss.close();
    }
}


