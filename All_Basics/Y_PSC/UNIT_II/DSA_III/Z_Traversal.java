package Y_PSC.UNIT_II.DSA_III;

import java.util.Scanner;

public class Z_Traversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            res(N, arr);
        }
    }

    static void res(int N, int[][] arr) {
        for (int i = 0; i < N - 1; i++) {
            System.out.print(arr[0][i] + " ");
        }
        int k = 1;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++)
                if (j == N - k) {
                    System.out.print(arr[i][j] + " ");
                    break;
                }
            k++;
        }
        for (int i = 0; i < N; i++)
            System.out.print(arr[N - 1][i] + " ");

        System.out.println();
    }
}
/**
 * Z Traversal
 * Description
 * <p>
 * Given a square matrix of size N x N. Print the Z traversal of the matrix. Refer the figure given below for better understanding.
 * <p>
 * Image
 * <p>
 * <p>
 * Input
 * The first line of the input contains T, the number of test cases. The first line of each test case contains N, the dimension of the square matrix.
 * <p>
 * Next N lines contains N space separated integers, denoting the values of the matrix.
 * <p>
 * Constraints
 * <p>
 * 1 <= T <= 10
 * <p>
 * 1 <= N <= 500
 * <p>
 * 1 <= A[i][j] <= 1000
 * <p>
 * <p>
 * Output
 * For each test case, print the elements that occur in the Z traversal of the matrix, on a new line.
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 1
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Sample Output 1
 * <p>
 * 1 2 3 5 7 8 9
 */