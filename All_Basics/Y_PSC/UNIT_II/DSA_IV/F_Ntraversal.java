package Y_PSC.UNIT_II.DSA_IV;

import java.util.Scanner;

public class F_Ntraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
                res(n,arr);
        }
    }

    static void res(int n, int[][] arr) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i][0] + " ");
        for (int i = n - 2, j = 1; i >= 0 && j < n; j++, i--)
            System.out.print(arr[i][j] + " ");
        for (int i = 1; i < n ; i++)
            System.out.print(arr[i][n - 1] + " ");
        System.out.println();
    }
}
/*
00 01 02
10 11 12
20 21 22

11

1
3
1 2 3
4 5 6
7 8 9
 */
