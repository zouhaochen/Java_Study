package day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
Collection
    |--List: 元素是有序的，元素可以重复。因为该集合体系有索引
        |--ArrayList: 底层的数据结构使用的是数组结构，特点：查询速度快，但是增删稍慢，线程不同步
        |--LinkedList: 底层的数据结构使用的是链表结构，特点：增删速度很快，但是查询速度慢
        |--Vector：底层的数据结构使用的是数组数据结构，Vector出现较早，ArrayList出现较晚，线程同步，被ArrayList替代
    |--Set: 元素是无序的，元素不可以重复。

List:
    特有方法：凡是可以操作角标的方法都是该体系特有的方法
    增:
    add(index, element);
    addAll(index, Collection);
    删:
    remove(index);
    改:
    set(index, element);
    查:
    get(index);
    subList(from, to);
    listIterator();

List集合特有的迭代器，ListIterator是Iterator的子接口
在迭代时，不可以通过集合对象的方法操作集合中的元素，因为会发生并发修该异常
ConcurrentModificationException

所以，在迭代时，只能用迭代器的方式操作元素，可是Iterator方法是有限的
只能对元素进行判断、取出、删除的操作
如果想要其他的操作如添加、修改等，就需要使用其子接口：ListIterator

该接口只能通过List集合的ListIterator方法获取
 */
public class Demo02
{
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        method();
        System.out.println();

        //演示列表迭代器
        ArrayList al = new ArrayList();

        //添加元素
        al.add("java 01");
        al.add("java 02");
        al.add("java 03");
        al.add("java 04");
        al.add("java 05");

        //在迭代过程中准备添加或删除元素
        Iterator it = al.iterator();

        while(it.hasNext())
        {
            Object obj = it.next();
            if(obj.equals("java 02"))
            {
                it.remove(); //将java02的引用从集合中删除
            }
            sop("obj="+obj);
        }
        sop(al);
        System.out.println();

        ListIterator li = al.listIterator();
        while (li.hasNext())
        {
            Object obj = li.next();
            if(obj.equals("java 03"))
            {
                li.add("java 009");
            }
            if(obj.equals("java 04"))
            {
                li.set("java 006");
            }
        }
        sop(al);
        System.out.println();

        sop("hasNext(): "+li.hasNext()); //遍历结束，指针后没有元素
        sop("hasPrevious(): "+li.hasPrevious());
        System.out.println();

        while (li.hasPrevious())
        {
            sop("pre:"+li.previous());
        }
    }

    public static void method()
    {
        ArrayList al = new ArrayList();

        //添加元素
        al.add("java 01");
        al.add("java 02");
        al.add("java 03");
        al.add("java 04");
        al.add("java 05");

        sop("原集合是: "+al);
        System.out.println();

        //在指定位置添加元素
        al.add(1,"java 09");
        sop("更改后集合是: "+al);
        System.out.println();

        //删除指定位置的元素
        al.remove(2);
        sop("更改后集合是: "+al);
        System.out.println();

        //修改元素
        al.set(2,"java 007");
        sop("更改后集合是: "+al);
        System.out.println();

        //通过脚标获取元素
        sop("获取脚标为1的元素："+al.get(1));
        System.out.println();

        //获取所有元素
        for(int x = 0; x < al.size(); x++)
        {
            System.out.println("al("+x+")="+al.get(x));
        }
        System.out.println();

        Iterator it = al.iterator();
        while(it.hasNext())
        {
            sop("next:"+it.next());
        }
        System.out.println();

        //通过indexOf获取对象的位置
        sop("index="+al.indexOf("java 09"));
        System.out.println();

        List sub = al.subList(1, 3);
        sop("sub="+sub);
        System.out.println();
    }
}
