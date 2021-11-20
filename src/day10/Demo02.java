package day10;

/*
第一个格式:
try
{
}
catch()
{
}

第二个格式:
try
{
}
catch()
{
}
finally
{
}

第三个格式:
try
{
}
finally
{
}

记住一点：
catch是用于处理异常的，如果没有catch，就代表异常没有被处理过
如果该异常是检测时异常，那么必须声明
 */
class Demo02
{
    public void method()
    {
        try
        {
            throw new Exception();
        }

        //有catch就是问题解决
        catch(Exception e)
        {
        }
    }
}

class Demo02New
{
    public void method() throws Exception {
        try
        {
            throw new Exception();
        }

        finally
        {
            //关资源
        }
    }
}
