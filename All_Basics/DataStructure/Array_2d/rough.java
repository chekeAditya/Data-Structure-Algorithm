package DataStructure.Array_2d;

import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        int[][] mat1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = scan.nextInt();
            }
        } // first matrix inputs ends here.

        int[][] mat2 = new int[r2][c2];
        for (int k = 0; k < r2; k++) {
            for (int l = 0; l < c2; l++) {
                mat2[k][l] = scan.nextInt();
            }
        } // second matrix inputs ends here.

        if (r1 == r2 && c1 == c2) {
            for (int i = 0; i < r1; i++) {
                int sum1 = 0;
                for (int j = 0; j < c1; j++) {
                    sum1 = sum1 + mat1[i][j];
                }
                System.out.print(sum1 + " ");
            }
            System.out.println();


            for (int k = 0; k < r2; k++) {
                int sum2 = 0;
                for (int l = 0; l < c2; l++) {
                    sum2 = sum2 + mat2[k][l];
                }
                System.out.print(sum2 + " ");
            }
        }
    }
}