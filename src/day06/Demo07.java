package day06;

/*
写法1:
先初始化对象，成为饿汉式
class Single
{
    private int num;
    public void setNum(int num)
    {
        this.num = num;
    }
    public int getNum()
    {
        return num;
    }
    private Single(){}
    private static Single s = new Single();

    public static Single getInstance()
    {
        return s;
    }
}
饿汉式特点：Single类一进内存就已经创建好了对象
懒汉式特点：Single类进内存，对象还没有存在，只有调用了getInstance方法时，才建立对象
 */

//写法2：对象时方法被调用时，才初始化，也叫做对象的延时加载，成为懒汉式
class SingleNew
{
    private static SingleNew s = null;
    private SingleNew(){}

    public static SingleNew getInstance()
    {
        if(s == null)
            s = new SingleNew();
        return s;
    }
}

public class Demo07 {
}
