package day25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
获取: 将字符串

操作步骤:
1. 将正则表达式封装成对象
2. 将正则对象和要操作的字符串相关联
3. 关联后获取正则匹配引擎
4. 通过引擎对符合规则的子串进行操作，比如取出
*/
public class Demo07
{
    public static void main(String[] args)
    {
        getDemo();
    }

    public static void getDemo()
    {
        String str = "ming tian jiu yao fang jia le, da jia.";
        System.out.println(str);

        /*
        str = "123456";

        String reg = "[1-9]\\d{4,14}";
        */

        String reg = "\\b[a-z]{3}\\b";

        //将规则封装成对象
        Pattern p = Pattern.compile(reg);

        //让正则对象和要作用的字符串相关联，获取匹配器对象
        Matcher m = p.matcher(str);

        /*
        System.out.println(m.matches());
        */

        /*
        其实String类中的matches方法用的就是Pattern和Matcher对象来完成的
        只不过被String的方法封装后，用起来较为简单，但是功能缺单一
        */

        /*
        boolean b = m.find(); //将规则作用到字符串上，并进行符合规则的子串查找
        System.out.println(b);
        System.out.println(m.group()); //用于获取匹配后的结果
        */

        while(m.find())
        {
            System.out.println(m.group());
            System.out.println("start: "+m.start()+", end: "+m.end());
        }
    }
}
