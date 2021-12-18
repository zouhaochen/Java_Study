package day23;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
需求:
建立一个文本转换服务器
客户端给服务端发送文本，服务端会将文本转成大写再返回给客户端
而且客户端可以不断的进行文本转换，当客户端输入over时，转换结束

分析:
客户端:
既然是操作设备上的数据，就可以使用IO技术，并按照IO的操作规律来思考
源: 键盘录入
目的: 网络设备，网络输出流
而且操作的是文本数据，可以选择字符流

步骤:
1. 建立服务
2. 获取键盘录入
3. 将数据发给服务端
4. 获取服务端返回的大些数据
5. 结束，关闭资源

都是文本数据，可以使用字符流进行操作，同时提高效率，加入缓冲
*/
public class Demo07
{
}

class TransClient
{
    public static void main(String[] args) throws IOException
    {
        Socket s = new Socket("192.168.2.13", 60000);

        //定义读取键盘数据的流对象
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        //定义目的，将数据写入到socket输出流，
        BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //定义一个Socket读取流，读取服务端返回的大写信息
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line = null;

        while((line = bufr.readLine())!=null)
        {
            if("over".equals(line))
                break;

            bufOut.write(line);
            bufOut.newLine();
            bufOut.flush();

            String str = bufIn.readLine();

            System.out.println("server: "+str);
        }

        bufr.close();
        s.close();
    }
}

/*
服务端:
源: Socket读取流
目的: Socket输出流
都是文本，装饰。
*/
class TransServer
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss = new ServerSocket(60000);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+" connected");

        //源: 读取Socket读取流中的数据
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //目的: Socket输出流，将大写数据写入到socket输出流并发送给客户端
        BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while((line=bufIn.readLine())!=null)
        {
            System.out.println(line);
            bufOut.write(line.toUpperCase());
            bufOut.newLine();
            bufOut.flush();
        }

        s.close();
        ss.close();
    }
}

/*
该例子出现的问题:
现象: 客户端和服务端都在莫名的等待
这是为什么呢？
因为客户端和服务端都有阻塞式的方法。这些方法没有读到结束标记，那么就会一直等待
而导致两端都在等待
*/