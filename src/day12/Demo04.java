package day12;

/*
stop方法已经过时

如何停止线程？
只有一种：run方法结束
开启多线程运行，运行代码通常是循环结构
只要控制住循环，就可以让run方法结束，也就是线程结束

特殊情况：当线程出狱了冻结状态，就不会读取到标记，那么线程就不会结束

当没有指定的方式让冻结的线程回复到运行状态时，这时需要对冻结进行清除
强制让线程恢复到运行状态中来，这样就可以操作标记让线程结束

Thread类提供该方法：interrupt()；
 */

class StopThread implements Runnable
{
    private boolean flag = true;
    public synchronized void run()
    {
        while(flag)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(Thread.currentThread().getName()+" Exception");
                flag = false;
            }
            System.out.println(Thread.currentThread().getName()+" run");
        }
    }
    public void changeFlag()
    {
        flag = false;
    }
}

public class Demo04
{
    public static void main(String[] args)
    {
        StopThread st = new StopThread();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);

        t1.start();
        t2.start();

        int num = 0;
        while(true)
        {
            if(num++ == 60)
            {
                //st.changeFlag();
                t1.interrupt();
                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread().getName()+num);
        }
    }
}
