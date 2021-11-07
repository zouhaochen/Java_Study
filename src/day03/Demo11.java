package day03;

/*
1. 定义一个功能，用于打印矩形
2. 定义一个打印99乘法表功能的函数
 */
public class Demo11 {
    public static void main(String[] args) {
        drawRectangular(5, 8);
        printHorizon();
        drawRectangular(10,11);
        printHorizon();
        print99();
    }

    /*
    定义一个功能，用于打印矩形
    思路：
    1. 确定结果：没有，直接打印。所以返回值类型时void
    2. 有未知内容吗？有，两个，因为矩形的行和列不确定
     */
    public static void drawRectangular(int row, int col)
    {
        for(int x = 0; x < row; x++)
        {
            for(int y = 0; y < col; y ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void printHorizon()
     {
         System.out.println("----------");
     }

     /*
     定义一个打印99乘法表功能的函数
      */
    public static void print99()
    {
        for(int x = 1; x <= 9; x ++)
        {
            for(int y = 1; y <= x; y++ )
            {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
