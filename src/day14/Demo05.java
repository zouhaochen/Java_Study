package day14;

/*
使用LinkedList模拟一个堆栈或者队列数据结构
堆栈：先进后出 如同一个杯子
队列：先进先出 First in Firs out FIFO 如同一个水管
 */

import java.util.LinkedList;

class Queue
{
    private LinkedList link;

    Queue()
    {
        link = new LinkedList();
    }

    public void myAdd(Object obj)
    {
        link.addFirst(obj);
    }

    public Object myGet()
    {
        return link.removeLast();
    }

    public boolean isNull()
    {
        return link.isEmpty();
    }
}

public class Demo05
{
    public static void main(String[] args)
    {
        Queue queue = new Queue();
        queue.myAdd("java 01");
        queue.myAdd("java 02");
        queue.myAdd("java 03");
        queue.myAdd("java 04");
        queue.myAdd("java 05");

        while(!queue.isNull())
        {
            System.out.println(queue.myGet());
        }
    }
}
