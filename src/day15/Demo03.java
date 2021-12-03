package day15;

/*
当元素自身不具备比较性，或具备的比较性不是所需要的
这时需要让容器自身具备比较性
定义了比较器，将比较器对象作为参数传递给TreeSet集合的构造函数

当两种排序都存在时，以比较器为主
定义一个类，实现Comparator接口，覆盖compare方法
 */


import java.util.Comparator;

public class Demo03
{
    public static void main(String[] args)
    {

    }
}

class MyCompare implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        int num = s1.getName().compareTo(s2.getName());
        if(num == 0)
        {
            return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
            /*
            if (s1.getAge()>s2.getAge())
                return 1;
            if (s1.getAge()==s2.getAge())
                return 0;
            return -1;
            */
        }
        return num;
    }
}
