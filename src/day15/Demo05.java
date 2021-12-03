package day15;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型：JDK1.5版本之后出现的新特性，用于解决安全问题，是一个类型安全机制

好处：
1. 将运行时期出现的问题ClassCastException转移到编译时期
   方便与程序员解决问题，让运行时期问题减少，安全
2. 避免了强制转换到麻烦

泛型格式：通过<>来定义要操作的引用数据类型
在使用java提供的对象时，什么时候写泛型呢？
通常在集合框架中很常见
只要见到<>就要定义泛型

其实<>就是用来接收类型的
当使用集合时，将集合中要存储的数据类型作为参数传递到<>中即可
 */
public class Demo05
{
    public static void main(String[] args)
    {
        //类似数组定义数据类型
        ArrayList<String> al = new ArrayList<String>(); //定义了一个ArrayList容器，容器中的元素是String类型

        al.add("abc1");
        al.add("abc111");
        al.add("abc11");

        /*
        al.add(4);
        添加后会报错：ClassCastException
        类型转换异常
         */

        Iterator<String> it = al.iterator();
        while(it.hasNext())
        {
            String s = it.next();
            System.out.println(s+": "+s.length());
        }
    }
}
