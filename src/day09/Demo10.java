package day09;

/*
需求:
老师用电脑上课
开始思考上课中出现的问题
比如问题是：电脑蓝屏，电脑冒烟
要对问题进行描述，封装成对象

可是当Stop发生后，会出现讲课进度无法继续
就出现了讲师的问题，课时计划无法完成
 */

class ComputerError extends Exception
{
    ComputerError(String message)
    {
        super(message);
    }
}

class ComputerStop extends Exception
{
    ComputerStop(String message)
    {
        super(message);
    }
}

class NoPlanException extends Exception
{
    NoPlanException(String message)
    {
        super(message);
    }
}

class Computer
{
    private int state = 3;

    public void run() throws ComputerError, ComputerStop {
        if(state == 2)
            throw new ComputerError("蓝屏了");
        if(state == 3)
            throw new ComputerStop("冒烟了");
        System.out.println("Computer Run");
    }

    public void reset()
    {
        state = 1;
        System.out.println("Computer Reset");
    }
}

class Teacher
{
    private String name;
    private Computer computer;

    Teacher (String name)
    {
        this.name = name;
        computer = new Computer();
    }

    public void lecture() throws NoPlanException {
        try
        {
            computer.run();
        }
        catch (ComputerError e)
        {
            computer.reset();
        }
        catch (ComputerStop e)
        {
            test();
            throw new NoPlanException("课时无法继续"+e.getMessage());
        }

        System.out.println("Lecture Start");
    }
    public void test()
    {
        System.out.println("做练习");
    }
}

public class Demo10 {
    public static void main(String[] args) {
        Teacher t = new Teacher("New Teacher Name");
        try
        {
            t.lecture();
        }
        catch (NoPlanException e)
        {
            System.out.println(e.toString());
            System.out.println("换老师或者放假");
        }
    }


}
