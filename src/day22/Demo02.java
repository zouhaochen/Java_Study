package day22;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
事件监听机制组成
1. 事件源（组件）
2. 事件（Event）
3. 监听器（Listener）
4. 事件处理（引发事件后处理方式）

事件源：就是awt包或者swing包中的哪些图形界面组件
事件：每一个事件源都有自己特有的对应事件和共性事件
监听器：将可以触发某一个事件的动作（不止一个动作）都已经封装到了监听器中
以上三者，在java中都已经定义好了
直接获取其对象来使用就可以了

我们要做的事情就是对产生的动作进行处理
 */
public class Demo02
{
    //设置关闭按钮关闭窗口
    public static void main(String[] args)
    {
        Frame f = new Frame("my awt");
        f.setSize(500, 100);
        f.setLocation(300,200);
        f.setLayout(new FlowLayout());

        Button b = new Button("I am a button");
        f.add(b);

        f.addWindowListener(new MyWindow());

        f.setVisible(true);
        System.out.println("Hello World");
    }
}

/*
class MyWindowListener implements WindowListener
{
    //覆盖7个方法，可是只用到了关闭的动作，其他动作都没有用到，可是却必须复写
}
*/

/*
因为WindowListener的子类WindowAdapter已经实现了WindowListener接口
并覆盖了其中所有的方法，那么就只要继承自WindowAdapter覆盖需要的方法即可
*/

class MyWindow extends WindowAdapter
{
    //关闭动作
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    //窗口前置
    public void windowActivated(WindowEvent e)
    {
        System.out.println("front");
    }

    //开启动作
    public void windowOpened(WindowEvent e)
    {
        System.out.println("open");
    }
}