package day15;

import java.util.Iterator;
import java.util.TreeSet;

/*
Set：无序，不可重复元素
    |--HashSet: 数据结构是哈希表，线程是非同步的
                保证元素唯一性的原理：判断元素的HashCode值是否相同
                如果相同，还会继续判断元素的equals方法是否为真
    |--TreeSet: 可以对Set集合中的元素进行排序
                底层数据结构是二叉树
                保证元素唯一性的依据是: compareTo方法return 0

                TreeSet排序的第一种方式：让元素自身具备比较性
                元素需要实现Comparable接口，覆盖CompareTo方法
                这种方式也成为元素的自然顺序，或者叫做默认顺序

                TreeSet排序的第二种方式：
                当元素自身不具备比较性时，或者具备的比较性不是所需要的
                这时就需要让集合自身具备比较性


 */

/*
需求：
往TreeSet集合中存储自定义对象学生
想按照学生的年龄进行排序

记住：
排序时，当主要条件相同时，一定要判断一下次要条件
 */
public class Demo01
{
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        TreeSet ts1 = new TreeSet();
        ts1.add("abcd");
        ts1.add("aaaa");
        ts1.add("bbbb");
        ts1.add("cccc");

        Iterator it1 = ts1.iterator();

        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }

        TreeSet ts2 = new TreeSet();

        ts2.add(new Student("LiSi01",22));
        ts2.add(new Student("LiSi02",20));
        ts2.add(new Student("LiSi03",19));
        ts2.add(new Student("LiSi04",40));
        ts2.add(new Student("LiSi05",40));

        Iterator it2 = ts2.iterator();

        while(it2.hasNext())
        {
            Student stu = (Student)it2.next();
            System.out.println(stu.getName()+", "+stu.getAge());
        }
    }

}

class Student implements Comparable //该接口强制让学生具备比较性
{
    private String name;
    private int age;

    Student (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Object obj) //覆盖方法
    {
        if(!(obj instanceof Student))
            throw new RuntimeException("不是学生对象");
        Student s = (Student)obj;

        if(this.age > s.age)
            return 1;
        if(this.age == s.age)
        {
            return this.name.compareTo(s.name);
        }
        return -1;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

}
