package day13;

/*
1.  模拟一个trim方法，去除字符串两端的空格
    思路：
    1.  判断字符串第一个位置是否是空格，如果是继续向下判断，直到不是空格为止
    2.  当开始和结尾都判断到不是空格时，就是要获取的字符串
 */

public class Demo03
{
    public static void sop(String str)
    {
        System.out.println(str);
    }

    public static String myTrim(String str)
    {
        int start = 0, end = str.length()-1;
        while (start<=end && str.charAt(start) == ' ')
        {
            start++;
        }
        while (start<=end && str.charAt(end) == ' ')
        {
            end--;
        }
        return str.substring(start,end+1);
    }

    public static void main(String[] args)
    {
        String s = "     ab cd    ";
        sop(s);
        s = myTrim(s);
        sop(s);
    }
}
