package day03;

/*
1. 获取1~10的和并打印
2. 1~100之间7的倍数的个数，并打印
 */
public class Demo04 {
    public static void main(String[] args) {

        //1. 定义变量用于存储不断变化的和
        int sum = 0;

        //2. 定义变量，记录住不断变化被加的数
        int x = 1;

        //3. 定义循环，重复加法的过程
        while(x<=10)
        {
            sum = sum + x;
            x++;
        }
        System.out.println("sum"+sum);

        /*
        循环注意：
        一定要明确哪些语句需要参与循环，那些不需要
         */

        for(x = 1; x <= 10; x++)
        {
            sum = sum + x;
        }
        System.out.println("sum"+sum);

        /*
        2题思路：
        1. 先对1~100进行遍历（循环）
        2. 在遍历的过程中定义条件，只对7的倍数进行操作
        2题步骤
        1. 定义循环语句，选择for语句
        2. 在循环中定义判断，只要是7的倍数即可，使用if语句。条件：7的倍数x%7==0
         */
        int count = 0;
        for(int y = 1; y < 100; y++)
        {
            if(y%7 == 0)
                count ++;
                System.out.println("y="+y);
        }
        System.out.println("count="+count);
        /*
        这就是累加思想，通过变量记录住每次变化的结果，通过循环的形式进行累加的动作
         */
        /*
        计数器思想：通过一个变量记录住数据的状态变化
        也需要通过循环完成
         */
    }
}
