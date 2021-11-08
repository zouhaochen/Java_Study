package day04;

public class Demo08 {
    public static void main(String[] args) {
        toHex(60);
        toBin(10);
    }

    /*
    0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F  十六进制中的元素
    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

    查表法：将所有的元素临时存储起来，都建立对应关系
    每一次&15后的值都作为索引去查建立好的表，就可以找到对应的元素
    这样比 -10+‘a’ 简单得多

    这个表怎么建立呢？
    可以通过数组的形式来定义
     */

    public static void toHex(int num)
    {
        char[] charTable = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] arr = new char[8];
        int pos = 0;

        while(num!=0)
        //for(int x = 0; x < 8; x++)
        {
            int temp = num & 15;
            /*
            System.out.println(charTable[temp]);
             */
            arr[pos++] = charTable[temp];
            num = num >>> 4;
        }

        for(int x = arr.length -1; x >= 0; x--)
        {
            System.out.print(arr[x]);
        }
    }

    public static void toBin (int num){
        //定义二进制的表
        char[] charTable = {'0','1'};

        //定义一个临时存储容器
        char[] arr = new char[32];

        //定义一个操作数组的指针
        int pos = arr.length;

        while(num!=0)
        {
            int temp = num & 1;
            arr[--pos] = charTable[temp];
            num = num >>> 1;
        }
        for(int x = pos; x < arr.length; x++)
        {
            System.out.print(arr[x]);
        }
    }
}
