package day12;

/*
join：
当A线程执行到了B线程的.join()方法时，A就会等待，等B线程都执行完，A才会执行
join可以用来临时加入线程执行
 */
class Demo implements Runnable
{
    public void run()
    {
        for(int x = 0; x < 70; x++)
        {
            System.out.println(Thread.currentThread().getName()+x);
            Thread.yield();
        }
    }
}

public class Demo05
{
    public static void main(String[] args) throws Exception
    {
        Demo d = new Demo();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);

        t1.start();
        t1.join();
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);

        for(int x = 0; x < 80; x++)
        {
            System.out.println(x);
        }
        System.out.println("over");
    }
}
