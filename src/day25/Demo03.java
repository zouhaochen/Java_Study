package day25;

import java.util.Scanner;

/*
正则表达式: 符合一定规则的表达式
作用: 用于专门操作字符串
特点: 用一些特定的符号来表示一些代码操作，这样就简化了书写
     所以学习正则表达式，就是在学习一些特殊符号的使用
好处: 可以简化对字符串的复杂操作
弊端: 符号定义越多，正则越长，阅读性越差

具体操作功能:
1. 匹配: String matches()方法。用规则匹配整个字符串，只要有一处不符合规则，就匹配结束，返回false
2. 切割: String split()方法
3. 替换: String replaceAll()
4. 获取: 将字符串中的符合规则的子串取出

 */
public class Demo03
{
    public static void main(String[] args)
    {
        checkQQ();
    }

    public static void checkQQ()
    {
        Scanner sc = new Scanner(System.in);
        String qq = sc.next();

        String regex = "[1-9][0-9]{4,14}";

        boolean flag = qq.matches(regex);
        if(flag)
            System.out.println("qq: "+qq);
        else
            System.out.println("QQ号码错误");
    }

    public static void demo()
    {
        String str1 = "a";
        String reg1 = "[bcd]";
        boolean b1 = str1.matches(reg1);
        System.out.println(b1);

        String str2 = "b9";
        String reg2 = "[a-zA-Z][0-9]";
        boolean b2 = str1.matches(reg2);
        System.out.println(b2);

        String str3 = "b9";
        String reg3 = "[a-zA-Z]\\d*";
        boolean b3 = str1.matches(reg3);
        System.out.println(b3);

    }

    public static void checkQQNew()
    {
        Scanner sc = new Scanner(System.in);
        String qq = sc.next();

        String regex = "[1-9]\\d{4,14}";

        boolean flag = qq.matches(regex);
        if(flag)
            System.out.println("qq: "+qq);
        else
            System.out.println("QQ号码错误");
    }
}
