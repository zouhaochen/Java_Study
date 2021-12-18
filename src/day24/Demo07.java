package day24;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Demo07
{
    public static void main(String[] args) throws IOException
    {
        URL url = new URL("http://192.168.1.254:8080/myweb/demo.html");

        URLConnection connection = url.openConnection();

        System.out.println(connection);

        InputStream in = connection.getInputStream();

        byte[] buf = new byte[1024];

        int len = in.read(buf);

        System.out.println(new java.lang.String(buf, 0, len));
    }
}
