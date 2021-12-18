package day17;

import java.util.*;

import static day17.Demo01.sop;

public class Demo05
{
    public static void main(String[] args)
    {
        orderDemo();
        shuffleDemo();
    }

    public static void orderDemo()
    {
        TreeSet<String> ts = new TreeSet<String>(new StrLenComparator());

        ts.add("aaaaa");
        ts.add("bbb");
        ts.add("cccc");
        ts.add("dd");

        Iterator it = ts.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println();

        TreeSet<String> ts1 = new TreeSet<String>(Collections.reverseOrder());

        ts1.add("aaaaa");
        ts1.add("bbb");
        ts1.add("cccc");
        ts1.add("dd");

        Iterator it1 = ts1.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
        System.out.println();

        TreeSet<String> ts2 = new TreeSet<String>(Collections.reverseOrder(new StrLenComparator()));

        ts2.add("aaaaa");
        ts2.add("bbb");
        ts2.add("cccc");
        ts2.add("dd");

        Iterator it2 = ts2.iterator();
        while(it2.hasNext())
        {
            System.out.println(it2.next());
        }
    }

    public static void shuffleDemo()
    {
        List<String> list = new ArrayList<String>();

        list.add("aaaa");
        list.add("ccc");
        list.add("eeeee");
        list.add("d");
        list.add("bb");

        sop(list);
        //随机排放：扑克牌，骰子
        Collections.shuffle(list);
        sop(list);
    }
}

class StrComparator implements Comparator<String>
{
    public int compare(String s1, String s2)
    {
        return s1.compareTo(s2);
    }
}
