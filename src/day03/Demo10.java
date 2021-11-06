package day03;

public class Demo10 {
    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("sum="+sum);

        int sumNew = getSunNew(4, 6);
        System.out.println("new sum="+sumNew);

        System.out.println(compareValue(4, 6));
        System.out.println(compareValueNew(1,1));
        System.out.println(compareValueNewNew(1,1));
        System.out.println(getMax(3, 4));
        System.out.println(getMaxNew(8, 7));
    }

    /*
    如何定义一个函数呢？
    1. 既然函数是一个独立的功能，那么该功能的运算结果是什么先明确（返回值类型）
    2. 再明确在定义该功能的过程中是否需要未知的内容参与运算（参数列表）
     */
    //需求：定义一个功能，完成3+4的运算并将结果返回给调用者
    /*
    1. 明确功能的结果：是一个整数的和
    2. 在实现该功能的过程中是否有未知的功能参与运算？无
    其实这两个功能就是在明确函数的定义
    1. 是在明确函数的返回值类型
    2. 是在明确函数的参数列表 (参数的类型和参数的个数)
     */
    public static int getSum()
    {
        return 3 + 4;
    }
    /*
    以上这个函数的功能结果是固定的，毫无扩展性可言
    为了方便用户需求，由用户来指定加数和被加数，这样功能才有意义
    思路：
    1. 功能结果是一个整数的和，返回值类型是int
    2. 有未知内容参与运算，有两个。这两个未知内容的类型都是int
     */
    public static int getSunNew(int x, int y)
    {
        return x + y;
    }

    /*
    需求：判断两个数是否相同
    思路：
    1. 明确功能结果：结果是boolean
    2. 功能是否有未知内容参与运算：有，两个整数
     */
    public static boolean compareValue(int a, int b)
    {
        if(a == b)
        {
            return true;
        }
        else
            return false;
    }

    public static boolean compareValueNew(int a, int b)
    {
        return (a==b) ? true : false;
    }

    public static boolean compareValueNewNew(int a, int b)
    {
        return a==b;
    }

    /*
    需求：定义功能，对两个数进行比较，获取较大的数
     */
    public static int getMax(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }
    public static int getMaxNew(int a, int b)
    {
        return (a > b) ? a : b;
    }
}
