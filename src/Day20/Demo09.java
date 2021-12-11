package Day20;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
Properties是HashTable的子类
也就是说它具备了Map集合的特点。而且它里面存储到键值对都是字符串

是集合中和IO技术相结合的集合容器
该对象的特点: 可以用于键值对形式的配置文件

在加载数据时，需要数据有固定格式: 键=值
 */
public class Demo09
{
    public static void main(String[] args) throws IOException
    {
        setAndGet();
        propertiesMethod();
        loadDemo();
    }

    //设置和获取元素
    public static void setAndGet()
    {
        Properties prop = new Properties();
        prop.setProperty("ZhangSan", "30");
        prop.setProperty("LiSi", "25");

        System.out.println(prop);
        String value = prop.getProperty("LiSi");
        System.out.println(value);

        Set<String> names = prop.stringPropertyNames();
        for(String s : names)
        {
            System.out.println(s+", "+prop.getProperty(s));
        }

        prop.setProperty("Lisi", "85");
        System.out.println(prop);
    }

    /*
    想要将info.txt中的键值数据存入集合中进行操作
    1. 用一个流和info.txt文件关联
    2. 读取一行数据，将该行数据用"="进行切割
    3. "="左边作为键，右边作为值，存入道properties集合中即可
     */
    public static void propertiesMethod() throws IOException
    {
        BufferedReader bufr = new BufferedReader(new FileReader("info.txt"));
        String line = null;

        Properties prop = new Properties();

        while((line = bufr.readLine())!=null)
        {
            String[] arr = line.split("=");
            prop.setProperty(arr[0], arr[1]);
        }
        bufr.close();
        System.out.println(prop);
    }

    public static void loadDemo() throws IOException
    {
        Properties prop = new Properties();

        FileInputStream fis = new FileInputStream("info.txt");

        //将流中的数据加载进集合
        prop.load(fis);

        System.out.println(prop);
        prop.list(System.out);

        prop.setProperty("WangWu", "39");

        FileOutputStream fos = new FileOutputStream("info.txt");

        //添加注释信息
        prop.store(fos, "abc");

        fos.close();
        fis.close();
    }
}
