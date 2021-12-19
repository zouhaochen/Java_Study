package day25;

import java.util.Scanner;

/*
正则表达式: 符合一定规则的表达式
作用: 用于专门操作字符串
*/
public class Demo01
{
    public static void main(String[] args)
    {
        checkQQ();
    }

    /*
    需求: 对QQ号码进行校验
    要求: 5~15位，0不能开头，只能是数字
    */

    public static void checkQQ()
    {
        Scanner sc = new Scanner(System.in);
        String qq = sc.next();
        int len = qq.length();
        if(len>=5&&len<=15)
        {
            if(!qq.startsWith("0"))
            {
                char[] arr = qq.toCharArray();
                boolean flag = true;
                for(int x = 0; x < arr.length; x++)
                {
                    if(!(arr[x]>='0'&&arr[x]<='9'))
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    System.out.println("qq: "+qq);
                }
                else
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
