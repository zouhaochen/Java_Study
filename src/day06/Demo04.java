package day06;

/*
静态的应用

每一个应用程序中都有共性的功能
可以将这些功能进行抽取，独立封装，以便复用

虽然可以通过建立ArrayTool的对象使用这些工具方法，对数组进行操作
发现了问题：
1. ArrayTool对象适用于封装数据的，可是ArrayTool对象并未封装特有数据
2. 操作数组的每一个方法都没有用到ArrayTool对象中的特有数据

这时就考虑让程序更严谨，是不需要对象的
可以将ArrayTool中的方法都定义成静态的，直接通过类名调用即可

将方法都静态后可以方便与使用，但是该类还是可以被其他程序建立对象的
为了更为严谨，强制让该类不能建立对象
可以通过将构造函数私有化完成
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
        System.out.println("max = " + max2);
        int min1 = tool.getMin(arr);
        System.out.println("min = " + min1);

        tool.printArray(arr);
        tool.selectSort(arr);
        tool.printArray(arr);

        ArrayToolNew.getMax(arr);
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

    public void printArray(int[] arr)
    {
        System.out.print("[");
        for(int x = 0; x < arr.length; x++)
        {
            if(x != arr.length-1)
                System.out.print(arr[x]+",");
            else
                System.out.println(arr[x]+"]");
        }
    }
}

class ArrayToolNew
{
    private ArrayToolNew(){}

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

    public static int getMin(int[] arr)
    {
        int min = 0;
        for(int x = 1; x < arr.length; x++)
        {
            if(arr[x] < arr[min])
                min = x;
        }
        return arr[min];
    }

    public static void selectSort(int[] arr)
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

    public static void bubbleSort(int[] arr)
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

    private static void swap(int[] arr, int a, int b)
    {
        int temp = arr [a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int[] arr)
    {
        System.out.print("[");
        for(int x = 0; x < arr.length; x++)
        {
            if(x != arr.length-1)
                System.out.print(arr[x]+",");
            else
                System.out.println(arr[x]+"]");
        }
    }
}

