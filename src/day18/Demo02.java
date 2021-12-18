package day18;

import java.io.IOException;

/*
Runtime对象
该类中并没有提供构造函数
说明不可以new对象，那么会直接想到该类中的方法都是静态的
发现该类中还有非静态方法
说明该类肯定会提供一个方法获取本类对象，而且该方法是静态的，并且返回值类型是本类类型

由这个特点可以看出该类使用了单例设计模式完成

该方法是static Runtime getRuntime();
 */
public class Demo02
{
    public static void main(String[] args) throws IOException
    {
        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad.exe Demo02.java");

        Process p = rt.exec("notepad.exe Demo02.java");
        p.destroy();
    }
}
