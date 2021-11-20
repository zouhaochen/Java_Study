package day10;

/*
异常在子父类覆盖中的体现:
1. 子类在覆盖父类时，如果父类的方法抛出异常，那么子类的覆盖方法只能抛出父类的异常或者该异常的子类
2. 如果父类方法抛出多个异常，那么子类在覆盖该方法时，只能抛出父类异常的子集
3. 如果父类或者接口的方法中没有异常抛出，那么子类在覆盖方法时，也不可以抛出异常
   如果子类方法发生了异常，就必须要进行try处理，绝对不能抛
 */

class AException extends Exception
{

}

class BException extends AException
{

}

class CException extends Exception
{

}

/*
Exception
    |--AException
        |--BException
    |--CException
 */

class Fu
{
    void show() throws AException
    {

    }
}

/*
子类只能是父类的问题或者父类的子问题
 */
class Zi extends Fu
{
    void show1() throws AException
    {

    }

    void show2() throws BException
    {

    }
    //不可以throws CException
}

class Test
{
    void function(Fu f)
    {
        try
        {
            f.show();
        }
        catch (AException e)
        {

        }
    }
}

public class Demo03 {
    public static void main(String[] args) {
        Test t = new Test();
        t.function(new Fu());
    }
}
