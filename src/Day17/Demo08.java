package Day17;

import java.util.*;

/*
高级for循环

格式：
for(数据类型 变量名: 被遍历的集合(Collection)或者数组)
{

}

对集合进行遍历：只能获取元素，但是不能对集合进行操作
迭代器：除了遍历，还可以进行remove集合中元素的动作
如果使用ListIterator，还可以在遍历过程中对集合进行增删改查的动作

传统for循环和高级for有什么区别呢？
高级for有一个局限性：必须有被遍历的目标

建议在遍历数组的时候，希望使用传统for，因为传统for可以定义脚标
for(int x = 0; x < arr.length; x++)
{
    System.out.println(arr[x]);
}
 */
public class Demo08
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("aaaaa");
        al.add("bbb");
        al.add("cc");
        al.add("dddd");
        al.add("e");

        /*
        Iterator <String> it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println();
         */

        //简化书写
        for(String s : al)
        {
            System.out.println(s);
        }
        System.out.println();

        for(String s : al)
        {
            s = "kk";
        }
        System.out.println(al);
        /*
        循环的局限性：只能取出，不能修改
         */
        System.out.println();

        int[] arr = {3, 5, 1};
        for(int i : arr)
        {
            System.out.println("i:"+i);
        }
        System.out.println();

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");

        //第一种取出方式
        Set<Integer> keySet = hm.keySet();
        for(Integer i : keySet)
        {
            System.out.println(i+":"+hm.get(i));
        }
        System.out.println();

        //第二种取出方式
        for(Map.Entry<Integer, String> me : hm.entrySet())
        {
            System.out.println(me.getKey()+":"+me.getValue());
        }
    }
}
