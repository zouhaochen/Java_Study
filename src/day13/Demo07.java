package day13;

/*
StringBuffer是字符串缓冲区

是一个容器，特点:
1. 而且长度是可变化的
2. 可以直接操作多个数据类型
3. 最终会通过toString方法变成字符串

CURD: C create U update R read D delete
1.  存储
    StringBuffer append(): 将指定的数据作为参数添加到已有数据结尾处
    StringBuffer insert(index, 数据): 可以将数据插入到指定index位置
2.  删除
    StringBuffer delete(start, end): 删除缓冲区中的数据，包含start，不包含end
    StringBuffer deleteCharAt(index): 删除指定位置的字符
3.  获取
    char charAt(int index)
    int indexOf(String str)
    int lastIndexOf(String str)
    int length()
    String substring(int start, int end)
4.  修改
    StringBuffer replace(start, end, string)
    void setCharAt(int index, char ch)
5.  反转
    StringBuffer reverse();
6.  将缓冲区中的制定数据存储到指定字符数组中
    void getChars(int srcBegin, int secEnd, char[], dst, int dstBegin)

JDK 1.5 版本之后出现了StringBuilder
StringBuffer是线程同步
StringBuilder是线程不同步
以后开发建议使用StringBuilder
升级三个因素：
1. 提高效率
2. 简化书写
3. 提高安全性
 */
public class Demo07
{
    public static void main(String[] args)
    {
        methodAdd();
        System.out.println();

        methodDelete();
        System.out.println();

        methodUpdate();
        System.out.println();

        StringBuffer sb = new StringBuffer("abcdef");
        char[] chs = new char[4];
        sb.getChars(1,4, chs,1);
        for(int x = 0; x < chs.length; x++)
        {
            sop("chs["+ x +"]="+chs[x]+";");
        }
    }

    public static void methodAdd()
    {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = sb.append(34);
        sop(sb.toString());
        sop(sb1.toString());
        sop("sb==sb1: "+(sb==sb1));

        StringBuffer sb2 = new StringBuffer();
        sb2.append("abc").append("def").append(345);
        System.out.println(sb2.toString());
        sb2.insert(1,"qq");
        System.out.println(sb2.toString());
    }

    public static void methodDelete()
    {
        StringBuffer sb = new StringBuffer("abcde");
        sop(sb.toString());
        sb.delete(1,3);
        sop(sb.toString());
        //清空缓冲区
        sb.delete(0, sb.length());
        sop(sb.toString());

        StringBuffer sb1 = new StringBuffer("abcde");
        sb1.deleteCharAt(2);
        sop(sb1.toString());
    }

    public static void methodUpdate()
    {
        StringBuffer sb = new StringBuffer("abcde");
        sb.replace(1,4,"java");
        System.out.println(sb.toString());
        sb.setCharAt(2,'k');
        System.out.println(sb.toString());
    }

    public static void sop(String str)
    {
        System.out.println(str);
    }
}
