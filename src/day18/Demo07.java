package day18;

import java.util.Random;

public class Demo07
{
    public static void main(String[] args)
    {
        for(int x=0; x<10; x++)
        {
            double d = Math.random();
            sop(d);
        }
        System.out.println();

        for(int x=0; x<10; x++)
        {
            int d = (int)(Math.random()*10+1);
            sop(d);
        }
        System.out.println();

        //省略强转的过程
        Random r = new Random();
        for(int x = 0; x<10; x++)
        {
            int d = r.nextInt(10)+1;
            sop(d);
        }
    }

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
}
