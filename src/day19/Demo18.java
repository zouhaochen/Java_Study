package day19;

import java.io.*;

/*
3.
需求: 想要将一个文件的数据打印在控制台上
源: 文件
目的: 控制台

流操作的基本规律:
最痛苦的就是流对象有很多，不知道该用哪一个

通过三个明确来完成
1. 明确源和目的
   源: 输入流，InputStream Reader
   目的: 输出流，OutputStream Writer
2. 明确操作的数据是否是纯文本
   是: 字符流
   不是: 字节流
3. 当体系明确后，再明确要使用哪个具体的对象
   通过设备来进行区分:
   源设备: 内存，硬盘，键盘
   目的设备: 内存，硬盘，控制台

需求及分析: 将一个文本文件中的数据存储到另一个文件中: 复制文件
1. 源:
   因为是源，所以使用读取流: InputStream Reader
   是不是操作文本文件？是
   这时就可以选择Reader
   这样体系就明确了

   接下来明确要使用该体系中的哪个对象
   明确设备: 硬盘上的一个文件
   Reader体系中可以操作文件的对象是: FileReader

   是否需要提高效率？是: 加入Reader体系中的缓冲区 BufferedReader

   FileReader fr = new FileReader("a.txt");

   是否需要提高效率？是: 加入Reader体系中的缓冲区 BufferedReader bufr = new BufferedReader(fr);

2. 目的: OutputStream Writer
   目的是否是纯文本？是
   这时就可以选择Writer

   设备: 硬盘上的一个文件
   Writer体系中可以操作文件的对象是: FileWriter

   是否需要提高效率？是: 加入Reader体系中的缓冲区 BufferedWriter

   FileWriter fw = new FileWriter("b.txt")

   是否需要提高效率？是: 加入Reader体系中的缓冲区 BufferedWriter bufw = new BufferedWriter(fw);

需求及分析: 将一个图片文件中的数据存储到另一个文件中: 复制文件

需求及分析: 将键盘录入的数据保存到一个文件中
1. 源:
   键盘录入: InputStream Reader
   是不是纯文本？是: Reader

   设备: 键盘，对应的对象时System.in
   为了操作键盘的文本数据方便，可以转换成字符流按照字符串操作是最方便的
   所以既然明确了Reader，那么就讲System.in转换成字符流Reader
   用到了Reader体系中的转换流，InputStreamReader

   InputStreamReader isr = new InputStreamReader(System.in);

   需要提高效率嘛？需要: BufferedReader
   BufferedReader bufr = new BufferedReader(isr);

2. 目的: OutputStream Writer
   是否是纯文本？是: Writer
   设备: 硬盘，一个文件。使用FileWriter
   FileWriter fw = new FileWriter("a.txt");

   需要提高效率吗？需要: BufferedWriter bufw = new BufferedWriter(fw);

   扩展: 想要把录入的数据按照指定的编码表（UTF-8）将数据存到文件中
   目的: OutputStream Writer
   是否是纯文本？是: Writer
   设备: 硬盘，一个文件。使用FileWriter
   但是FileWriter是使用的默认编码表: GBK

   但是存储时需要加入指定的编码表，而指定的编码表只有转换流可以指定
   所以要使用的对象时OutputStreamWriter
   而该转换流对象要最终接收一个字节输出流，而且还可以操作文件的字节输出流: FileOutputStream

   OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d.txt"), "UTF-8");

   需要提高效率吗？需要: BufferedWriter bufw = new BufferedWriter(osw);

   所以: 转换流什么时候使用？
   字符和字节之间的桥梁，通常涉及到字符编码转换时，需要用到转换流

练习: 将一个文本数据打印在控制台上
 */
public class Demo18
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("Demo.java")));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

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
