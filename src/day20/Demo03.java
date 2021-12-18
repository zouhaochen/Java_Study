package day20;

import java.io.File;
import java.io.FilenameFilter;

public class Demo03
{
    public static void main(String[] args)
    {
        listRootsDemo();
        System.out.println();

        listDemo();
        System.out.println();

        listFilter();
        System.out.println();

        fileLength();
        System.out.println();
    }

    public static void listRootsDemo()
    {
       File[] files =  File.listRoots();

       for(File f : files)
       {
           System.out.println(f);
       }
    }

    public static void listDemo()
    {
        File f = new File("c:\\");

        //调用list方法的file对象必须是封装了一个目录。该目录还必须存在
        String[] names = f.list();

        for(String name : names)
        {
            System.out.println(name);
        }
    }

    public static void listFilter()
    {
        File dir = new File("c:\\");
        String[] arr = dir.list(new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name) {

                /*
                if(name.endsWith(".log"))
                    return true;
                else
                    return false;
                 */

                return name.endsWith(".tmp");
            }
        });

        System.out.println("len: "+arr.length);

        for(String name:arr)
        {
            System.out.println(name);
        }
    }

    public static void fileLength()
    {
        File dir = new File("c:\\");
        File[] files = dir.listFiles();

        for(File f : files)
        {
            System.out.println(f.getName()+", "+f.length());
        }
    }
}
