package day09;

interface Inter
{
    void method();
}

class Test
{
    //补足代码，通过匿名内部类

    /*
    static class Inner3 implements Inter
    {
        public void method()
        {
            System.out.println("method run");
        }
    }

     */

    static Inter function()
    {
        /*
        return new Inter();
         */

        return new Inter()
        {
            public void method()
            {
                System.out.println("method run");
            }
        };
    }
}

public class Demo04 {
    public static void main(String[] args) {
        /*
        Test.function(): Test类中有一个静态的方法function
        .method():function这个方法运算后的结果是一个对象，而且是一个Inter类型的对像
        因为只有时Inter类型的对象才可以调用method方法
        Inter in = Test.function;
        in.method;
         */
        Test.function().method();
        
        show(new Inter()
        {
            public void method()
            {
                System.out.println("method show run");
            }
        });
    }
    
    public static void show(Inter in)
    {
        in.method();
    }
}