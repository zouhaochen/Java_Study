package day23;

/*
UDP
面向无连接
两端：对方在不在无关，只是发送
1. 将数据及源和目的封装成数据包中，不需要建立连接
2. 每个数据包的大小限制在64k中
3. 因无连接，是不可靠协议
4. 不需要建立连接，速度快
聊天、直播、网络视频会议

TCP
面向连接
1. 建立连接，形成传输数据的通道
2. 在连接中进行大数据量传输
3. 通过三次握手完成连接，是可靠协议
   A: 你在吗; B: 我在; A: 我知道你在了
4. 必须建立连接，效率会稍低
拨号、下载

Socket
1. Socket就是为网络服务提供的一种机制
2. 通信的两端都有Socket
3. 网络通信其实就是Socket间的通信
4. 数据在两个Socket间通过IO传输

UDP传输
定义UDP发送端
1. DatagramSocket与DatagramPacket
2. 建立发送端，接收端
3. 建立数据包
4. 调用Socket的发送接收方法
5. 关闭Socket
发送端与接收端是两个独立运行的程序
 */


import java.io.IOException;
import java.net.*;

/*
需求:
通过UDP传输方式，将一段文字数据发送出去
思路:
1. 建立UdpSocket服务（端点）
2. 提供数据，并将数据封装到数据包中
3. 通过Socket服务的发送功能，将数据包发送出去
4. 关闭资源
*/
public class Demo02
{
    public static void main(String[] args) throws IOException
    {
        //1.创建UDP服务，通过DataGramSocket对象
        DatagramSocket ds = new DatagramSocket();

        //2. 确定数据，并封装成数据包
        byte[] data = "udp".getBytes();
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.2.13"), 10000);

        //3. 通过Socket服务将已有的数据包发送出去，通过send方法
        ds.send(dp);

        //4. 关闭资源
        ds.close();
    }
}

/*
需求:
定义一个应用程序，用于接收udp协议的数据并处理

定义UDP接收端
思路:
1. 定义UDPSocket服务，通常会监听一个端口，其实就是给这个接收网络应用程序定义数字标识
   方便与明确哪些数据过来该应用程序可以处理
2. 定义一个数据包，因为要存储接收到的字节数据
   因为数据包对象中有更多功能可以字节数据中不同的数据信息
3. 通过Socket服务的Receive方法将收到的数据存入已定义好的数据包中
4. 通过数据包对象的特有功能将这些不同的数据取出，打印在控制台上
5. 关闭资源
 */
class UDPReceive
{
    public static void main(String[] args) throws IOException
    {
        //1. 创建UDP Socket服务，建立端点
        DatagramSocket ds = new DatagramSocket(10000);

        while(true)
        {
            //2. 定义数据包，用于存储数据
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);

            //3. 通过服务的receive方法将收到的数据存入数据包中
            ds.receive(dp); //阻塞式方法

            //4. 通过数据包的方法获取其中的数据
            String ip = dp.getAddress().getHostAddress();
            String data = new String(dp.getData(), 0, dp.getLength());
            int port = dp.getPort();
            System.out.println(ip+", "+data+", "+port);
        }

        /*
        //5. 关闭资源
        ds.close();
        */
    }
}