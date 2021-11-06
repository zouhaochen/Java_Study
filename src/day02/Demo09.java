package day02;

public class Demo09 {
    public static void main(String[] args) {
        //需求：根据用户定义的数值不同，打印对应的星期英文

        int num = 7;

        if (num == 1)
            System.out.println("Monday");
        else if (num == 2)
            System.out.println("Tuesday");
        else if (num == 3)
            System.out.println("Wednesday");
        else if (num == 4)
            System.out.println("Thursday");
        else if (num == 5)
            System.out.println("Friday");
        else if (num == 6)
            System.out.println("Saturday");
        else if (num == 7)
            System.out.println("Sunday");
        else
            System.out.println("Wrong number");
    }
}
