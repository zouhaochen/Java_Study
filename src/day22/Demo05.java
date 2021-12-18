package day22;

import java.awt.*;
import java.awt.event.*;

public class Demo05
{
    private Frame frame;
    private Button button;

    Demo05()
    {
        init();
    }

    public void init()
    {

        frame = new Frame("my frame");

        frame.setBounds(300, 100, 600, 500);
        frame.setLayout(new FlowLayout());

        button = new Button("my button");

        frame.add(button);

        myEvent();
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

        //给Button添加一个键盘监听
        button.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                System.out.println(e.getKeyChar()+": "+e.getKeyCode());
            }
        });
    }

    public static void main(String[] args)
    {
        new Demo05();
    }
}
