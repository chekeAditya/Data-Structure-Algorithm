package Java.X_Evaluation.Unit_I.F_Evalution;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            res(n,arr);
            T--;
        }
    }

    static void res(int n, int[][] arr) {
        int greatest = arr[0][0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > greatest) greatest = arr[i][j];
                if (i == j && arr[i][j] == greatest) {
                    count++;
                } else if (i + 1 == n - 1 && arr[i][j] == greatest) {
                    count++;
                }
            }
        }
        if (count % 2 == 0) System.out.println("yes");
        else System.out.println("no");
    }
}
/*
1
2
1 4
4 3
 */
