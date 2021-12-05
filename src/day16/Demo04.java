package day16;

/*
每个学生都有对应的归属地
学生Student, 地址String
学生属性: 姓名，年龄
注意: 姓名和年龄相同视为同一个学生
保证学生的唯一性

1. 描述学生
2. 定义map容器，将学生作为键，地址作为值，存入
3. 获取map集合中的元素
*/

import java.util.*;

class Student implements Comparable<Student>
{
    private String name;
    private int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student s)
    {
        int num = new Integer(this.age).compareTo(new Integer(s.age));
        if(num == 0)
            return this.name.compareTo(s.name);
        return num;
    }

    public int hashCode()
    {
        return name.hashCode()+age*34;
    }

    //保证键的唯一性
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Student))
            throw new ClassCastException("类型不匹配");
        Student s = (Student)obj;

        return this.name.equals(s.name) && this.age == s.age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return name+": "+age;
    }
}

public class Demo04
{
    public static void main(String[] args)
    {
        HashMap<Student, String> hm = new HashMap<Student, String>();
        hm.put(new Student("abc1", 21), "Beijing");
        hm.put(new Student("abc2", 22), "Shanghai");
        hm.put(new Student("abc3", 23), "Nanjing");
        hm.put(new Student("abc4", 24), "Wuhan");
        hm.put(new Student("abc4", 24), "Tianjin");

        //第一种取出方式 keySet
        Set<Student> keySet = hm.keySet();

        Iterator<Student> it = keySet.iterator();

        while(it.hasNext())
        {
            Student stu = it.next();
            String addr = hm.get(stu);
            System.out.println(stu+", "+addr);
        }

        System.out.println();

        //第二种取出方式 entrySet
        Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
        Iterator<Map.Entry<Student, String>> it1 = entrySet.iterator();

        while(it1.hasNext())
        {
            Map.Entry<Student, String> me = it1.next();
            Student stu = me.getKey();
            String addr = me.getValue();
            System.out.println(stu+", "+addr);
        }

        System.out.println();

        /*
        需求：对学生对象的年龄进行升序排序
        因为数据是以键值对形式存在的
        所以要使用可以排序的Map集合：TreeMap
        */
        TreeMap<Student, String> tm = new TreeMap<Student, String>();
        tm.put(new Student("abc1", 28), "Beijing");
        tm.put(new Student("abc2", 22), "Shanghai");
        tm.put(new Student("abc3", 27), "Nanjing");
        tm.put(new Student("abc4", 21), "Wuhan");
        tm.put(new Student("abc4", 25), "Tianjin");

        Set<Map.Entry<Student, String>> entrySet1 = tm.entrySet();

        Iterator <Map.Entry<Student, String>> it2 = entrySet1.iterator();

        while (it2.hasNext())
        {
            Map.Entry<Student, String> me = it2.next();
            Student stu = me.getKey();
            String addr = me.getValue();
            System.out.println(stu+", "+addr);
        }

        System.out.println();


        /*
        需求：对学生对象的姓名进行升序排序
        因为数据是以键值对形式存在的
        所以要使用可以排序的Map集合：TreeMap
        */
        TreeMap<Student, String> tm1 = new TreeMap<Student, String>(new StudentNameComparator());
        tm1.put(new Student("aaaaaaa", 28), "Beijing");
        tm1.put(new Student("aaa", 22), "Shanghai");
        tm1.put(new Student("aaaaa", 27), "Nanjing");
        tm1.put(new Student("aa", 21), "Wuhan");
        tm1.put(new Student("a", 25), "Tianjin");

        Set<Map.Entry<Student, String>> entrySet2 = tm1.entrySet();

        Iterator <Map.Entry<Student, String>> it3 = entrySet2.iterator();

        while (it3.hasNext())
        {
            Map.Entry<Student, String> me = it3.next();
            Student stu = me.getKey();
            String addr = me.getValue();
            System.out.println(stu+", "+addr);
        }

        System.out.println();
    }
}

class StudentNameComparator implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        int num = s1.getName().compareTo(s2.getName());
        if(num==0)
            return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
        return num;
    }
}
