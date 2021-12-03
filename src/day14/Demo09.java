package day14;

import java.util.HashSet;
import java.util.Iterator;

public class Demo09
{
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        HashSet hs = new HashSet();

        hs.add("java 01");
        hs.add("java 01");
        hs.add("java 02");
        hs.add("java 03");
        hs.add("java 03");
        hs.add("java 03");
        hs.add("java 04");
        hs.add("java 05");
        sop(hs.add("java 01"));
        sop(hs.add("java 06"));

        Iterator it = hs.iterator();

        while (it.hasNext())
        {
            sop(it.next());
        }
    }
}
