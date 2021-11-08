package day04;

public class Demo07 {
    
    /*
    十进制转换成二进制
     */
    public static void main(String[] args)
    {
        toBin(6);
        toHex(60);
    }
    public static <StringBufferng> void toBin(int num)
    {
        StringBufferng sb = (StringBufferng) new StringBuffer();
        while(num > 0)
        {
            /*
            System.out.println(num%2);
            */
            ((StringBuffer) sb).append(num%2);
            num = num / 2;
        }
        System.out.println(((StringBuffer) sb).reverse());
    }

    /*
    十进制转换成十六进制
     */
    public static void toHex(int num)
    {
        StringBuffer sb = new StringBuffer();
        for(int x =0; x < 8; x++)
        {
            int temp  = num & 15;
            if (temp > 9)
                sb.append((char)(temp-10+'A'));
                /*
                System.out.println((char)(temp-10+'A'));
                 */
            else
                sb.append(temp);
                /*
                System.out.println(temp);
                 */
            num = num >> 4;
        }
        System.out.println(sb.reverse());
    }
}
