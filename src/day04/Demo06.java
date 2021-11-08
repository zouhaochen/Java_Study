package day04;

/*
数组的查找操作
 */
public class Demo06 {
    public static void main(String[] args)
    {
        int[] arr1 = {3, 1, 4, 1, 5, 9};
        int index1 = getIndex(arr1, 1);
        System.out.println("index="+index1);

        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16};
        int index2 = halfSearch(arr2, 10);
        System.out.println("index="+index2);

        int[] arr3 = {2, 4, 6, 8, 10, 12, 14, 16};
        int index3 = halfSearchNew(arr3, 100);
        System.out.println("index="+index3);

        int[] arr4 = {2, 4, 6, 8, 10, 12, 14, 16};
        int index4 = getIndex_2(arr4, 100);
        System.out.println("index="+index4);
    }

    //定义功能，获取key第一次出现在数组中的位置。如果返回是-1，代表该key在数组中不存在
    public static int getIndex(int[] arr, int key)
    {
        for(int x = 0; x < arr.length; x++)
        {
            if(arr[x] == key)
                return x;
        }
        return -1;
    }

    /*
    折半查找：可以提高效率，必须要保证该数组是有序的数组
     */
    public static int halfSearch(int[] arr, int key)
    {
        int min, max, mid;
        min = 0;
        max = arr.length - 1;
        mid = (min + max)/2;

        while(arr[mid]!=key)
        {
            if(key > arr[mid])
                min = mid + 1;
            else if(key < arr[mid])
                max = mid - 1;
            if (min > max)
                return -1;
            mid = (max + min)/2;
        }
        return mid;
    }

    /*
    折半查找：可以提高效率，必须要保证该数组是有序的数组
    */
    public static int halfSearchNew(int[] arr, int key)
    {
        int min, max, mid;
        min = 0;
        max = arr.length - 1;

        while(min <= max)
        {
            mid = (max + min) >> 1;

            if(key > arr[mid])
                min = mid + 1;
            else if (key < arr[mid])
                max = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    /*
    练习：有一个有序的数组，想要将一个元素插入到该数组中，
    还要保证该数组是有序的，如何获取钙元素在数组中的位置
     */
    public static int getIndex_2(int[] arr, int key)
    {
        int min, max, mid;
        min = 0;
        max = arr.length - 1;

        while(min <= max)
        {
            mid = (max + min) >> 1;

            if(key > arr[mid])
                min = mid + 1;
            else if (key < arr[mid])
                max = mid - 1;
            else
                return mid;
        }
        return min;
    }
}
