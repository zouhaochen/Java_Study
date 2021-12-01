package day13;

/*
4.  获取两个字符串中最大相同子串，第一个动作：将短的那个进行长度依次递减的的打印
    思路:
    1.  将短的那个子串按照长度递减的方式获取到
    2.  将每获取到的子串去长串中判断是否包含
        如果包含，已经找到
 */
public class Demo06
{
    public static void sop(String str)
    {
        System.out.println(str);
    }

    public static String getMaxSubString(String s1, String s2)
    {
        String max = "", min = "";
        max = (s1.length() > s2.length())?s1:s2;
        min = (max==s1)?s2:s1;

        sop("max="+max);
        sop("min="+min);
        for (int x = 0; x < s2.length(); x++)
        {
            for (int y = 0, z = s2.length()-x; z!=s2.length()+1; y++,z++)
            {
                String temp = s2.substring(y, z);
                if(s1.contains(temp))
                    return temp;
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        String s1 = "international";
        String s2 = "inter";
        sop(getMaxSubString(s1, s2));
    }
}
