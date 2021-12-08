package Day18;

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
    }
}
