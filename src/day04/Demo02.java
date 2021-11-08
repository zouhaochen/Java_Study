package day04;

public class Demo02 {
    public static void main(String[] args) {

        //数组的操作：获取数组中的元素，通常会用到遍历
        int[] arr1 = new int[3];
        for(int x = 0; x < 3; x++)
        {
            System.out.println("arr1["+x+"]="+arr1[x]+";");
        }

        int[] arr2 = {3, 6, 5, 1, 8, 9};
        for(int x = 0; x < 6; x++)
        {
            System.out.println("arr2["+x+"]="+arr2[x]+";");
        }

        //数组中有一个属性可以直接获取到数组元素的个数：length
        //使用方式：数组名称.length
        System.out.println("length:"+arr2.length);
        //但凡有数组的情况下，通常都会用到for循环

        int sum = 0;
        int[] arr3 = {3, 6, 5, 1, 8, 9};
        for(int x = 0; x < 6; x++)
        {
            sum += arr3[x];
        }
        System.out.println("sum="+sum);

        printArray(arr1);
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
