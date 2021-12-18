package day20;

import java.io.File;

/*
递归:
列出指定目录下文件或者文件夹，包含子目录中的内容
也就是列出指定目录瞎所有内容

因为目录中还有目录，只要使用同一个列出目录功能的函数完成即可
在列出过程中出现的还是目录的话，可以再次调用本功能
也就是函数自身调用自身
这种表现形式，或者编程手法称为递归

递归要注意:
1. 限定条件
2. 注意递归的次数，尽量避免内存溢出
 */
public class Demo04
{
    public static void main(String[] args)
    {
        File dir = new File("d:\\");
        showDir(dir,0);
    }

    /*
    层级缩进目录
    abc
        |--a.txt
     */
    public static void showDir(File dir, int level)
    {
        System.out.println(getLevel(level)+dir);

        level++;

        File[] files = dir.listFiles();

        for(int x = 0; x<files.length; x++)
        {
            if(files[x].isDirectory())
                showDir(files[x], level);
            else
                System.out.println(getLevel(level)+files[x]);
        }
    }

    public static String getLevel(int level)
    {
        StringBuilder sb = new StringBuilder();
        for(int x = 0; x < level; x++)
        {
            sb.append("|--");
        }
        return sb.toString();
    }
}
