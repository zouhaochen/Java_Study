package day11;


/*
死锁

同步中嵌套同步。
 */

class TestLock implements Runnable
{
    private boolean flag;
    TestLock(boolean flag)
    {
        this.flag = false;
    }

    public void run()
    {
        if(flag)
        {
            synchronized (MyLock.lockA)
            {
                System.out.println("if lock a");
                synchronized (MyLock.lockB)
                {
                    System.out.println("if lock a");
                }
            }

        }
        else
        {
            synchronized (MyLock.lockB)
            {
                System.out.println("else lock b");
                synchronized (MyLock.lockA)
                {
                    System.out.println("else lock a");
                }
            }
        }
    }

}

class MyLock
{
    static Object lockA = new Object();
    static Object lockB = new Object();
}

public class Demo10
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new TestLock(true));
        Thread t2 = new Thread(new TestLock(false));
        t1.start();
        t2.start();
    }
}
