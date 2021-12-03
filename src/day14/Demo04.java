package day14;

import java.util.LinkedList;

/*
Linklist特有方法
addFirst();
addLast();
添加元素

getFirst();
getLast();
获取元素，但不删除元素，如果集合中没有元素，会出现NoSuchElementException

removeFirst();
removeLast();
获取元素但是元素被删除，如果集合中没有元素，会出现NoSuchElementException

在JDK 1.6 出现了替代方法

offerFirst();
offerLast();
添加元素

peekFirst();
peekLast();
获取元素，但是不删除元素。如果集合中没有元素，会返回null

pollFirst();
pollLast();
获取元素，但是元素被删除。如果集合中没有元素，会返回null
 */
public class Demo04
{

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        LinkedList link = new LinkedList();

        link.addFirst("java 01");
        link.addFirst("java 02");
        link.addFirst("java 03");
        link.addFirst("java 04");
        link.addFirst("java 05");

        sop(link);
        System.out.println();

        LinkedList link1 = new LinkedList();

        link1.addLast("java 01");
        link1.addLast("java 02");
        link1.addLast("java 03");
        link1.addLast("java 04");
        link1.addLast("java 05");

        sop(link1);
        System.out.println();
        sop(link1.getFirst());
        sop(link1.getLast());
        System.out.println();

        sop("size="+link1.size());
        sop(link1.removeFirst());
        sop(link1.removeFirst());
        System.out.println();

        while (!link.isEmpty())
        {
            sop(link.removeFirst());
        }
    }
}
