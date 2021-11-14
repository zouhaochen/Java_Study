package day08;

/*
基础班的学生：学习，睡觉
高级班的学生：学习，睡觉
可以将这两类事物进行抽取
 */

abstract class Student
{
    abstract void study();
    public void sleep()
    {
        System.out.println("Sleep");
    }
}

class BaseStudent extends Student
{
    public void study()
    {
        System.out.println("Base Study");
    }
}

class AdvanceStudent extends Student
{
    public void study()
    {
        System.out.println("Advance Study");
    }
    public void sleep()
    {
        System.out.println("Short Sleep");
    }
}

class DoStudent
{
    public void doSome(Student s)
    {
        s.study();
        s.sleep();
    }
}

public class Demo02 {
    public static void main(String[] args)
    {
        BaseStudent bs = new BaseStudent();
        bs.study();
        bs.sleep();

        AdvanceStudent as = new AdvanceStudent();
        as.study();
        as.sleep();

        DoStudent ds = new DoStudent();
        ds.doSome(new BaseStudent());
        ds.doSome(new AdvanceStudent());
    }
}
