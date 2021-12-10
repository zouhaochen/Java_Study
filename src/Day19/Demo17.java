package Day19;

import java.io.*;

/*
1.
源: 键盘录入
目的: 控制台

2.
需求:
想把键盘录入的数据存储到一个文件中
源: 键盘
目的: 文件
 */
public class Demo17
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt")));

        String line = null;

        while((line=bufr.readLine())!=null)
        {
            if("over".equals(line))
                break;

            /*
            System.out.println(line.toUpperCase());
             */

            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }

        bufr.close();
    }
}
