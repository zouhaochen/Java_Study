package day12;

/*
线程间通讯：
其实就是多个线程在操作同一个资源
但是操作的动作不同

等待唤醒机制

wait()
notify()
notifyAll()
都使用在同步中，因为要对持有监视器（锁）的线程操作
所以要使用在同步中，因为只有同步才具有锁

为什么这些操作线程的方法要定义在object类中呢？
因为这些方法在操作同步中线程时都必须要标识它们所操作线程持有的锁
只有同一个锁上的被等待线程可以被同一个锁上notify唤醒
不可以对不同锁中的线程进行唤醒

也就是说，等待和唤醒必须是同一个锁
而锁可以是任意对象，所以可以被任意对象调用的方法定义在object类中
 */

class Resource
{
    private String name;
    private String sex;
    private boolean flag = false;

    public synchronized void set(String name, String sex)
    {
        if(flag)
            try{this.wait();}catch(Exception e){};
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }

    public synchronized void out()
    {
        if(!flag)
            try{this.wait();}catch(Exception e){};
        System.out.println(name+sex);
        flag = false;
        this.notify();
    }
}

class Input implements Runnable
{
    private Resource r;

    Input(Resource r)
    {
        this.r = r;
    }
    public void run()
    {
        int x = 0;
        while(true)
        {
                if(x == 0)
                {
                    r.set("Mike","man");
                }
                else
                {
                    r.set("Lily","woman");
                }
                x = (x+1)%2;

        }
    }
}

class Output implements Runnable
{
    private Resource r;

    Output(Resource r)
    {
        this.r = r;
    }
    public void run()
    {
        while(true)
        {
            synchronized (r)
            {
                r.out();
            }
        }
    }
}

public class Demo01
{
    public static void main(String[] args)
    {
        Resource r = new Resource();

        Input in = new Input(r);
        Output out = new Output(r);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);

        t1.start();
        t2.start();

    }
}
