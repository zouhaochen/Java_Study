package day12;

class ResourceNew
{
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name)
    {
        while(flag)
            try{this.wait();}catch (Exception e){}
        this.name = name+count++;
        System.out.println(Thread.currentThread().getName()+"生产者"+this.name);
        flag = true;
        this.notifyAll();
    }

    public synchronized void out()
    {
        while(!flag)
            try{this.wait();}catch (Exception e){}
        System.out.println(Thread.currentThread().getName()+"消费者"+this.name);
        flag = false;
        this.notifyAll();
    }
}

class Producer implements Runnable
{
    private ResourceNew resource;
    Producer(ResourceNew resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        while(true)
        {
            resource.set("商品");
        }
    }
}

class Consumer implements Runnable
{
    private ResourceNew resource;
    Consumer(ResourceNew resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        while(true)
        {
            resource.out();
        }
    }
}

public class Demo02
{
    public static void main(String[] args)
    {
        ResourceNew r = new ResourceNew();
        Producer producer = new Producer(r);
        Consumer consumer = new Consumer(r);

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
