package day25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
网页爬虫(蜘蛛)
*/
public class Demo09
{
    public static void main(String[] args) throws IOException
    {
    }

    /*
    获取指定文档中的邮件地址
    使用获取功能
    Pattern
    Matcher
    */

    public static void getMails() throws IOException
    {
        BufferedReader bufr = new BufferedReader(new FileReader("mail.txt"));

        String line = null;

        String mailreg = "\\w+@\\w+(\\.\\w+)+";
        Pattern p = Pattern.compile(mailreg);

        while((line = bufr.readLine())!=null)
        {
            /*
            System.out.println(line);
            */
            Matcher m = p.matcher(line);
            while(m.find())
            {
                System.out.println(m.group());
            }
        }
    }

    public static void getMailsNet() throws IOException
    {
        URL url = new URL("http://192.168.1.254:8080/myweb/mail.html");
        URLConnection connection = url.openConnection();

        BufferedReader bufIn = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line = null;

        String mailreg = "\\w+@\\w+(\\.\\w+)+";
        Pattern p = Pattern.compile(mailreg);

        while((line = bufIn.readLine())!=null)
        {
            /*
            System.out.println(line);
            */
            Matcher m = p.matcher(line);
            while(m.find())
            {
                System.out.println(m.group());
            }
        }
    }
}
