package day03;

public class Demo03 {
    public static void main(String[] args) {

        /*
        System.out.println("b")非boolean，程序无法运行
        for(System.out.println("a"); System.out.println("b"); System.out.println("c"))
        {
            System.out.println("d");
        }
        */
        int x = 1;
        for(System.out.println("a"); x<3; System.out.println("c"))
        {
            System.out.println("d");
            x++;
        }

        //多表达式出现时用逗号分隔开
        int y = 1;
        for(System.out.println("a"); y<3; System.out.println("c"), y++)
        {
            System.out.println("d");
        }

        for(int z = 0; z < 3; z++)
        {
        }

        int z = 0;
        for( ; z < 3;)
        {
            z++;
        }
        /*
        无限循环的最简单表现形式：
        for(;;){}
        while(true){}
         */

    }
}
