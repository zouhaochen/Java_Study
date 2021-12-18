package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Demo05
{
    public static void main(String[] args) throws IOException
    {
        Socket s = new Socket("192.168.2.13", 8080);

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        out.println();

        BufferedReader bufr = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line = null;

        while ((line=bufr.readLine())!=null)
        {
            System.out.println(line);
        }

        s.close();
    }
}
