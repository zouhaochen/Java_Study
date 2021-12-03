package day15;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo10
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String >();

        al.add("abc");
        al.add("abc");
        al.add("abc");

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(4);
        al1.add(7);
        al1.add(9);

        printColl(al);
        printColl(al1);
    }

    //当对象类型不确定时，用通配符表示
    public static void printColl(ArrayList<?> al)
    {
        Iterator<?> it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static <T> void printCollNew(ArrayList<T> al)
    {
        Iterator<T> it = al.iterator();
        while(it.hasNext())
        {
            T t = it.next(); //如果写?则不能完成此操作
            System.out.println(it.next());
        }
    }
}
