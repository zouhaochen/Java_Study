package day08;

/*
需求：
电脑运行示例
电脑运行基于主板
 */

/*
class MainBord
{
    public void run()
    {
        System.out.println("Main Board Run");
    }

    public void useNetCard(NetCard c)
    {
        c.open();
        c.close();
    }
}

class NetCard
{
    public void open()
    {
        System.out.println("Net Card Open");
    }
    public void close()
    {
        System.out.println("Net Card Close");
    }
}
*/

interface PCI
{
    public void open();
    public void close();
}

class MainBord
{
    public void run()
    {
        System.out.println("Main Board Run");
    }

    public void usePCI(PCI p)
    {
        if(p != null)
        {
            p.open();
            p.close();
        }
        else
        {
            System.out.println("Main Board Empty");
        }

    }
}

class NetCard implements PCI
{
    public void open()
    {
        System.out.println("Net Card Open");
    }
    public void close()
    {
        System.out.println("Net Card Close");
    }
}

class SoundCard implements PCI
{
    public void open()
    {
        System.out.println("Sound Card Open");
    }
    public void close()
    {
        System.out.println("Sound Card Close");
    }
}

public class Demo04
{
    public static void main(String[] args)
    {
        MainBord mb = new MainBord();
        mb.run();
        mb.usePCI(null);
        mb.usePCI(new NetCard());
        mb.usePCI(new SoundCard());
    }
}
