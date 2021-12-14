package Day17;

import java.util.Arrays;

/*
StaticImport 静态导入

当类名重名时，需要指定具体的包名
当方法重名时，需要指定具体所属的对象或者类
 */
import static java.util.Arrays.*;
import static java.lang.System.*;

public class Demo10
{
    public static void main(String[] args)
    {
        out.print("Hello World");
        out.println();

        int[] arr = {3, 1, 5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 1);
        System.out.println("index="+index);
        System.out.println();

        sort(arr);
        int indexNew = binarySearch(arr, 1);
        //Object类中也有toString方法
        System.out.println(Arrays.toString(arr));
        System.out.println("index="+indexNew);
    }
}
