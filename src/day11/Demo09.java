package day11;

/*
单例设计模式：

1. 饿汉式
class Single
{
    private static final Single s = new Single();
    private Single(){};
    public static Single getInstance()
    {
        return s;
    }
}

2. 懒汉式
class Single
{
    private static Single s = null;
    private Single(){};
    public static Single getInstance()
    {
        if(s==null)
            s = new Single(){};
        return s;
    }
}
 */

class Single
{
    private static Single s = null;
    private Single()
    {
    };
    public static Single getInstance()
    {
        if(s==null)
        {
            synchronized (Single.class)
            {
                if (s == null)
                    s = new Single() {
                    };
            }
        }
        return s;
    }
}

public class Demo09 {
}
