package Java.X_Evaluation.Unit_II.Sprint_I;

import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[][] arr = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            res(N, M, arr);
        }
    }

    static void res(int N, int M, int[][] arr) {
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i][0] + " ");
        }
        for (int j = 1; j < M; j++) {
            System.out.print(arr[0][j] + " ");
        }
        for (int i = 1; i < N; i++) {
            System.out.print(arr[i][M - 1] + " ");
        }
        for (int j = M - 2; j > 0; j--) {
            System.out.print(arr[N - 1][j] + " ");
        }
        for (int i = N - 2; i > 0; i--) {
            System.out.print(arr[i][N-2] + " ");
        }
    }
}
/*

 */