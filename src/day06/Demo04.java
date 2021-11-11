package day06;

/*
静态的应用

每一个应用程序中都有共性的功能
可以将这些功能进行抽取，独立封装，以便复用
 */
public class Demo04
{
    public static void main(String[] args)
    {
        int [] arr = {3, 4, 1, 8};

        int max1 = getMax(arr);
        System.out.println("max = " + max1);
        ArrayTool tool = new ArrayTool();
        int max2 = tool.getMax(arr);
        System.out.println("max = " + max1);
    }

    public static int getMax(int[] arr)
    {
        int max = 0;
        for(int x = 1; x < arr.length; x++)
        {
            if(arr[x] > arr[max])
                max = x;
        }
        return arr[max];
    }
}

class ArrayTool
{
    public int getMax(int[] arr)
    {
        int max = 0;
        for(int x = 1; x < arr.length; x++)
        {
            if(arr[x] > arr[max])
                max = x;
        }
        return arr[max];
    }

    public int getMin(int[] arr)
    {
        int min = 0;
        for(int x = 1; x < arr.length; x++)
        {
            if(arr[x] < arr[min])
                min = x;
        }
        return arr[min];
    }

    public void selectSort(int[] arr)
    {
        for (int x = 0; x < arr.length - 1; x++)
        {
            for(int y = 0; y < arr.length; y++)
            {
                if (arr[x]>arr[y])
                {
                    swap(arr, x, y);
                }
            }
        }
    }

    public void bubbleSort(int[] arr)
    {
        for (int x = 0; x < arr.length - 1; x++)
        {
            for(int y = 0; y < arr.length - x - 1; y++)
            {
                if (arr[y]>arr[y+1])
                {
                    swap(arr, y, y+1);
                }
            }
        }
    }

    public void swap(int[] arr, int a, int b)
    {
        int temp = arr [a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

