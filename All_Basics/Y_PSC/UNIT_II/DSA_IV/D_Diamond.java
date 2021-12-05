package Y_PSC.UNIT_II.DSA_IV;

import java.util.Scanner;

public class D_Diamond {
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
        if (n == 1) {
            for (int i = 0, j = 0; i < n; i++)
                System.out.println(arr[i][j]);
        } else if (n > 1) {
            for (int i = n / 2, j = n - 1; i >= 0; i--, j--)
                System.out.print(arr[i][j] + " ");
            for (int i = 1, j = n / 2 - 1; i < n / 2; i++, j--)
                System.out.print(arr[i][j] + " ");
            for (int i = n / 2, j = 0; i < n; i++, j++)
                System.out.print(arr[i][j] + " ");
            for (int i = n - 2, j = n / 2 + 1; i > n / 2; i--, j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
            System.out.println();
    }
}
/*
1
3
1 2 3
4 5 6
7 8 9
 */
