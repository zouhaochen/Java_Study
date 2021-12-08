package Day18;

import java.util.Properties;

/*
System: System类中的方法和属性都是静态的
out: 标准输出，默认是控制台
in: 标准输入，默认是键盘
描述系统的一些信息
获取系统属性信息: properties getProperties();
 */
public class Demo01
{
    public static void main(String[] args)
    {
        Properties prop = System.getProperties();
        /*
        因为Properties时HashTable的子类，也就是Map集合的一个子类对象
        那么可以通过Map的方法取出该集合中的元素
        该集合中存储的都是字符串，没有泛型定义
         */

        //获取所有属性信息
        for(Object obj : prop.keySet())
        {
            String value = (String)prop.get(obj);
            System.out.println(obj+":"+value);
        }


        //如何在系统中自定义一些特有信息？
        System.setProperty("MyValue","MyKey");


        //获取指定属性信息
        String value = System.getProperty("os.name");
        System.out.println("value: "+value);

        //可不可以在虚拟机启动时动态加载一些属性信息？

    }
}
