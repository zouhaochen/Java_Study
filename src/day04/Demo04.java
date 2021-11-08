package day04;

/*
选择排序
对给定数组进行排序
｛5,1,6,4,2,8,9｝
 */
public class Demo04 {

    public static void main(String[] args) {
        int[] arr = {5,1,6,4,2,8,9};
        printArray(arr);
        selectSort(arr);
        printArray(arr);
        selectSortInverted(arr);
        printArray(arr);
    }

    /*
    选择排序
    内循环结束一次，最只出现在头脚标位置上
     */
    public static void selectSort (int[] arr){
        for (int x = 0; x < arr.length - 1; x++){
            for (int y = x + 1; y < arr.length; y++){
                if (arr[x] > arr[y])
                {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }

    public static void selectSortInverted (int[] arr){
        for (int x = 0; x < arr.length - 1; x++){
            for (int y = x + 1; y < arr.length; y++){
                if (arr[x] < arr[y])
                {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
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
}
