package day22;

import java.awt.*;
import java.awt.event.*;

public class Demo06
{
    private Frame frame;
    private Button button;
    private TextField textField;

    Demo06()
    {
        init();
    }

    public void init()
    {

        frame = new Frame("my frame");

        frame.setBounds(300, 100, 600, 500);
        frame.setLayout(new FlowLayout());

        textField = new TextField(10);

        button = new Button("my button");

        frame.add(button);
        frame.add(textField);

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
                System.out.println(KeyEvent.getKeyText(e.getKeyCode())+": "+e.getKeyCode());

                if(e.getKeyCode()==27)
                    System.exit(0);
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                    System.exit(0);
                if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER)
                    System.out.println("ctrl+enter is run");
            }
        });

        textField.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                if(!(e.getKeyCode()>=KeyEvent.VK_0 && e.getKeyCode()<=KeyEvent.VK_9))
                {
                    System.out.println(e.getKeyCode() + "is illegal");
                    e.consume(); //屏蔽键
                }
            }
        });
    }

    public static void main(String[] args)
    {
        new Demo06();
    }
}
