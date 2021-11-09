package day03;

import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int [r][c];
        sc.nextLine();

        for(int x = 0; x < r; x++)
        {
            for(int y = 0; y < c; y++)
            {
                matrix[x][y] = sc.nextInt();
                System.out.print(matrix[x][y]+" ");

            }
            System.out.println();
        }
    }
}
