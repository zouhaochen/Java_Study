package Day20;

import java.io.File;

/*
删除一个带内容的目录
删除原理：
在windows中，删除目录是从里面往外删除的

既然是从里面往外删除，就需要用到递归
 */
public class Demo07
{
    public static void main(String[] args)
    {

    }

    public static void removeDir(File dir)
    {
        File[] files = dir.listFiles();

        for(int x = 0; x < files.length; x++)
        {
            //文件本身不是隐藏的，同时文件还是一个目录
            if(!files[x].isHidden()&&files[x].isDirectory())
                removeDir(files[x]);
            else
                System.out.println("file: "+files[x].toString()+files[x].delete());
        }

        System.out.println("dir: "+dir+": "+dir.delete());
    }
}
