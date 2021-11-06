package day02;

public class Demo12 {
    public static void main(String[] args) {
        int x = 4;

        switch (x)
        {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Wrong Month");
                break;
        }

        /*
        Switch与if区别
        if可以判断区间
        switch判断区间要写出区间全部内容，比较费劲
        对于判断类型是boolean型的，if能判断，switch不能
        如果要对具体数值进行判断，数值不多用switch完成
         */
    }
}
