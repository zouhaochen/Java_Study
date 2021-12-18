package day22;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Demo07
{
    private Frame frame;
    private TextField textField;
    private Button button;
    private TextArea textArea;

    private Dialog dialog;
    private Label label;
    private Button okButton;

    Demo07()
    {
        init();
    }

    public void init()
    {
        frame = new Frame("my window");
        frame.setBounds(300, 100, 600, 500);
        frame.setLayout(new FlowLayout());

        textField = new TextField(30);

        button = new Button("change to");

        textArea = new TextArea(15, 40);

        frame.add(textField);
        frame.add(button);
        frame.add(textArea);

        myEvent();
        frame.setVisible(true);

        dialog = new Dialog(frame, "attention!", true);
        dialog.setBounds(400,200,200,100);
        dialog.setLayout(new FlowLayout());
        label = new Label();
        okButton = new Button("confirm");

        dialog.add(label);
        dialog.add(okButton);
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
                String dirPath = textField.getText();

                File dir = new File(dirPath);

                if(dir.exists() && dir.isDirectory())
                {
                    textArea.setText("");
                    String[] names = dir.list();
                    for(String name : names)
                    {
                        textArea.append(name+"\r\n");
                    }
                }

                else
                {
                    String info = "ERROR input: "+dirPath;
                    label.setText(info);
                    dialog.setVisible(true);
                }
            }
        });

        dialog.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dialog.setVisible(false);
            }
        });

        okButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dialog.setVisible(false);
            }
        });
    }

    public static void main(String[] args)
    {
        new Demo07();
    }
}
