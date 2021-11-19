package day09;

public class Demo05 {
}

class InnerTest
{
    public static void main(String[] args)
    {
        new Object()
        {
            public void function()
            {

            }
        }.function();
    }
}
