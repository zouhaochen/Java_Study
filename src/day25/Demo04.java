package day25;

import java.util.Scanner;

public class Demo04
{
    public static void main(String[] args)
    {
        checkTel();
    }

    /*
    匹配
    手机号段只有13XXX 15XXX 18XXX
    */
    public static void checkTel()
    {
        Scanner sc = new Scanner(System.in);
        String tel = sc.next();
        String telReg = "1[358]\\d{9}";
        System.out.println(tel.matches(telReg));
    }
}
