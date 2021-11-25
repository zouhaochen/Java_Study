package day11;

/*
需求：
银行有一个金库
有两个储户分别存300元，每次存300，存3次

目的：该程序是否有安全问题，如果有，如何解决

如何寻找问题？
1. 明确那些代码是多线程运行代码
2. 明确共享数据
3. 明确多线程运行代码中哪些语句是操作共享数据的
 */

class Bank
{
    private int sum;
    Object obj = new Object();
    public synchronized void add(int n)
    {
        //synchronized(obj)
        //{
            sum = sum + n;
            try
            {
                Thread.sleep(10);
            }
            catch (Exception e)
            {

            };
            System.out.println("sum="+sum);
        //}

    }
}

class Customer implements Runnable
{
    private Bank b = new Bank();
    public void run()
    {
        for(int x = 0; x < 3; x++)
        {
            b.add(100);
        }
    }
}

public class Demo06
{
    public static void main(String[] args)
    {
        Customer c = new Customer();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
