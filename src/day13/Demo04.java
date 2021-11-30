package day13;

/*
2.  将一个字符串进行反转
    将字符串中指定的部分进行反转
    “abcdefg”; abfedcg
    思路：
    1.  曾经学习过对数组元素进行反转
    2.  将字符串变成数组，对数组反转
    3.  将反转后的数组变成字符串
    4.  只要将或反转的部分的开始和结束位置作为参数传递即可
 */
public class Demo04
{
    public static void sop(String str)
    {
        System.out.println(str);
    }

    public static String reverseString(String s)
    {
        //字符串变数组
        char[] chs = s.toCharArray();

        //反转数组
        reverse(chs);

        //将数组变成字符串
        return new String(chs);
    }

    private static void reverse(char[]  arr)
    {
        for(int start = 0, end = arr.length-1; start < end; start++, end-- )
        {
            swap(arr, start, end);
        }
    }

    private static void swap(char[] arr, int x, int y)
    {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static String reverseString(String s, int start, int end)
    {
        //字符串变数组
        char[] chs = s.toCharArray();

        //反转数组
        reverse(chs, start, end);

        //将数组变成字符串
        return new String(chs);
    }

    private static void reverse(char[]  arr, int x, int y)
    {
        for(int start = x, end = y; start < end; start++, end-- )
        {
            swap(arr, start, end);
        }
    }

    public static void main(String[] args)
    {
        String s = "abcdefg";
        sop(s);
        sop(reverseString(s));
        sop(reverseString(s,2,3));
    }
}
