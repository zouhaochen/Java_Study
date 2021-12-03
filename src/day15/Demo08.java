package day15;

/*
泛型类定义的泛型，在整个类中有效
如果被方法使用，那么泛型类的对象明确要操作的具体类型后，所有要操作的类型就已经固定了
为了让不同方法可以操作不同类型，而且类型还不确定，那么可以将泛型定义在方法上

特殊之处：
静态方法不可以访问类上定义的泛型
如果静态方法操作的引用数据类型不确定，可以将泛型定义在方法上
泛型定义在返回值类型之前
 */
class Demo<E>
{
    public <T> void show(T t)
    {
        System.out.println("show:"+t);
    }
    public <Q> void print(Q q)
    {
        System.out.println("print:"+q);
    }
    public static <W> void method(W w)
    {
        System.out.println("method:"+w);
    }
}

public class Demo08
{
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.show("haha");
        d.show(new Integer(4));
        d.print("heihei");
        d.print(new Integer(9));
        Demo<String> d1 = new Demo<String>();
        d1.show("haha");
        d1.show(new Integer(8));
    }
}
