package day07;

/*
final: 最终， 作为一个修饰符
1. 可以修饰类，函数，变量
2. 被final修饰的类不可以被继承
   为了避免被继承，被子类复写功能
3. 被final修饰的方法不可以被复写
4. 被final修饰的变量是一个常量，只能赋值一次
   既可以修饰成员变量也可以修饰局部变量
   当在描述事物时，一些数据的出现之时固定的，那么这时为了增强阅读性，都给这些值起一个名字方便阅读
   而这个值不需要改变，所以加上final修饰。
   作为常量：常量的书写规范所有字母都大写，如果由多个单词组成，单词间通过下划线连接
5. 内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量
 */

final class Demo1
{
    final int x = 3;
    static final double PI = 3.1415926535897;
    final int MY_ID = 40158179;
}

class Demo2
{
    final void show1()
    {

    }
    void show2()
    {
        final int y = 4;
    }
}

public class Demo03 {
}
