package day04;

public class Demo01 {
    public static void main(String[] args) {
        //直接把值确定出来
        int[] arr1 = new int[] {3, 1, 6, 5, 4};
        int[] arr2 = {3, 1, 6, 5, 4};
        System.out.println(arr1[1]);
        System.out.println(arr2[1]);

        //分别为数组赋值
        int[] arr3 = new int[5];
        arr3[0] = 90;
        arr3[1] = 80;

        int[] arr = new int[3];
        System.out.println(arr[2]);
        //ArrayIndexOutOfBoundsException:3操作数组时，访问到了数组中不存在的脚标
        //NullPointerException:空指针异常：当引用没有任何指向值为null的情况，该引用还在用于操作实体


    }
}
