package day11;

/*
实现Runnable接口
 */

class TicketNew implements Runnable
{
    private int ticket = 100;
    public void run()
    {
        while(true)
        {
            if(ticket>0)
            {
                System.out.println(Thread.currentThread().getName()+"sale:"+ticket--);
            }
        }
    }
}

public class Demo04
{
    public static void main(String[] args)
    {
        Ticket t = new Ticket();
        Thread t1 = new Thread();
        t1.start();
    }
}
