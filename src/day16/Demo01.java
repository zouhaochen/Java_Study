package day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
Map集合: 该集合存储键值对，一对一对往里存。而且要保证键的唯一性
1. 添加元素
   put(K key, V value)
   putAll(Map<? extends K, ? extends V> m)
2. 删除元素
   clear()
   remove(Object key)
3. 判断元素
   containsValue(Object value)
   containsKey(Object key)
   isEmpty()
4. 获取元素
   get(Object key)
   size()
   values()

   entrySet()
   keySet()

Map
    |--HashTable: 底层是哈希表数据结构，不可以存入null键null值，该集合是线程同步的，效率低
    |--HashMap: 底层是哈希表数据结构，并允许使用null值null键，该集合是不同步的，效率高
    |--TreeMap: 底层是二叉树结构，线程不同步，可以用于给map集合中的键进行排序

Map和Set很像
其实，Set底层就是使用了Map集合
*/
public class Demo01
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();

        //添加元素，如果出现添加时相同的键，那么后添加的值会覆盖原有的键对应的值，并put方法会返回被覆盖的值
        map.put("01", "abc1");
        map.put("02", "abc2");
        map.put("03", "abc3");

        System.out.println("contains key: "+map.containsKey("02"));
        System.out.println("remove: "+map.remove("03"));
        System.out.println("get: "+map.get("01"));
        System.out.println(map);

        map.put(null, "abc4");
        System.out.println("get: "+map.get(null)); //HashMap集合，空是可以作为键存在的
        map.put("04", null);
        System.out.println("get: "+map.get("04")); //HashMap集合，空是可以作为键存在的
        /*
        可以通过get方法的返回值来判断一个键是否存在，通过返回空判断
         */

        //获取map集合中所有的值
        Collection<String> coll=map.values();
        System.out.println(coll);

        /*
        map.put("01", "abc1");
        map.put("01", "abc2");
        实际存入的是abc2：当存入相同键时，新的值回替代旧的值
         */
    }
}
