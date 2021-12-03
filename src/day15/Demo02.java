package day15;

/*
怎么存怎么取(正序)

将
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
改为
    public int compareTo(Object obj) //覆盖方法
    {
        return 1;
    }

倒序
    public int compareTo(Object obj) //覆盖方法
    {
        return -1;
    }
 */
public class Demo02
{

}
