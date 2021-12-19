package day25;

public class Demo06
{
    public static void main(String[] args)
    {
        //将字符串中的五个以上数字替换成#
        replaceAllDemo("wer12345id2345","\\d{5,}","#");
        System.out.println();

        //将字符串中的叠词替换成#
        replaceAllDemo("erkksaqqoyttsdfzzzzzzzzzzz","(.)\\1+","#");
        System.out.println();

        //将重叠的字母替换成单个字母
        replaceAllDemo("erkksaqqoyttsdfzzzzzzzzzzz","(.)\\1+","$1");
        System.out.println();
    }

    public static void replaceAllDemo(String str, String reg, String newStr)
    {
        str = str.replaceAll(reg, newStr);
        System.out.println(str);
    }
}
