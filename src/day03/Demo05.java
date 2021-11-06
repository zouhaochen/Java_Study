package day03;

/*
语句嵌套形式：语句中还有语句
循环嵌套形式：循环中还有循环
 */
public class Demo05 {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 4; y ++)
            {
                System.out.println("ok");
            }
        }

        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 4; y ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*
        对于打印长方形，外循环控制的是行数，内循环控制的是每一行的列数，也就是一行中元素的个数
         ****
         ****
         ****
         */

        /*
         *****
         ****
         ***
         **
         *
        发现有很多行，每一行有很多列
        要使用嵌套循环操作
         */
        int count = 5;
        for(int x= 0; x < 5; x++)
        {
            for(int y = 0; y < count; y++)
            {
                System.out.print("*");
            }
            System.out.println();
            count--;
        }

        System.out.println();

        int start = 0;
        for(int x= 0; x < 5; x++)
        {
            for(int y = start; y < 5; y++)
            {
                System.out.print("*");
            }
            System.out.println();
            start++;
        }
    }
}
