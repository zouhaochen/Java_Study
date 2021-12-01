package day13;

/*
3.  获取一个字符串在另一个字符串中出现的次数
    思路：
    1.  定义一个计数器
    2.  获取字符串第一次出现的位置
    3.  从第一次出现位置后剩余的字符串中继续获取字符串出现的位置
        每获取一次就计数一次
    4.  获取不到时，计数完成
 */
public class Demo05
{
    public static void sop(String str)
    {
        System.out.println(str);
    }

    public static int getSubCount(String str, String key)
    {
        int count = 0;
        int index = 0;
        while((index = str.indexOf(key))!=-1)
        {
            str = str.substring(index+key.length());
            count++;
        }
        return count;
    }

    public static int getSubCountNew(String str, String key)
    {
        int count = 0;
        int index = 0;

        while((index = str.indexOf(key, index))!=-1)
        {
            index = index + key.length();
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        String str = "abcdehjhjhldjfghigk";
        sop("count="+getSubCount(str,"k"));
        sop("count="+getSubCountNew(str,"k"));
    }
}
