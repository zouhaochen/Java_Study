package day03;

public class Demo07 {
    public static void main(String[] args) {

        // break
        for(int x = 0; x< 3; x++)
        {
            System.out.println("x="+x);
            break;
        }
        System.out.println();

        w: for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 4; y++)
            {
                System.out.println("x="+x);
                break w;
            }
        }
        System.out.println();

        //continue：只能作用于循环结构
        for (int x = 0; x < 3; x ++)
        {
            System.out.println("x="+x);
            continue;
        }
        System.out.println();

        //continue：只能作用于循环结构，继续循环。特点：结束本次循环，继续下次循环
        for (int x = 0; x <= 10; x++)
        {
            if(x%2 == 1)
                continue;
            System.out.println("x="+x);
        }
        System.out.println();

        w: for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 4; y++)
            {
                System.out.println("x="+x);
                continue w;
            }
        }
        /*
        记住：
        1. break和continue语句作用的范围
        2. break和continue单独存在时，下面不可以有任何语句，因为都执行不到
         */
    }
}
