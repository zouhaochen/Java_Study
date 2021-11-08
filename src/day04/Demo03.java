package day04;

/*
给定一个数组｛5,1,6,4,2,8,9｝
1. 获取数组中的最大值，以及最小值
 */
public class Demo03 {
    /*
    获取数组中的最大值
    思路：
    1. 获取最值需要进行比较，每一次比较都会有一个较大的值
       因为该值不确定，通过一个变量进行临时存储
    2. 让数组中的每一个元素都和这个变量中的值进行比较
       如果大雨了变量中的值，就用该变量记录较大的值
    3. 当所有的元素都比较完成，那么该变量中存储的就是数组中的最大值

    步骤：
    1. 定义变量，初始化为数组中的任意一个元素
    2. 通过循环语句对数组进行遍历
    3. 在遍历过程中定义判断条件，如果遍历到的元素比变量中的元素大，就赋值给该变量

    需要定义一个功能来完成，以便提高复用性
    1. 明确结果：数组中的元素 int
    2. 未知内容：一个数组 int[]
     */
    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 4, 2, 8, 9};
        int max = getMax(arr);
        int maxNew = getMaxNew(arr);
        int min = getMin(arr);
        System.out.println("max="+max);
        System.out.println("max new="+maxNew);
        System.out.println("min="+min);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int x = 1; x < arr.length; x++)
        {
            if(arr[x] > max)
                max = arr[x];
        }
        return max;
    }

    /*
    获取最大值的另一种方式：
    可不可以将临时变量初始化为0
    可以初始化为元素，也可以初始化为脚标
    可以，这种方式其实是在初始化为数组中任意以一个脚标
     */

    public static int getMaxNew(int[] arr){
        int max = 0;
        for (int x = 1; x < arr.length; x++)
        {
            if(arr[x] > arr[max])
                max = x;
        }
        return arr[max];
    }

    /*
    获取double类型数据的最大值，因为功能一致，所以定义相同的函数名称，以重载形式存在
     */
    public static double getMax(double[] arr){
        double max = arr[0];
        for (int x = 1; x < arr.length; x++)
        {
            if(arr[x] > max)
                max = arr[x];
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = 0;
        for(int x = 1; x < arr.length; x++)
        {
            if(arr[x] < arr[min])
                min = x;
        }
        return arr[min];
    }
}
