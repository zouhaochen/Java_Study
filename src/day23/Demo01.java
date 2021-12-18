package day23;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
网络模型
1. OSI参考模型
2. TCP/IP参考模型

网络通讯要素
1. IP地址
   网络中设备的标识
   不易记忆，可用主机名
   本地回环地址：127.0.0.1 主机名：localhost
2. 端口号
   用于标识进程的逻辑地址，不同进程的标识
   有效端口：0~65535，其中0~1024系统使用或保留端口
3. 传输协议
   通讯的规则
   常见协议：TCP，UDP

1. 找到对方IP
2. 数据要发送到对方指定的应用程序上
   为了标识这些应用程序，所以给这些网络应用程序都用数字进行表示
   为了方便称呼这个数字，叫做端口。逻辑端口
3. 定义通信规则
   这个通讯规则成为协议
   国际组织定义了通用协议：TCP/IP
 */
public class Demo01
{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress i = InetAddress.getLocalHost();
        System.out.println(i.toString());
        System.out.println("address: "+i.getHostAddress());
        System.out.println("name: "+i.getHostName());
        System.out.println();

        InetAddress ia = InetAddress.getByName("192.168.2.13");
        System.out.println("address: "+ia.getHostAddress());
        System.out.println("name: "+ia.getHostName());
        System.out.println();

        InetAddress iad = InetAddress.getByName("www.baidu.com");
        System.out.println("address: "+iad.getHostAddress());
        System.out.println("name: "+iad.getHostName());
        System.out.println();
    }
}
