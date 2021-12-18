package day17;

import java.util.*;

/*
集合框架的工具类
Collections
 */
public class Demo01
{
    /*
    public static <T extends Comparable<? super T>> void sort(List<T> list)
    {
    }
     */

    public static void sortDemo()
    {
        List<String> list = new ArrayList<String>();

        list.add("aaaa");
        list.add("ccc");
        list.add("eeeee");
        list.add("d");
        list.add("bb");

        sop(list);
        System.out.println();

        Collections.sort(list);
        sop(list);
        System.out.println();

        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            sop(it.next());
        }
        System.out.println();

        List<String> list1 = new ArrayList<String>();

        list1.add("aaaa");
        list1.add("ccc");
        list1.add("eeeee");
        list1.add("d");
        list1.add("bb");
        list1.add("ccc");
        Collections.sort(list1);
        sop(list1);
        System.out.println();

        Collections.sort(list1, new StrLenComparator());
        sop(list1);
        System.out.println();

        Collections.swap(list1, 1, 2);
        sop(list1);
        System.out.println();
    }

    public static void maxDemo()
    {
        List<String> list = new ArrayList<String>();

        list.add("aaaa");
        list.add("ccc");
        list.add("eeeee");
        list.add("d");
        list.add("bb");

        String max = Collections.max(list);
        sop("max: "+max);
    }

    public static void binarySearchDemo()
    {
        List<String> list = new ArrayList<String>();

        list.add("aaaa");
        list.add("ccc");
        list.add("eeeee");
        list.add("d");
        list.add("bb");

        Collections.sort(list);
        sop(list);
        int index = Collections.binarySearch(list, "aaa");
        sop("index="+index);
    }

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        sortDemo();
        System.out.println();

        maxDemo();
        System.out.println();

        binarySearchDemo();
    }
}

class StrLenComparator implements Comparator<String>
{
    public int compare(String s1, String s2)
    {
        if(s1.length()>s2.length())
            return 1;
        if(s1.length()<s2.length())
            return -1;
        return s1.compareTo(s2);
    }
}

