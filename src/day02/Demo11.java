package day02;

public class Demo11 {
    public static void main(String[] args) {
        int x = 2;
        //被选择的表达式的值只接受四种类型：byte, short, int , char
        //case与default位置定义可以互换，但程序执行从第一个case开始判断
        //如果没有break，程序会先找匹配的语句并执行，因为没有break也没有遇到大括号，程序会继续向下执行而不再判断case，
        //把下面可以执行的语句全部执行完成直到碰到break或括号结束
        switch(x)
        {
            case 2:
                System.out.println("a");
                break;
            case 4:
                System.out.println("b");
                break;
            case 6:
                System.out.println("c");
                break;
            default:
                System.out.println("d");
                //最后一个break可以省略
                break;
        }

        int a = 4, b = 2;
        char ch = '+';
        switch(ch)
        {
            case '-':
                System.out.println(a-b);
                break;
            case '+':
                System.out.println(a+b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Wrong");
                break;
        }
    }
}
