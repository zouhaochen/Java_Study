package day15;

/*
什么时候定义泛型类？
当类中要操作的引用数据类型不确定的时候
早期定义Object来完成扩展，现在定义泛型来完成扩展
 */
public class Demo07
{
    public static void main(String[] args)
    {
        Tool t = new Tool();
        t.setWorker(new Worker());
        Worker w1 = (Worker)t.getWorker();

        Utils<Worker> u = new Utils<Worker>();
        u.setE(new Worker());
        Worker w2 = u.getE();
    }
}

class Worker
{

}

class Teacher
{

}

//泛型前做法
class Tool
{
    private Object obj;

    public void setWorker(Worker obj)
    {
        this.obj = obj;
    }

    public Object getWorker()
    {
        return obj;
    }
}

//泛型后做法
class Utils<E>
{
    private E e;
    public void setE(E e)
    {
        this.e = e;
    }
    public E getE()
    {
        return e;
    }
}
