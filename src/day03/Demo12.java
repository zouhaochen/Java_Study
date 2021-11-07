package day03;

/*
什么时候使用重载？
当定义的功能相同，但参与运算的未知内容不同时
那么这时就定义一个函数名称以表示其功能方便阅读
而通过参数列表的不同来区分多个同名函数
 */
public class Demo12 {
    public static void main(String[] args) {

        System.out.println(addInt(4, 5));
        System.out.println(addInt(4, 5, 6));
        print99();
        print99(100);
    }

    /*
    定义一个加法运算，获取两个整数的和
     */
    public static int addInt(int x, int y)
    {
        return x + y;
    }

    /*
    定义一个加法运算，获取三个整数的和
     */
    public static int addInt(int x, int y, int z)
    {
        return x + y + z;
    }


    /*
    定义一个打印99乘法表功能的函数
    函数内部调用函数，提高代码重用性
    */
    public static void print99()
    {
        print99(9);
    }

    /*
    定义一个打印99乘法表功能的函数，要打到几由用户确定
    */
    public static void print99(int num)
    {
        for(int x = 1; x <= num; x ++)
        {
            for(int y = 1; y <= x; y++ )
            {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }

    /*
    练习：以下哪个选项与给定函数重载
    void show(int a, char b, double c)
    a.
    void show(int x, char y, double z){}//没有，因为和原函数一样
    b.
    int show(int a, double c, char b){}//重载了，因为参数类型不同，参数是有顺序的。注意：重载和返回值类型无关
    c.
    void show(int a, double c, char b){}//重载了
    d.
    boolean show(int c, char b){}//重载了，因为参数个数不同
    e.
    void show(double c){}//重载了，因为参数个数不同
    f.
    double show(int x, char y, double z){}//没有，此函数不允许与给定函数同时存在于一个类中
     */


}
