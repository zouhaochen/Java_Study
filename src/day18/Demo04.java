package day18;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo04
{
    public static void main(String[] args)
    {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String year = sdf.format(d);

        System.out.println(year);
        System.out.println(Integer.parseInt(year));

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
        System.out.println("星期"+c.get(Calendar.DAY_OF_WEEK));

        int index = c.get(Calendar.MONTH);
        int week  = c.get(Calendar.WEEK_OF_MONTH);
        String[] mons = {"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"};
        String[] weeks = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        System.out.println(mons[index]);
        System.out.println(weeks[week]);

    }
}
