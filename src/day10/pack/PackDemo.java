package day10.pack;

/*
为了简化类名的书写，使用一个关键字: import
import 导入的是包中的类
建议不要写通配符*，需要用到包中的哪个类就导入哪个类

建议定义包名不要重复，可以使用url来完成定义，url是唯一的
 */
import day10.packA.DemoA;
import day10.packB.DemoB;

public class PackDemo
{
    public static void main(String[] args)
    {
        System.out.println("Hello Package");
        System.out.println();

        DemoA d = new DemoA();
        d.show();

        /*
        DemoB b = new DemoB();
        b.method();
         */
    }
}

/*
类名的全名是包名.类名
有了包，范围变大，一个包中的类要被访问，必须要有足够大的权限
所以被访问的类要被public修饰
类公有后，被访问的成员也要公有才可以被访问

总结:
包与包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰
不同包中的子类可以直接访问父类中被protected权限修饰的成员

包与包之间可以使用的权限只有两种:
public
protected

            public  protected   default(什么都不写 默认权限) private
同一个类中    可以     可以         可以                      可以
同一个包中    可以     可以         可以                      不可以
子类         可以     可以         不可以                    不可以
不同包中      可以     不可以       不可以                    不可以
 */
