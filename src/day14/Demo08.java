package day14;
/*
Collection
    |--List: 元素是有序的，元素可以重复。因为该集合体系有索引
        |--ArrayList: 底层的数据结构使用的是数组结构，特点：查询速度快，但是增删稍慢，线程不同步
        |--LinkedList: 底层的数据结构使用的是链表结构，特点：增删速度很快，但是查询速度慢
        |--Vector：底层的数据结构使用的是数组数据结构，Vector出现较早，ArrayList出现较晚，线程同步，被ArrayList替代
    |--Set: 元素是无序的（存入和取出的顺序不一致），元素不可以重复
        |--HashSet: 底层数据结构是哈希表
        |--TreeSet
            Set集合的功能和Collection是一致的
*/

class Demo
{
    public int hashCode()
    {
        return 60;
    }
}

/*
哈希表先看哈希值
哈希值相同再比较是否是同一个对象
 */

class HashSetDemo
{
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        sop(d1);
        sop(d2);
    }
}