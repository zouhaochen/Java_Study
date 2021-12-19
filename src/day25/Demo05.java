package day25;

import java.util.Scanner;

public class Demo05
{
    public static void main(String[] args)
    {
        splitDemo();
    }

    public static void splitDemo()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reg = ",";
        /*
        按照多个空格来进行切割
        String reg = " +"

        ZhangSan.LiSi.WangWu
        String reg = "\\."

        c:\\abc\\a.txt
        String reg = "\\\\"

        erkksaqqoyttsdfzzzzzzzzzzz
        叠词切，为了可以让规则的结果被重用，可以将规则封装成一个组，用（）完成
        组的出现都有编号，从1开始。想要使用已有的组可以通过\n（n就是组的编号）的形式来获取
        ((A)(B(C)))中存在四个这样的组
        1. ((A)(B(C)))
        2. \A
        3. (B(C))
        4. (C)
        String reg = (.)\\1+
         */
        String[]arr = str.split(reg);
        for(String s : arr)
        {
            System.out.println(s);
        }
    }
}
