package day10;

/*
注: 按Java规范书写程序代码，如果你认为程序有错误，请指出，并说明程序错误原因
---------------------------------------------------------------
1. 写出程序结果
class Demo
{
    public static void func()
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            System.out.print("B");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            func();
            System.out.println("A");
        }
        catch(Exception e)
        {
            System.out.println("C");
        }
        System.out.println("D")
    }
}

编译失败
如果func方法上声明了该异常，结果是: B C D
---------------------------------------------------------------
2. 写出程序结果
class Test
{
    Test()
    {
        System.out.println("Test");
    }
}
class Demo extends Test
{
    Demo()
    {
        super();
        System.out.println("Demo");
    }
    public static void main(String[] args)
    {
        new Demo();
        new Test();
    }
}

Test
Demo
Test
考察子类的实例化过程
---------------------------------------------------------------
3. 写出程序结果
interface A()
class B implements A
{
    public String func()
    {
        return "func";
    }
}
class Demo
{
    public static void main(String[] args)
    {
        A a = new B();
        System.out.println(a.func());
    }
}

编译失败:
因为A接口中并未定义func方法
---------------------------------------------------------------
4. 写出程序结果
class Fu
{
    boolean show(char a)
    {
        System.out.println(a);
        return false;
    }
}
class Demo extends Fu
{
    public static void main(String[] args)
    {
        int i = 0;
        Fu f = new Demo();
        Demo d = new Demo();
        for(f.show('A'); f.show('B') && (i<2); f.show('C'))
        {
            i++;
            d.show('D');
        }
    }
    boolean show(char a)
    {
        System.out.println(a);
        return false;
    }
}

A B
---------------------------------------------------------------
5. 写出程序结果
interface A()
class B implements A
{
    public String test()
    {
        return "yes";
    }
}
class Demo
{
    static A get()
    {
        return new B();
    }
    public static void main(String[] args)
    {
        A a = get();
        System.out.println(a.test());
    }
}

编译失败
A接口中没有定义test方法
---------------------------------------------------------------
6. 写出程序结果
class Super
{
    int i = 0;
    public Super(String a)
    {
        System.out.println("A");
        i = 1;
    }
    public Super()
    {
        System.out.println("B");
        i+=2;
    }
}
class Demo extends Super
{
    public Demo(String s)
    {
        System.out.println("C")
        i = 5;
    }
    public static void main(String[] args)
    {
        int i = 4;
        Super d = new Demo("A");
        System.out.println(d, i);
    }
}

B
C
5
---------------------------------------------------------------
7.
interface Inter
{
    void show(int a, int b);
    void func();
}
class Demo
{
    public static void main(String[] args)
    {
        //补足代码；调用两个函数，要求用匿名内部类
        Inter in = new Inter()
        {
            public void show(int a, int b)
            {
            }
            public void func()
            {
            }
        };

        in.show(4, 5);
        in.func();
    }
}
---------------------------------------------------------------
8. 写出程序结果
class TD
{
    int y = 6;
    class Inner
    {
        static int y = 3;
        void show()
        {
            System.out.println(y);
        }
    }
}
class TC
{
    public static void main(String[] args)
    {
        TD.Inner ti = new TD().new Inner();
        ti.show();
    }
}

编译失败
非静态内部类中不可以定义静态成员
内部类中如果定义了静态成员，该内部类必须被静态修饰
---------------------------------------------------------------
9. 选择题，写出错误答案错误的原因，用单行注释的方式
class Demo
{
    int show(int a, int b) {return 0}
}
下面哪些函数可以存在于Demo的子类中
A. public int show(int a, int b){return 0;}
//可以 覆盖
B. private int show(int a, int b){return 0;}
//不可以 权限不够
C. private int show(int a, long b){return 0;}
//可以 和父类不是一个函数 没有覆盖 相当于重载
D. public short show(int a, int b){return 0;}
//不可以 因为该函数不可以和给定函数出现同一类中 或者子父类中
E. static int show(int a, int b){return 0;}
//不可以，静态只能覆盖静态
---------------------------------------------------------------
10. 写出this关键字的含义，final有哪些特点?
this: 代表本类对象，哪个对象调用this所在的函数，this就代表哪个对象
final:
1. 修饰类，变量（成员变量，静态变量，局部变量），函数
2. 修饰的类不可以被继承
3. 修饰的函数不可以被覆盖
4. 修饰的变量是一个常量，只能被赋值一次
5. 父类只能访问局部中的final修饰变量
---------------------------------------------------------------
11、 写出程序结果
class Fu
{
    int num = 4;
    void show()
    {
        System.out.println("showFu");
    }
}
class Zi extends Fu
{
    int num = 5;
    void show()
    {
        System.out.println("showZi");
    }
}
class T
{
    public static void main(String[] args)
    {
        Fu f = new Zi();
        Zi z = new Zi();
        System.out.println(f.num);
        System.out.println(z.num);
        f.show();
        z.show();
    }
}

4
5
showZi
showZi
---------------------------------------------------------------
12.
interface A
{
    void show();
}
interface B
{
    void add (int a, int b);
}
class C implements A, B
{
    //程序代码
    private int a, b;
    public void add(int a, int b)
    {
        this.a = a;
        this.b = b
    }
    public void show()
    {
        System.out.println(a+b);
    }
}
class D
{
    public static void main(String[] args)
    {
        C c = new C();
        c.add(4, 2);
        c.show();//通过该函数打印以上两个数的和
    }
}
---------------------------------------------------------------
13. 写出程序结果
class Demo
{
    public static void main(String[] args)
    {
        try
        {
            showExce();
            System.out.println("A");
        }
        catch(Exception e)
        {
            System.out.println("B");
        }
        finally
        {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void showExce() throws Exception
    {
        throw new Exception();
    }
}

B
C
D
---------------------------------------------------------------
14. 写出程序运行结果
class Super
{
    int i = 0;
    public Super(String s)
    {
        i = 1;
    }
}
class Demo extends Super
{
    public Demo(String s)
    {
        i = 2;
    }
    public static void main(String[] args)
    {
        Demo d = new Demo("yes");
        System.out.println(d.i);
    }
}

编译失败
因为父类中缺少空参数的构造函数
或者子类应该通过super语句指定要调用的父类中的构造函数
---------------------------------------------------------------
15. 写出程序结果
class Super
{
    public int get(){return 4;}
}
class Demo15 extends Super
{
    public long get(){return 5;}
    public static void main(String[] args)
    {
        Super s = new Demo15();
        System.out.println(s.get());
    }
}

编译失败
因为子父类中的get方法没有覆盖
但是子类调用的时候不能明确返回的值是什么类型
所以这样的函数不可以存在于子父类中
---------------------------------------------------------------
16. 写出程序觉果
class Demo
{
    public static void func()
    {
        try
        {
            throw new Exception();
            System.out.println("A")
        }
        catch(Exception e)
        {
            System.out.println("B");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            func();
        }
        catch(Exception e)
        {
            System.out.println("C");
        }
        System.out.println("D")
    }
}

编译失败
因为打印字符串A的输出语句执行不到
记住:
throw单独存在时，下面不要定义语句，因为执行不到
---------------------------------------------------------------
17.
class Demo
{
    public void func()
    {
        //位置1
    }
    class Inner()
    public static void main(String[] args)
    {
        Demo d = new Demo();
        //位置2
    }
}

A. 在位置1写 new Inner(); //正确
B. 在位置2写 new Inner();  //不可以 因为主函数是静态的 如果要访问Inner需要被static修饰
C. 在位置2写 new d.Inner(); //错误 格式错误
D. 在位置2写 new Demo.Inner(); //错误 因为Inner不是静态的
---------------------------------------------------------------
18. 写出程序结果
class Exc0 extends Exception()
class Exc1 extends Exc0()

class Demo
{
    public static void main(String[] args)
    {
        try
        {
            throw new Exc1();
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        catch(Exc0 e)
        {
            System.out.println("Exc0");
        }
    }
}

编译失败
多个catch时，父类的catch要放在下面
---------------------------------------------------------------
19.
Interface Test
{
    void func();
}
class Demo
{
    public static void main(String[] args)
    {
        //补足代码:(匿名内部类)
        new Demo().show(new Test()
        {
            public void func(){}
        });
    }
    void show(Test t)
    {
        t.func();
    }
}
---------------------------------------------------------------
20. 写出程序结果
class Test
{
    public static String output="";
    public static void foo(int i)
    {
        try
        {
            if(i == 1)
                throw new Exception();
            output+="1";
        }
        catch(Exception e)
        {
            output+="2";
            return;
        }
        finally
        {
            output+="3";
        }
        output+="4"
    }
    public static void main(String[] args)
    {
        foo(0);
        System.out.println(output); //134
        foo(1);
        System.out.println(output); //13423
    }
}
---------------------------------------------------------------
21.
建立一个图形借口，声明一个面积函数。圆形和矩形都实现这个借口，并得出两个图形的面积。
注: 体现面向对象的特征，对数值进行判断。用异常处理。不合法的数值要出现"这个数值是非法的"提示，不再进行运算
---------------------------------------------------------------
22.
补足compare函数内的代码，不许添加其他函数
class Circle
{
    private static double pi = 3.14;
    private double radius;
    public Circle(double r)
    {
        radius = r;
    }
    public static double compare(Circle[] cir)
    {
        //程序代码
        //其实就是在求数组中的最大值
        int max = 0;
        for(int x = 1; x < cir.length; x++)
        {
            if(cir[x].radius > cir[max].radius)
                max = x;
        }
        return cir[max].radius
    }
}
class TC
{
    public static void main(String[] args)
    {
        Circle cir[] = new Circle[3];//创建了一个类类型数组
        cir[0] = new Circle(1.0);
        cir[1] = new Circle(2.0);
        cir[2] = new Circle(4.0);
        System.out.println("最大的半径值是:"+Circle.compare(cir));
    }
}
---------------------------------------------------------------
23. 写出程序结果
public class Demo
{
    private static int j = 0;
    private static boolean methodB(int x)
    {
        j+=k;
        return true;
    }
    public static void methodA(int i)
    {
        boolean b;
        b = i < 10 | methodB(4);
        b = i < 10 || methodB(8);
    }
    public static void main(String args[])
    {
        methodA(0);
        System.out.println(j);
    }
}

4
---------------------------------------------------------------
24.
假如我们在开发一个系统时需要对员工进行建模
员工包含三个属性：姓名、工号以及工资。
经理也是员工，除了含有员工的属性外，另外还有一个奖金的属性。
请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问
---------------------------------------------------------------
25.
在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符。
如果存在，则返回这个字符在字符数组中第一次出现的位置（序号从0开始计算），
否则，返回-1.要搜索的字符数组和字符都以参数形式传递给该方法，
如果传入的数组为null，应抛出IllegalArgumentException异常。
在类的main方法中以各种可能出现的情况测试验证该方法编写得是否正确，
例如，字符不存在，字符存在，传入的数组为null等。

public int getIndex(char[] arr, char key)
{
    if(arr==null)
    {
        throw new IllegalArgumentException("数组为null")
    }
    for(int x = 0; x < arr.length; x++)
    {
        if(arr[x] == key)
            return x;
    }
    return -1;
}

---------------------------------------------------------------
26.
补足compare函数内的代码，不需添加其他函数
class Circle
{
    private double radius;
    public Circle (double r)
    {
        radius r;
    }
    public Circle compare(Circle cir)
    {
        //程序代码
        return (this.radius>cir.radius) ?this:cir;
    }
}
class TC
{
    public static void main(String[] args)
    {
        Circle cir1 = new Circle(1, 0);
        Circle cir2 = new Circle(2, 0);
        Circle cir;
        cir = cir1.compare(cir2);
        if(cir1 == cir)
            System.out.println("圆1的半径比较大");
        else
            System.out.println("圆2的半径比较大");
    }
}
 */
public class Demo06 {
}
