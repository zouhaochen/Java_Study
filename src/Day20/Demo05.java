package Day20;

public class Demo05
{
    public static void main(String[] args)
    {
        toBin(6);
    }

    public static void toBin(int num)
    {
        if (num>0)
        {
            toBin(num/2);
            System.out.println(num%2);
        }
    }
}

/*
void showA()
{
    showB();
    sop(A);
}

void showB()
{
    showC();
    sop(B);
}

void showC()
{
    sop(C);
}

showA()函数执行：先读showB()，showB()调用showC()
show()C输出C，show()C执行结束
showB()继续执行输出B，showB()执行结束
showA()继续执行输出A，showA()执行结束
打印结果CBA
 */