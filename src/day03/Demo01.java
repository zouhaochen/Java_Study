package day03;

public class Demo01 {
    public static void main(String[] args) {

        /*
        格式：
        定义初始化表达式
        while（条件表达式）
        ｛
        循环体（执行语句）
        ｝
         */
        int x = 1;
        //执行完循环体后自动回到开始再进行判断
        while(x < 3){
            System.out.println("x="+x);
            x++;
        }

        //打印1~10
        int i = 1;
        while(i <= 10)
        {
            System.out.println("i="+i);
            i++;
        }

        //打印1，3，5，7，9
        int j = 1;
        while (j<=9)
        {
            System.out.println("j="+j);
            j+=2;
        }

        int k = 1;
        do {
            System.out.println("k="+k);
            k++;
        }
        while(k<3);
        /*
        while：先判断条件，只有条件满足才执行循环体
        do while：先执行循环体，再判断条件，条件满足再继续执行循环体
        简单一句话：do while：无论条件是否满足，循环体至少执行一次
         */
    }
}
