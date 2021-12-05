package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class A_Traverse_A_2D_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        traverse(N, M, arr);
    }

    static void traverse(int N, int M, int[][] arr) {
        for (int j = 0; j < M; j++) {
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
/**
 * Traverse a 2D Array
 * Description
 *
 * You are given a 2D array(a matrix).
 *
 * You need to print elements of array in as shown in diagram, on a single line.
 *
 * Image
 *
 *
 * Input
 * First line contains two integers N and M, no of rows and columns of matrix.
 *
 * Next N lines contains M space separated integers which are elements of matrix.
 *
 * Constraints
 *
 * 1 <= N*M <= 10^6
 *
 * 1 <= A[i][j] <= 100
 *
 *
 * Output
 * Print all elements of matrix on single line, in the order shown in diagram.
 *
 *
 * Sample Input 1
 *
 * 4 3
 * 1 8 9
 * 2 7 10
 * 3 6 11
 * 4 5 12
 * Sample Output 1
 *
 * 4 3 2 1 5 6 7 8 12 11 10 9
 */