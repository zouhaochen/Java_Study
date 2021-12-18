package day17;

import java.util.Arrays;
import java.util.List;

/*
Arrays: 用于操作数组的工具类
里面都是静态方法

asList: 将数组变成List集合
 */
public class Demo06
{
    public static void main(String[] args)
    {
        int[] arr1 = {2, 4, 5};
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        String[] arr2 = {"aaa", "bb", "cccc"};
        Arrays.asList(arr2);
        /*
        把数组变成List集合有什么好处？
        可以使用集合的思想和方法来操作数组中的元素

        注意：将数组变成集合，不可以使用集合的增删方法
        因为数组的长度是固定的
        可以使用的方法有：
        contains
        get
        indexOf()
        subList()

        如果增删了，那么会发生不支持操作异常UnsupportedOperationException
         */
        List<String> list = Arrays.asList(arr2);
        sop(list);
        sop("contains: "+list.contains("cccc"));
        System.out.println();
        /*
        list.add("qq"); //UnsupportedOperationException
         */

        int[] nums1 = {1, 2, 3, 4};
        Arrays.asList(nums1);
        List<int[]> li1 = Arrays.asList(nums1);
        sop(li1);
        System.out.println();
        /*
        如果数组中的元素都是对象，那么变成集合时，数组中的元素就直接转成集合中的元素
        如果数组中的元素都是基本数据类型，那么会将该数组作为集合中的元素存在
         */
        Integer[] nums2 = {1, 2, 3, 4};
        Arrays.asList(nums2);
        List<Integer> li2 = Arrays.asList(nums2);
        sop(li2);

    }

    //如果不将数组变成List集合操作元素，需要自己定义函数
    public static boolean myContains(String[] arr, String key)
    {
        for(int x = 0; x < arr.length; x++)
        {
            if(arr[x].equals(key))
                return true;
        }
        return false;
    }


    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
}
