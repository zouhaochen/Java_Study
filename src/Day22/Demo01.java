package Day22;

import java.awt.*;

/*
GUI(图形用户界面)
1. GUI
   Graphical Uer Interface(图形用户接口)
   用图形的方式，来显示计算机操作的界面，这样更方便直观
2. CLI
   Command Line User Interface(命令行用户接口)
   就是常见的Dos命令行操作
   需要记忆一些常用的命令，操作不直观
3. 举例
   比如: 创建文件夹，或者删除文件夹等
4. Java为GUI提供的对象都存在java.Awt和javax.Swing两个包中
5. Awt与Swing
   java.Awt: Abstract Window ToolKit(抽象窗口工具包)
   需要调用本地系统方法实现功能，属重量级软件
   javax.Swing:
   在AWT的基础上，建立的一套图形界面，其中提供了更多的组件，而且完全由Java实现
   增强了移植性，属轻量级控件

布局管理器
1. 容器中的组件的排放方式，就是布局
2. 常见的布局管理器
   Flow Layout(流式布局管理器)
   从左到右的顺序排列
   Panel默认的布局管理器
   BorderLayout(边界布局管理器)
   东南西北中
   Frame默认的布局管理器
   GridLayout(网格布局管理器)
   规则的矩阵
   CardLayout(卡片布局管理器)
   选项卡
   GridBagLayout(网格包布局管理器)
   非规则的矩阵
 */
public class Demo01
{
    /*
    创建图形化界面
    1. 创建frame窗体
    2. 对窗体进行基本设置
       比如大小、位置、布局
    3. 定义组件
    4. 将组件通过窗体的add方法添加到窗体中
    5. 让窗体显示，通过setVisibleTrue来完成
     */
    public static void main(String[] args)
    {
        Frame f = new Frame("my awt");
        f.setSize(500, 100);
        f.setLocation(300,200);
        f.setLayout(new FlowLayout());

        Button b = new Button("I am a button");
        f.add(b);

        f.setVisible(true);
        System.out.println("Hello World");
    }
}
