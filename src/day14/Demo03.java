package day14;

import java.util.Enumeration;
import java.util.Vector;

/*
枚举就是Vector特有的取出方式
发现枚举和迭代器很像
其实枚举和迭代是相同的

因为枚举的名称以及方法的名称都过长
所以都被迭代器取代了
 */
public class Demo03
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add("Java 01");
        v.add("Java 02");
        v.add("Java 03");
        v.add("Java 04");
        v.add("Java 05");

        Enumeration en = v.elements();

        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }

    }
}
