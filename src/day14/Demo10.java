package day14;

import java.util.HashSet;
import java.util.Iterator;

/*
往hashSet集合中存入自定义对象
姓名和年龄相同为同一个人，重复元素

HashSet是如何保证元素唯一性的呢？
是通过元素的两个方法：hashCode和equals来完成的
如果元素的HashCode值相同，才会判断equals是否为true
如果元素的HashCode值不同，不会调用equals

注意：对于判断元素是否存在以及删除等操作，依赖的方法是元素的hashcode和equals方法
 */
public class Demo10
{
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        HashSet hs = new HashSet();

        hs.add(new PersonHash("Mike", 11));
        hs.add(new PersonHash("Lucy", 21));
        hs.add(new PersonHash("Lily", 31));
        hs.add(new PersonHash("Lucy", 21));

        sop("Mike contains: "+hs.contains(new PersonHash("Mike",11)));


        Iterator it = hs.iterator();

        while(it.hasNext())
        {
            PersonHash p = (PersonHash)it.next();
            sop(p.getName()+";"+p.getAge());
        }

        sop("Mike contains: "+hs.remove(new PersonHash("Lucy",21)));
    }
}

class PersonHash
{
    private String name;
    private int age;

    PersonHash(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //复写hashCode
    public int hashCode()
    {
        System.out.println(this.name+" hash code");
        return name.hashCode()+age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof PersonHash))
            return false;
        PersonHash p = (PersonHash) obj;
        System.out.println(this.name+" equals "+p.name);
        return this.name.equals(p.name) && this.age == p.age;
    }

}