package day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
练习：按照字符串长度排序

字符串本身具备比较性，但是它的比较方式不是所需要的
这是就只能使用比较器
 */
public class Demo04
{
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet(new StringLengthComparator());

        ts.add("aaaaaaaa");
        ts.add("aaa");
        ts.add("ccc");
        ts.add("aaaa");
        ts.add("aaaaa");
        ts.add("a");

        Iterator it = ts.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

class StringLengthComparator implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        String s1 = (String) o1;
        String s2 = (String) o2;

        /*
        if(s1.length()>s2.length())
            return 1;
        if(s1.length()==s2.length())
            return 0;
        return -1;
         */

        int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));

        if(num == 0)
        {
            return s1.compareTo(s2);
        }
        return num;
    }
}