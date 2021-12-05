package Y_PSC.UNIT_II.DSA_IV;

import java.util.Scanner;

public class C_CircularTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = scanner.nextInt();

            res(n, arr);
        }
    }

    static void res(int n, int[][] arr) {
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i][0] + " ");
        for (int j = 1; j < n - 1; j++)
            System.out.print(arr[0][j] + " ");
        for (int i = 0; i < n - 1; i++)
            System.out.print(arr[i][n - 1] + " ");
        for (int j = n - 1; j >= 1; j--)
            System.out.print(arr[n - 1][j] + " ");
        System.out.println();
    }
}
/*
00 01 02
10 11 12
20 21 22
 */
