package day24;

import java.io.IOException;
import java.net.URL;

public class Demo06
{
    public static void main(String[] args) throws IOException
    {
        URL url = new URL("http://192.168.1.254:8080/myweb/demo.html");

        //获取协议名称
        System.out.println(url.getProtocol());
        //获取主机名
        System.out.println(url.getHost());
        //获取端口号
        System.out.println(url.getPort());
        //获取路径
        System.out.println(url.getPath());
        //获取文件名
        System.out.println(url.getFile());
        //获取查询部
        System.out.println(url.getQuery());

        /*
        int port = getPort();
        if(port == -1)
            port = 80;
        getPort() == -1;
        */
    }
}
