package day11;

/*
需求：简单的卖票程序

多个窗口卖票
 */

class Ticket extends Thread
{
    private static int ticket = 100;
    public void run()
    {
        while(true)
        {
            if(ticket>0)
            {
                System.out.println(currentThread().getName()+"sale:"+ticket--);
            }
        }
    }

}

public class Demo03
{
    public static void main(String[] args)
    {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        Ticket t4 = new Ticket();
        Ticket t5 = new Ticket();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
