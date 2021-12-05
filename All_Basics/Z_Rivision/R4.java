package Z_Rivision;

import java.util.Scanner;

public class R4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int q = scanner.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            res(n, m, arr, q);
        }
    }

    static void res(int n, int m, int[][] arr, int q) {
        if (q == 1) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                } else {
                    for (int j = m - 1; j >= 0; j--) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        } else if (q == 2) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = m - 1; j >= 0; j--) {
                        System.out.print(arr[i][j] + " ");
                    }
                } else {
                    for (int j = 0; j < m; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }
        System.out.println();
    }
}
