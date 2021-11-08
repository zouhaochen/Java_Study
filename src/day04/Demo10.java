package day04;

public class Demo10 {
    public static void main(String[] args) {

        //一维数组
        int[] arr1 = new int[3];
        //定义了名称为arr2的二维数组，二维数组中有三个一维数组
        //每一个一维数组中有四个元素
        int[][] arr2 = new int [3][4];
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[0][1]);

        int [][] arr3 = new int [3][];
        System.out.println(arr3);
        System.out.println(arr3[0]);

        arr3[0] = new int[3];
        arr3[1] = new int[2];
        arr3[2] = new int[1];

        //打印二维数组长度
        System.out.println(arr3.length);
        //打印二维数组中第一个一维数组的长度
        System.out.println(arr3[0].length);

        int[][] arr4 = {{3, 5, 1, 7}, {6, 8, 7, 9}, {1, 2, 3, 4}};

        int sum = 0;
        for(int x = 0; x < arr4.length; x++){
            for(int y = 0; y < arr4[x].length; y++)
            {
                sum = sum + arr4[x][y];
            }
        }
        System.out.println("sum = "+sum);
    }
    /*
    练习：
    一维数组定义方式：int[] x; int x[];
    二维数组定义方式：int[][] y; int y [][]; int[] y[];
    中括号定义在类型中是随着类型走的，类型中括号后的变量都有效
    如果中括号跟着变量走，只有单位变量有效
    int[] x, y[]: x一维, y二维

    a.
    x[0] = y;   //ERROR
    b.
    y[0] = x;   //YES
    c.
    y[0][0] = x;//ERROR
    d.
    x[0][0] = y;//ERROR
    e.
    y[0][0] = x[0];//YES
    f.
    x = y;      //ERROR
     */
}
