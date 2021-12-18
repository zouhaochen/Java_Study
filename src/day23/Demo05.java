package day23;

/*
TCP传输
1. Socket和ServerSocket
2. 建立客户端和服务器端
3. 建立连接后，通过Socket中的IO流进行数据传输
4. 关闭Socket
同样，客户端与服务器端是两个独立的应用程序
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
演示TCP传输

1. TCP分客户端和服务端
2. 客户端对应的对象时Socket
   服务端对应的对象是ServerSocket

客户端:
通过查阅Socket对象，发现在该对象建立时就可以去连接指定的主机
因为TCP是面向连接的，所以在建立Socket服务时，就要有服务端存在，并连接成功
形成通路后，在该通道进行数据的传输

需求: 给服务端发送文本数据

步骤:
1. 创建Socket服务，并指定要连接的主机和端口
2.
*/
public class Demo05
{
}

class TCPClient
{
    public static void main(String[] args) throws IOException
    {
        //创建客户端的Socket服务，指定目的主机和端口
        Socket s = new Socket("192.168.2.13", 40000);

        //为了发送数据，应该获取Socket流中的输出流
        OutputStream out = s.getOutputStream();
        out.write("tcp".getBytes());
        s.close();
    }
}

/*
需求: 定义端点接收数据并打印在控制台上

服务端:
1. 建立服务端的Socket服务: ServerSocket()
   并监听一个端口
2. 获取连接过来的客户端对象
   通过ServerSocket的accept方法，所以这个方法是阻塞式的，没有连接就会等
3. 客户端如果发过来数据，那么服务端要使用对应的客户端对象，并获取到该客户端对象的读取流来读取发过来的数据
   并打印在控制台
4. 关闭服务端（可选操作）
*/

class TCPServer
{
    public static void main(String[] args) throws IOException
    {
        //建立服务端的Socket服务，并监听一个端口
        ServerSocket ss = new ServerSocket(40000);

        //通过accept方法获取连接过来的客户端对象
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+" connected!");

        //获取客户端发送过来的数据，那么要使用客户端对象的读取流来读取数据
        InputStream in = s.getInputStream();

        byte[] buf = new byte[1024];

        int len = in.read(buf);

        System.out.println(new String(buf, 0, len));

        s.close(); //关闭客户端
        ss.close(); //可选操作
    }
}