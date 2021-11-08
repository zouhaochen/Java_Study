package day04;

import java.util.Arrays;

/*
冒泡排序：相邻的两个元素进行比较，如果符合条件就换位
第一圈：最值出现在了最后位
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {5,1,6,4,2,8,9};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
        //Java中已经定义好的一种排序方式，开发中对数组排序要使用该句代码
        Arrays.sort(arr);
    }

    public static void bubbleSort(int[] arr){

        //-1: 相邻两个元素比较，剩最后一个就不用比较了
        for (int x = 0; x < arr.length - 1; x++)
        {
            //-x: 让每次比较的元素减少
            //-1: 避免脚标越界
            for (int y = 0; y < arr.length - x - 1; y++)
            {
                if (arr[y] > arr[y+1])
                {
                    /*
                    int temp = arr[y];
                    arr [y] = arr [y+1];
                    arr [y+1] = temp;
                     */
                    swapElement(arr, y, y+1);
                }
            }
        }
    }

    //定义功能，用于打印数组中的元素。元素间用逗号隔开
    public static void printArray(int[] arr)
    {
        System.out.print("[");
        for(int x = 0; x < arr.length; x++)
        {
            if (x!=arr.length - 1)
                System.out.print(arr[x]+",");
            else
                System.out.println(arr[x]+"]");
        }
    }

    /*
    发现无论什么排序，都要对满足条件的元素进行位置的置换
    所以可以把这部分相同的代码提取出来，单独封装成一个函数
     */
    public static void swapElement(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
