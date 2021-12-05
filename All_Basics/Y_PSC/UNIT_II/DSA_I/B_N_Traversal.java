package Y_PSC.UNIT_II.DSA_I;

import java.util.Scanner;

public class B_N_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- != 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            res(n, arr);
        }
    }

    static void res(int n, int[][] arr) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i][0] + " ");
        }
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i][i] + " ");
        }
        for (int i = n - 2; i >= 0; i--) {
            System.out.print(arr[i][n - 1] + " ");
        }
        System.out.println();
    }
}

/**
 * N traversal
 * Description
 * <p>
 * You are given a matrix of size n x n. Find theNtraversal of the matrix. Refer the following figure for better understanding.
 * <p>
 * Image
 * <p>
 * <p>
 * Input
 * The first line contains T, the number of test cases. The first line of each test case contains N, the size of the square matrix.
 * <p>
 * Next N lines contain N space separated integers, denoting the values of the matrix.
 * <p>
 * <p>
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
 * For each test case, print the N traversal of the matrix on a single line, on a new line.
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
 * 7 4 1 5 9 6 3
 */
