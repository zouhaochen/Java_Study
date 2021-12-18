package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo03
{

}

class SendUDP
{
    public static void main(String[] args) throws IOException
    {
        DatagramSocket ds = new DatagramSocket();
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line=bufr.readLine())!=null)
        {
            if("over".equals(line))
                break;
            byte[] buf = line.getBytes();
            DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.2.13"), 20000);
            ds.send(dp);
        }
        ds.close();
    }
}

class ReceiveUDP
{
    public static void main(String[] args) throws IOException
    {
        DatagramSocket ds = new DatagramSocket(20000);
        while(true)
        {
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);

            ds.receive(dp);

            String ip = dp.getAddress().getHostAddress();
            String data = new String(dp.getData(), 0, dp.getLength());
            System.out.println(ip+", "+data);
        }
    }
}
