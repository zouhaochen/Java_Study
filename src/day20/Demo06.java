package day20;

public class Demo06
{
    public static void main(String[] args)
    {
        System.out.println(getSum(8000)); //当n过大时: StackOverflowError
    }

    /*
    ->3
    3!=1
    return 3+getSum(2)

    ->2
    2!=1
    return 3+2+getSum(1)

    ->1
    1 = 1
    return 3+2+1
     */
    public static int getSum(int n)
    {
        if(n==1)
            return 1;
        return n+getSum(n-1);
    }
}
