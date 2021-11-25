package day11;


/*
如果同步函数被静态修时候，使用的锁不再是this
因为静态方法中不可以定义this

静态进内存时，内存中没有本类对象，但是一定有该类对应的字节码文件对象
类名.class 该对象的类型是class

静态的同步方法，使用的锁是该方法所在类的字节码文件对象：类名.class
 */
class TicketNewNewNewNew implements Runnable
{
    private static int ticket = 100;
    Object obj = new Object();
    boolean flag = true;
    public void run()
    {
        if(flag) {
            while (true) {
                synchronized (Ticket.class) {
                    if (ticket > 0) {
                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                        }
                        System.out.println(Thread.currentThread().getName() + "code:" + ticket--);
                    }
                }
            }
        }
        else
            while (true)
                show();
    }

    public static synchronized void show() //this
    {
        if(ticket>0)
        {
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
            }
            System.out.println(Thread.currentThread().getName()+"show:"+ticket--);
        }
    }
}

public class Demo08
{
    public static void main(String[] args)
    {
        TicketNewNewNewNew t = new TicketNewNewNewNew();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        try{Thread.sleep(10);}catch (Exception e){};
        t.flag = false;
        t2.start();
    }
}

