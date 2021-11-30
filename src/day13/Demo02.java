package day13;

/*
String类是用于描述字符串事物
那么它就提供了多个方法对字符串进行操作

常见的操作有哪些？
1. 获取
    1.1 字符串中包含的字符数，也就是字符串的长度
        int length(): 获取长度
    1.2 根据位置获取位置上的某个字符
        char charAt(int index)
    1.3 根据字符获取该字符在字符串中的位置
        int indexOf(int ch): 返回的是ch在字符串中第一次出现的位置
        int indexOf(int ch, int romIndex): 从fromIndex指定位置开始获取ch在字符串中出现的位置

        int indexOf(String str): 返回的是str在字符串中第一次出现的位置
        int indexOf(String str, int romIndex): 从fromIndex指定位置开始获取str在字符串中出现的位置

        int lastIndexOf(int ch)

2. 判断
    2.1 字符串中是否包含某一个子串
        boolean contains(str);
        特殊之处:
        indexOf(str):可以索引str第一次出现的位置，如果返回-1表示该str不在字符串中存在
        所以，也可以用于对指定字符串的判读，是否包含
        if(str.indexOf("aa")!=-1)
        而且该方法既可以判断，又可以获取出现的位置
    2.2 字符串中是否有内容
        boolean isEmpty(): 原理就是判断长度是否为0.
        “”: 是一个对象
        null: 指向空
    2.3 字符串是否以指定内容开头
        boolean startsWith(str);
    2.4 字符串是否以指定内容结尾
        boolean endsWith(str);
    2.5 判断字符串内容是否相同
        复写了Object类中的equals方法
        boolean equals(str);
    2.6 判断内容是否相同，并忽略大小写
        boolean equalIgnoreCase();

3. 转换
    3.1 将字符数组转换成字符串
        构造函数：
        String(char[])
        String(char[], offset, count)：将字符数组中的一部分转换成字符串
        静态方法：
        static String copyValueOf(char[])
        static String copyValueOf(char[] data, int offset, int count)
        static String valueOf(char[])
    3.2 将字符串转换成字符数组
        char[] toCharArray()
    3.3 将字节数组转换成字符串
        String(byte[])
        String(byte[], offset, count)
    3.4 将字符串转换成字节数组
        byte[] getByte();
    3.5 将基本数据类型转换成字符串
        String valueOf(int)
        String valueOf(double)
    特殊：字符串和字节数组在转换过程中是可以指定编码表的

4. 替换
    String replace(oldchar, newchar);

5. 切割
    String[] split(regex);

6. 子串: 获取字符串中的一部分
    String substring(begin);
        String substring(begin, end);

7. 转换、去除空格、比较
    7.1 将字符串转换成大写或者小写
        String toUpperCase();
        String toLowerCase();
    7.2 将字符串两端的多个空格去除
        String trim();
    7.3 对两个字符串进行自然顺序比较
        int compareTo(str);
 */
public class Demo02
{

    public static void methodGet()
    {
        String str = "Iwanttogohome";

        //长度
        sop(str.length());

        //根据索引获取字符
        sop(str.charAt(4));
        //根据字符获取索引
        sop(str.indexOf('a'));
        sop(str.indexOf('o',7));
        /*
        当访问到字符串中不存在的脚标时，会发生StringIndexOutOfBoundsException
        如果没有找到，返回-1
         */

        //反向索引一个字符出现位置
        sop(str.lastIndexOf('o'));
    }

    public static void methodIf()
    {
        String str = "ArrayDemo.java";
        //判断文件名称是否是Array单词开头
        sop(str.startsWith("Array"));
        //判断文件名称是否是.java的文件
        sop(str.endsWith(".java"));
        //判断文件名中是否包含Demo
        sop(str.contains("Demo"));
    }

    public static void methodTrans()
    {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s1 = new String(arr);
        sop(s1);
        String s2 = new String(arr, 1, 3);
        sop(s2);

        String s3 = "gobackhomequickly";
        char[] chars = s3.toCharArray();
        for(int x = 0; x < chars.length; x++)
        {
            sop(chars[x]);
        }
    }

    public static void methodReplace()
    {
        String s = "Hello Java";
        s.replace('a', 'n');
        sop(s);

        //如果要替换的字符不存在，返回的还是原串
        String s1 = s.replace('a','n');
        sop(s1);

        String s2 = s.replace("Java","World");
        sop(s2);
    }

    public static void methodSplit()
    {
        String s = "ZhangSan,LiSi,WangWu";
        String[] arr = s.split(",");
        for(int x = 0; x < arr.length; x++)
        {
            sop(arr[x]);
        }
    }

    public static void methodSub()
    {
        String s = "abcdef";
        sop(s.substring(2)); //从指定位置开始到结尾
        sop(s.substring(2, 4)); //包含头不包含尾
        sop(s.substring(0, s.length()));
        //如果字符串不存，会出现字符串脚标越界异常
    }

    public static void methodCompare()
    {
        String s = "     Hello Java     ";
        sop(s.toLowerCase());
        sop(s.toUpperCase());
        sop(s.trim());

        String s1 = "abc";
        String s2 = "aaa";
        String s3 = "bbb";
        sop(s1.compareTo(s2));
        sop(s1.compareTo(s3));
        /*
        返回：
        如果参数字符串等于此字符串，则返回值0
        如果此字符串按字典顺序小于字符串参数，则返回一个小于0的值
        如果此字符串按字典顺序大于字符串参数，则返回一个大于0的值
         */
    }

    public static void main(String[] args)
    {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println();

        methodGet();
        System.out.println();

        methodIf();
        System.out.println();

        methodTrans();
        System.out.println();

        methodReplace();
        System.out.println();

        methodSplit();
        System.out.println();

        methodSub();
        System.out.println();

        methodCompare();
        System.out.println();
    }

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

}
