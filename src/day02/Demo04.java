package day02;

public class Demo04 {
    public static void main(String[] args) {

        System.out.println("hello world");
        System.out.println("hello java");

        //ln：在括号内数据都被打印完成以后，结尾处换行一次。
        System.out.print("hello world");
        System.out.println("hello java");

        /*
        转义字符：通过\来转变后面字母或者符号的含义
        \n：换行
        \b：退格，相当于backspace
        \r：按下回车键
        \t：制表符，相当于Tab
        windows系统中回车符是由两个字符表示的：\r\n
         */
        System.out.println("hello\nworld");

        //打印带有双引号的hello world
        System.out.println("\"hello world\"");
        //打印带有斜线的hello world
        System.out.println("\\hello world\\");

        char ch = '\n';
        System.out.println(ch);

        //一个中文默认两个字节，因此可以装入char
        char c = '你';
        System.out.println(c);
    }
}
