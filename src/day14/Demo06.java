package day14;

import java.util.ArrayList;
import java.util.Iterator;

/*
去除ArrayList中的重复元素
 */
public class Demo06
{
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add("java 01");
        al.add("java 01");
        al.add("java 02");
        al.add("java 02");
        al.add("java 03");
        al.add("java 03");

        sop(al);
        al = singleElement(al);
        sop(al);
    }

    public static ArrayList singleElement(ArrayList al)
    {
        //定义一个临时容器
        ArrayList newAl = new ArrayList();

        Iterator it = al.iterator();

        while(it.hasNext())
        {
            Object obj = it.next();

            if(!newAl.contains(obj))
                newAl.add(obj);
        }
        /*
        在迭代时，循环中next调用一次就要hasNext判断一次
         */
        return newAl;
    }
}
