package Z_Rivision;

import java.util.Scanner;

public class R7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            res(n, arr);
        }
    }

    static void res(int n, int[][] arr) {
        for (int i = n / 2, j = n - 1; i >= 0; i--, j--) {
            System.out.print(arr[i][j] + " ");
        }
        for (int i = n / 2, j = 0; i < n; i++, j++) {
            System.out.print(arr[i][j] + " ");
        }
        for (int i = n - 2, j = n / 2 + 1; i > 0 && j < n; j++, i--) {
            System.out.print(arr[i][j] + " ");
        }
    }
}
