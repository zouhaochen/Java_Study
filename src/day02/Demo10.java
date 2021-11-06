package day02;

public class Demo10 {
    public static void main(String[] args) {

        //需求：根据用户指定的月份，打印该月份所属的季节
        //3, 4, 5春季 6, 7, 8夏季 9, 10, 11秋季 12, 1, 2冬季

        int month = 4;
        //|：判断完后还要判断右边的，全部判断完后才结束
        //||：判断完后不需要判断右边的就结束
        if (month == 3 || month == 4 || month == 5)
        {
            System.out.println(month+" month "+"Spring");
        }
        else if (month == 6 || month == 7 || month == 8)
        {
            System.out.println(month+" month "+"Summer");
        }
        else if (month == 9 || month == 10 || month == 11)
        {
            System.out.println(month+" month "+"Autumn");
        }
        else if (month == 12 || month == 1 || month == 2)
        {
            System.out.println(month+" month "+"Winter");
        }
        else
        {
            System.out.println("Wrong Number");
        }

        int x = 13;

        if (x > 12 || x < 1)
        {
            System.out.println("Wrong Number");
        }
        else if (x >= 3 && x <= 5)
        {
            System.out.println(x+" month "+"Spring");
        }
        else if (x >= 6 && x <= 8)
        {
            System.out.println(x+" month "+"Summer");
        }
        else if (x >= 9 && x <= 11)
        {
            System.out.println(x+" month "+"Autumn");
        }
        else
        {
            System.out.println(x+" month "+"Winter");
        }
    }
}
