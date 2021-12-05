package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
map集合的两种取出方式
1. Set<K> keySet: 将map中所有的键存入到Set集合。因为set具备迭代器，所以可以通过迭代方式取出所有的键
                  再根据get方法获取每一个键对应的值
2. Set<Map.Entry<K, v>> entrySet: 将map集合中的映射关系存入到了set集合中
                                  而这个关系的数据类型就是Map.Entry

Map集合的取出原理：将map集合转成set集合，再通过迭代器取出
*/
public class Demo02
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();

        map.put("01", "abc1");
        map.put("02", "abc2");
        map.put("03", "abc3");
        map.put("04", "abc4");
        map.put("05", "abc5");

        //先获取map集合的所有键的Set集合, keySet();
        Set<String> keySet = map.keySet();

        //有了Set集合，就可以获取其迭代器
        Iterator<String> it = keySet.iterator();

        while(it.hasNext())
        {
            String key = it.next();
            //有了键，就可以通过map集合的get方法获取其对应的值
            String value = map.get(key);
            System.out.println("key: "+key+", value: "+value);
        }
    }
}
