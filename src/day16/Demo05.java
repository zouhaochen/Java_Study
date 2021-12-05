package day16;

import sun.reflect.generics.tree.Tree;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
练习：
"aabbccdefggg"获取该字符串中的字母出现的次数
希望打印结果：a(2)b(2)...

通过结果发现，每一个字母都有对应的次数
说明字母和次数之间都有映射关系

注意：当发现有映射关系时，可以选择map集合
因为map集合中存放的就是映射关系

什么时候使用map集合？
当数据之间存在着映射关系时，就要先想到map集合

第一次用a字母作为键去找集合，那么集合没有a这个键，所以没有对应的次数，返回null
如果为空，就将a字母和1存入集合
如果指定的键已经存在，说明有对应的次数，那么就将对应的次数取出并自增后再重新存入集合
1. 将字符串转换成字符数组，因为要对每一个字母进行操作
2. 定义一个map集合，因为打印结果的字母有顺序，所以使用TreeMap集合
3. 遍历字符数组，将每一个字母作为键去查map集合
   如果返回null，就将该字母和1存入到map集合中
   如果返回不是null，说明该字母在map集合内已经存在，并有对应的次数，那么就获取该次数并进行自增
   然后将该字母和自增后的次数存入到map集合中，覆盖掉原来键所对应的值
4. 将map集合中的数据变成指定的字符串形式返回
*/
public class Demo05
{
    public static void main(String[] args)
    {
        String s = chartCount("aabcdabcdgffbcaacc");
        System.out.println(s);
    }

    public static String chartCount(String str)
    {
        char[] chs = str.toCharArray();

        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        for(int x = 0; x<chs.length; x++)
        {
            int count = 0;

            //数组中的字符不是字母
            if(!(chs[x]>='a'&&chs[x]<='z'||chs[x]>='A'&&chs[x]<='Z'))
                continue;

            Integer value = tm.get(chs[x]);

            if(value!=null)
                count = value;
            count++;
            tm.put(chs[x], count);
            /*
            代码重复
            if(value == null)
            {
                tm.put(chs[x],1);
            }
            else
            {
                value = value + 1;
                tm.put(chs[x], value);
            }
            */
        }
        System.out.println(tm);
        System.out.println();

        StringBuilder sb = new StringBuilder();

        Set<Map.Entry<Character, Integer>> entrySet = tm.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();

        while (it.hasNext())
        {
            Map.Entry<Character, Integer> me = it.next();
            Character ch = me.getKey();
            Integer value = me.getValue();
            sb.append(ch+"("+value+")");
        }

        return sb.toString();
    }
}
