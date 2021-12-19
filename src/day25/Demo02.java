package day25;

import java.util.Scanner;

public class Demo02
{
    public static void main(String[] args)
    {
        checkQQ();
    }

    /*
    需求: 对QQ号码进行校验
    要求: 5~15位，0不能开头，只能是数字

    这种方式是使用了String类中的方法，进行组合完成了需求，但是代码过于复杂
    */

    public static void checkQQ()
    {
        Scanner sc = new Scanner(System.in);
        String qq = sc.next();
        int len = qq.length();
        if(len>=5&&len<=15)
        {
            if(!qq.startsWith("0")) //Integer.parseInt("123")
            {
                try
                {
                    long l = Long.parseLong(qq);
                    System.out.println("qq: "+l);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("QQ号出现非法字符");
                }
            }
            else
            {
                System.out.println("QQ号不可以0开头");
            }
        }
        else
        {
            System.out.println("QQ号长度错误");
        }
    }
}
