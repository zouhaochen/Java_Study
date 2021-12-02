package day14;

import java.util.ArrayList;
import java.util.Iterator;

/*
1. add方法的参数类型是Object，以便于接收任意类型对象
2. 集合中存储的都是对象的引用（地址）

什么是迭代器呢？
其实就是集合的取出元素的方式
把取出方式定义在集合的内部
这样取出方式就可以直接访问集合内部的元素
那么取出方式就被定义成了内部类
而每一个容器的数据结构不同
所以取出的动作细节也不一样
但是都有共性内容：判断和取出，那么可以将这些共性抽取
那么这些内部类都符合一个规则，该规则是Iterator
如何获取集合取出的对象呢？
通过一个对外提供的方法Iterator()
 */
public class Demo01
{
    public static void main(String[] args)
    {
        baseMethod();
        System.out.println();
        supMethod();
        System.out.println();
        getMethod();
        System.out.println();
    }

    public static void baseMethod()
    {
        //创建一个集合容器，使用collection接口的子类ArrayList
        ArrayList al = new ArrayList();

        //1. 添加元素
        al.add("java 01");
        al.add("java 02");
        al.add("java 03");
        al.add("java 04");
        al.add("java 05");

        //2. 获取个数，集合长度
        sop("size: " + al.size());
        System.out.println();

        //打印集合
        sop(al);
        System.out.println();

        //删除元素
        al.remove("java 02");
        sop(al);
        sop("size: " + al.size());
        System.out.println();

        //清空集合
        al.clear();
        sop(al);

        al.add("java 01");
        al.add("java 02");
        al.add("java 03");
        al.add("java 04");
        al.add("java 05");
        //判断元素
        sop("java 03是否存在？"+al.contains("java 03"));
        sop("集合是否为空？"+al.isEmpty());
    }

    public static void supMethod()
    {
        //创建一个集合容器，使用collection接口的子类ArrayList
        ArrayList al1 = new ArrayList();

        al1.add("java 01");
        al1.add("java 02");
        al1.add("java 03");
        al1.add("java 04");
        al1.add("java 05");

        ArrayList al2 = new ArrayList();

        al2.add("java 01");
        al2.add("java 02");
        al2.add("java 03");
        al2.add("java 04");
        al2.add("java 05");
        al2.add("java 06");
        al2.add("java 07");

        //取交集，al1中只会保留与al2中相同的元素
        al1.retainAll(al2);
        /*
        removeAll
        containsAll
        addAll
         */
        sop(al1);
        sop(al2);
    }

    public static void getMethod()
    {
        //创建一个集合容器，使用collection接口的子类ArrayList
        ArrayList al = new ArrayList();

        al.add("java 01");
        al.add("java 02");
        al.add("java 03");
        al.add("java 04");
        al.add("java 05");

        //获取迭代器，用于取出集合中的元素
        Iterator it = al.iterator();
        sop(it.hasNext());

        while(it.hasNext())
        {
            sop(it.next());
        }

        //for循环更有益，对内存占用少 it1使用完后内存中释放
        for(Iterator it1 = al.iterator(); it1.hasNext();)
        {
            sop(it1.next());
        }
    }

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

}
