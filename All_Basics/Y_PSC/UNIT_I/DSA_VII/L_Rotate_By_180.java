package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class L_Rotate_By_180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int n = scanner.nextInt();
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            res(n, array);
            T--;
        }
    }

    static void res(int n, int[][] array) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
123
456
789
 */
/**
 * Rotate by 180
 * Description
 * <p>
 * You are given a square matrix of size N x N. Rotate the matrix by 180 degrees.
 * <p>
 * <p>
 * Input
 * The first line of the input contains T, the number of test cases.
 * <p>
 * The next line contains N, the size of the square matrix.
 * <p>
 * The next N lines contain N space separated integers, denoting the values of the matrix.
 * <p>
 * Constraints
 * <p>
 * 1 <= T <= 10
 * <p>
 * 1 <= N <=50
 * <p>
 * 1 <= A[i][j] <= 100
 * <p>
 * <p>
 * Output
 * For each test case, print the matrix after rotating 180 degrees, and print in the form as shown in the sample output.
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 2
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 4
 * 1 2 3 4
 * 5 6 7 8
 * 9 0 1 2
 * 3 4 5 6
 * Sample Output 1
 * <p>
 * 9 8 7
 * 6 5 4
 * 3 2 1
 * 6 5 4 3
 * 2 1 0 9
 * 8 7 6 5
 * 4 3 2 1
 * Hint
 * In the sample test cases, the matrices have been rotated by 180 degrees.
 */