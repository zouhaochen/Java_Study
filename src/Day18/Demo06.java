package Day18;

public class Demo06
{
    public static void main(String[] args)
    {
        /*
        ceil: 返回大于指定数据的最小整数
         */
        double d1 = Math.ceil(12.34);
        sop("d1="+d1);
        double d2 = Math.ceil(16.34);
        sop("d2="+d2);
        double d3 = Math.ceil(-12.34);
        sop("d3="+d3);

        /*
        floor: 返回小于指定数据的最大整数
         */
        double d4 = Math.floor(12.34);
        sop("d4="+d4);

        /*
        round: 四舍五入
         */
        long l = Math.round(12.34);
        sop("l="+l);

        /*
        pow: 幂
         */
        double d5 = Math.pow(2, 3);
        sop("d5="+d5);
    }
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
}
