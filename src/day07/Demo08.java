package day07;

/*
继承与接口的区别
继承：你是我其中的一种, is a, 是所属于我的
接口：扩展功能，你像一个老师，你并不是一个老师, like a
 */
abstract class StudentNew
{
    abstract void study();
    void sleep()
    {
        System.out.println("sleep");
    }
    /*
    abstract void smoke();
    */
}

interface Smoking
{
    void smoke();
}

class Member extends StudentNew implements Smoking
{
    void study(){}
    public void smoke(){}
}

class Professor implements Smoking
{
    public void smoke(){}
}

public class Demo08 {
}
