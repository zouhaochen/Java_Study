package Day20;

import java.io.File;
import java.io.IOException;

/*
File类的常见方法
1. 创建
   boolean createNewFile()
   在指定位置创建文件，如果该文件已经存在，则不创建，返回false
   和输出流不一样，输出流对象一建立就会创建文件，而且文件已经存在会覆盖
   boolean mkdir()
   创建文件夹
   boolean mkdirs()
   创建多级文件夹

2. 删除
   boolean delete(): 删除失败返回false
   void deleteOnExit(): 当虚拟机终止时，请求删除此抽象路径名表示的文件或目录（临时文件）

3. 判断
   boolean canExecute()
   boolean canRead()
   boolean canWrite()
   int compareTo(File name path)
   boolean exists(): 文件是否存在
   isFile()
   isDirectory()
   isHidden()
   isAbsolute()

4. 获取信息
   String getName()
   String getPath()
   String getParent()
   获取父目录，该方法返回的是绝对路径中的文件父目录，如果获取的是相对路径，返回null
   如果相对路径中有上一层目录，那么该目录就是返回结果
   String getAbsolutePath(): 获取绝对路径
   long lastModified(): 获取文件最后一次被修改的时间
   long length(): 获取文件大小
 */

public class Demo02
{
    public static void main(String[] args) throws IOException
    {
        methodCreat();
        methodDecide();
        methodIsFile();
        methodGet();
        methodRename();
    }

    public static void methodCreat() throws IOException
    {
        File f = new File("Demo.txt");

        sop("create: "+f.createNewFile());

        sop("delete: "+f.delete());
    }

    public static void methodDecide() throws IOException
    {
        File f = new File("file.txt");

        sop("execute: "+f.canExecute());

        sop("exists: "+f.exists());

        //创建文件夹目录
        File dir = new File("abc");
        sop("mkdir: "+dir.mkdir());
    }

    public static void methodGet()
    {
        File f = new File("c:\\a.txt");

        sop("path: "+f.getPath());
        sop("absolute path: "+f.getAbsolutePath());
        sop("parent: "+f.getParent());
    }

    public static void methodIsFile()
    {
        File f = new File("file.txt");

        //在判断文件对象是否是文件或者目录时，必须要先判断该文件对象封装的内容是否存在
        //通过exists判断
        sop("dir: "+f.isDirectory());
        sop("dir: "+f.isFile());
    }

    public static void methodRename()
    {
        File f1 = new File("c:\\Test.java");
        File f2 = new File("c:\\abc.java");

        sop("rename: "+f1.renameTo(f2));
    }

    public static void sop(Object object)
    {
        System.out.println(object);
    }
}
