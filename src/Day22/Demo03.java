package Day22;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo03
{
    //定义该图形中所需的组件的引用
    private Frame frame;
    private Button button;

    Demo03()
    {
        init();
    }

    //对图形界面初始化
    public void init()
    {
        frame = new Frame("my frame");

        //对frame进行基本设置
        frame.setBounds(300,100,600,500);
        frame.setLayout(new FlowLayout());

        button = new Button("my button");

        //将组件添加到frame中
        frame.add(button);

        //加载一下窗体上的事件
        myEvent();

        //显示窗体
        frame.setVisible(true);
    }

    private void myEvent()
    {
        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        /*
        让按钮具备退出程序的功能，按钮就是事件源
        那么选择哪个监听器呢？
        通过关闭窗体示例了解到，想要知道哪个组件具备什么样的特有监听器
        需要查看该组件对象的功能
        通过查阅button的描述，发现按钮支持一个特有监听addActionListener
         */
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("button exit");
                System.exit(0);
            }
        });
    }

    public static void main(String[] args)
    {
        new Demo03();
    }
}
