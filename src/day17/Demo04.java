package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo04
{
    public static void main(String[] args)
    {
        replaceAllDemo();
    }

    public static void replaceAllDemo()
    {
        List<String> list = new ArrayList<String>();

        list.add("aaaa");
        list.add("ccc");
        list.add("eeeee");
        list.add("d");
        list.add("bb");
        sop(list);

        Collections.replaceAll(list, "aaaa", "pp");
        sop(list);

        Collections.reverse(list);
        sop(list);
    }

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
}
