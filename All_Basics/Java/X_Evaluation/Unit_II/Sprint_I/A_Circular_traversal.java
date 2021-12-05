package Java.X_Evaluation.Unit_II.Sprint_I;

import java.util.Scanner;

public class A_Circular_traversal {
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

    static void res(int n, int[][] matrix) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(matrix[i][0] + " ");
        }
        for (int i = 1; i < n - 1; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(matrix[i][n - 1] + " ");
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