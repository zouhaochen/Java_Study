package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo02
{
    public static void main(String[] args)
    {
        fillDemo();
    }

    public static void fillDemo()
    {
        List<String> list = new ArrayList<String>();

        list.add("aaaa");
        list.add("ccc");
        list.add("eeeee");
        list.add("d");
        list.add("bb");
        sop(list);

        Collections.fill(list, "ppp");
        sop(list);
    }

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
}
