package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class B_Traverse_A_2D_Array_3 {
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
        traversal(N,M,arr);
    }

    static void traversal(int N, int M, int[][] arr) {
        for (int j = M -1 ; j >= 0; j--) {
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
/**
 * Traverse a 2d array - 3
 * Description
 *
 * Given a 2D Array, Traverse the 2D array from right to left, and from up to down.
 *
 * Refer the following image given below for better understanding.
 *
 * Screenshot (93).png
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
 * Print all elements of matrix on single line, in the order as given in the problem statement.
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
 * 9 10 11 12 8 7 6
 */