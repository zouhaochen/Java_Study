package Day18;

import java.util.Calendar;

/*
两个练习:
1. 获取任意年的二月有多少天
   思路:
   根据指定年设置一个时间就是 c.set(year, 2, 1)//某一年的3月1日
   c.add(Calendar.DAY_OF_MONTH, -1);//3月1日往前推一天就是2月最后一天

2. 获取昨天的现在这个时刻
   c.add(Calendar.DAY_OF_MONTH, -1);
 */
public class Demo05
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        c.set(2012,0,23);
        printCalendar(c);
        System.out.println();

        c.add(Calendar.YEAR, 4);
        c.add(Calendar.MONTH,1);
        printCalendar(c);
    }

    public static void printCalendar(Calendar c)
    {
        String[] mons = {"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"};
        String[] weeks = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        int index = c.get(Calendar.MONTH);
        int index1 = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(c.get(Calendar.YEAR)+"年");
        System.out.println(mons[index]);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(weeks[index1]);
    }
}
