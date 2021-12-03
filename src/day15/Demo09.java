package day15;

/*
泛型定义在接口上
 */

interface Inter<T>
{
    void show(T t);
}

class InterImpl implements Inter<String>
{
    public void show(String t)
    {
        System.out.println("Show:"+t);
    }
}

class InterImplNew<T> implements Inter<T>
{
    public void show(T t)
    {
        System.out.println("Show:"+t);
    }
}

public class Demo09
{
    public static void main(String[] args)
    {
        InterImpl i = new InterImpl();
        i.show("haha");
        System.out.println();

        InterImplNew<Integer> i1 = new InterImplNew<Integer>();
        i1.show(4);
    }
}
