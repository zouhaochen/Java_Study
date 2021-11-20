package day10;

/*
finally代码块：
定义一定执行的代码
通常用于关闭资源

public void method() throws NoException
{
    连接数据库;

    数据操作;//throw new SQLException();
    关闭数据库;//该动作无论数据操作是否成功，一定要关闭资源
    try
    {
        连接数据库;
        数据库操作;//throw new SQLException();
    }
    catch (Exception e)
    {
        会对数据库进行异常处理;
        throw new NoException();
    }
    finally
    {
        关闭数据库;
    }
}
 */
class MinusException extends Exception
{
    MinusException(String msg)
    {
        super(msg);
    }
}

public class Demo01
{
    int div(int a, int b) throws MinusException
    {
        if(b<0)
            throw new MinusException("除数为负数");
        return a/b;
    }
}

class ExceptionDemo
{
    public static void main(String[] args) {
        Demo01 d = new Demo01();
        try
        {
            int x = d.div(4,-1);
            System.out.println(x);
        }
        catch(MinusException e)
        {
            System.out.println(e.toString());
            return;
        }
        finally
        {
            //finally中存放的是一定会被执行的代码
            System.out.println("finally");
        }

        System.out.println("over");
    }
}
