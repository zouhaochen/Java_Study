package day24;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
演示客户端和服务端

1.
客户端: 浏览器
服务端: 自定义

2.
客户端: 浏览器
服务端: Tomcat服务器
*/
public class Demo02
{
}

class ServerDemo
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss = new ServerSocket(11000);

        Socket s = ss.accept();
        System.out.println(s.getInetAddress().getAddress());

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        out.println("<font color='red' size ='7'>客户端你好</font>");

        s.close();
        ss.close();
    }
}


