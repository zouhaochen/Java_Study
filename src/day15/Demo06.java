package day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo06
{
    public static void main(String[] args)
    {
        TreeSet<String> ts = new TreeSet<String>(new LengthComparator());
        ts.add("aaaaaaaa");
        ts.add("aaa");
        ts.add("ccc");
        ts.add("aaaa");
        ts.add("aaaaa");
        ts.add("a");

        Iterator<String> it = ts.iterator();
        while(it.hasNext())
        {
            String s = it.next();
            System.out.println(s);
        }
    }
}

class LengthComparator implements Comparator<String>
{
    public int compare(String s1, String s2)
    {
        int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));
        if(num == 0)
            return s1.compareTo(s2);
        return num;
    }
}
