package Day22;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class Demo08
{
    private Frame frame;
    private MenuBar menuBar;
    private Menu menu, subMenu;
    private MenuItem closeMenuItem, subItem, openItem, saveItem;
    private TextArea textArea;

    private FileDialog openDia, saveDia;

    private File file;

    Demo08()
    {
        init();
    }

    public void init()
    {
        frame = new Frame("my window");
        frame.setBounds(300,100,600,600);

        menuBar = new MenuBar();

        textArea = new TextArea();

        menu = new Menu("file");
        subMenu = new Menu("sub menu");

        subItem = new MenuItem("sub item");
        openItem = new MenuItem("open");
        saveItem = new MenuItem("save");
        closeMenuItem = new MenuItem("exit");

        subMenu.add(subItem);

        menu.add(subMenu);
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(closeMenuItem);

        menuBar.add(menu);

        frame.setMenuBar(menuBar);
        frame.setVisible(true);

        openDia = new FileDialog(frame,"my open", FileDialog.LOAD);
        saveDia = new FileDialog(frame,"my save", FileDialog.SAVE);

        frame.add(textArea);

        myEvent();
    }

    private void myEvent()
    {
        saveItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(file == null)
                {

                    saveDia.setVisible(true);

                    String dirPath = saveDia.getDirectory();
                    String fileName = saveDia.getFile();

                    if (dirPath == null || fileName == null)
                        return;

                    file = new File(dirPath, fileName);
                }

                try
                {
                    BufferedWriter bufw = new BufferedWriter(new FileWriter(file));

                    String text = textArea.getText();

                    bufw.write(text);
                    bufw.flush();
                    bufw.close();
                }
                catch (IOException exception)
                {
                    throw new RuntimeException("写入失败");
                }
            }
        });

        openItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                openDia.setVisible(true);
                String dirPath = openDia.getDirectory();
                String fileName = openDia.getFile();
                System.out.println(dirPath+": "+fileName);

                if(dirPath==null||fileName==null)
                    return;

                textArea.setText("");
                File file = new File(dirPath, fileName);

                try
                {
                    BufferedReader bufr = new BufferedReader(new FileReader(file));

                    String line = null;

                    while((line = bufr.readLine())!=null)
                    {
                        textArea.append(line+"\r\n");
                    }

                    bufr.close();
                }
                catch (IOException ex)
                {
                    throw new RuntimeException("读取失败");
                }
            }
        });

        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        closeMenuItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args)
    {
        new Demo08();
    }
}
