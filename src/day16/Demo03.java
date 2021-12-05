package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();

        map.put("01", "abc1");
        map.put("02", "abc2");
        map.put("03", "abc3");
        map.put("04", "abc4");
        map.put("05", "abc5");

        //将Map集合中的映射关系取出，存入到Set集合中
        Set<Map.Entry<String, String>> entrySet= map.entrySet();

        Iterator<Map.Entry<String, String>> it = entrySet.iterator();

        while (it.hasNext())
        {
            Map.Entry<String, String> me = it.next();
            String key = me.getKey();
            String value = me.getValue();

            System.out.println(key+": "+value);
        }
    }
}
/*
Map.Entry:
其实Entry也是一个接口，它是Map接口中的一个内部接口

interface Map
{
    public static interface Entry
    {
        public abstract Object getKey();
        public abstract Object getValue();
    }
}

class HashMap implements Map
{
    class MapEntry implements Map.Entry
    {
        public abstract Object getKey(){};
        public abstract Object getValue(){};
    }
}
*/