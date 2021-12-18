package day22;

import java.awt.*;
import java.awt.event.*;

public class Demo04
{
    private Frame frame;
    private Button button;

    Demo04()
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

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("button action");
            }
        });

        button.addMouseListener(new MouseAdapter()
        {
            private int count = 1;

            private int clickCount = 1;

            public void mouseEntered(MouseEvent e)
            {
                System.out.println("mouse enter button"+count++);
            }

            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==2)
                    System.out.println("double click button");
                System.out.println("mouse click button"+clickCount++);
            }
        });
    }

    public static void main(String[] args)
    {
        new Demo04();
    }
}
