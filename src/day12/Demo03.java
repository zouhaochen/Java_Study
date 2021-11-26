package day12;

/*
JDK1.5中提供了多线程的升级解决方案
将同步的synchronized替换成显示的Lock操作
将Object中的wait，notify，notifyAll替换成了condition对象
该对象可以通过Lock锁进行获取

在该示例中实现了本方只唤醒对方的操作
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ResourceNewNew
{
    private String name;
    private int count = 1;
    private boolean flag = false;
    private Lock lock = new ReentrantLock();
    private Condition condition_producer = lock.newCondition();
    private Condition condition_consumer = lock.newCondition();

    public void set(String name) throws InterruptedException
    {
        lock.lock();
        try
        {
            while(flag)
                condition_producer.await();
            this.name = name+count++;
            System.out.println(Thread.currentThread().getName()+"生产者"+this.name);
            flag = true;
            condition_consumer.signal();
        }
        finally
        {
            lock.unlock();
        }
    }

    public void out() throws InterruptedException
    {
        lock.lock();
        try
        {
            while(!flag)
                condition_consumer.await();
            System.out.println(Thread.currentThread().getName()+"消费者"+this.name);
            flag = false;
            condition_producer.signal();
        }
        finally
        {
            lock.unlock();
        }

    }
}

class ProducerNew implements Runnable
{
    private ResourceNewNew resource;
    ProducerNew(ResourceNewNew resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        while(true)
        {
            try
            {
                resource.set("商品");
            }
            catch(InterruptedException e)
            {

            }

        }
    }
}

class ConsumerNew implements Runnable
{
    private ResourceNewNew resource;
    ConsumerNew(ResourceNewNew resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        while(true)
        {
            try
            {
                resource.out();
            }
            catch(InterruptedException e)
            {

            }

        }
    }
}

public class Demo03
{
    public static void main(String[] args)
    {
        ResourceNewNew r = new ResourceNewNew();
        ProducerNew producer = new ProducerNew(r);
        ConsumerNew consumer = new ConsumerNew(r);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        Thread t3 = new Thread(producer);
        Thread t4 = new Thread(consumer);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
