package day02;

public class Demo06 {
    public static void main(String[] args) {

        int x = 7;
        //逻辑运算符用于连接布尔类型的表达式

        /*
        &：只要两边的boolean表达式结果有一个为false，那么结果就是false，只有两边都为true，结果为true
        |：两边只要有一个为true，结果为true。只有两边都为false，结果false。
        ^：异或，与|唯一不同点：当 true ^ true = false，两边相同结果是假，两边不同结果是true
        ！：非，事物的另一面
         */
        System.out.println(false ^ false);

        int a = 4;
        System.out.println(a > 3 && a < 6);
        System.out.println(a > 3 & a < 6);
        /*
        &：无论左边是真是假，右边都运算
        &&：当左边为假时又遍布运算
         */

        /*
        |：两边都参与运算
        ||：当左边为真时右边不运算
         */

    }
}
