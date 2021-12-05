package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class K_SumWithourBorders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] array = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            System.out.println(result(n, m, array));
            T--;
        }
    }

    static int result(int n, int m, int[][] array) {
        int sum = 0;
        int sumAll = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                sumAll += array[i][j];

                if (i == 0) sum += array[i][j];
                else if (i == n - 1) sum += array[i][j];
                else if (j == m - 1) sum += array[i][j];
                else if (j == 0) sum += array[i][j];
            }
                return sumAll - sum;
    }
}
/**
 * Sum without borders
 * Description
 *
 * You are given a matrix of size n x m. Find the sum of all the elements of the matrix which do not lie at the border.
 *
 *
 * Input
 * The first line contains T, the number of test cases. The first line of each test case contains n and m, the matrix dimensions.
 *
 * Each of the next n lines contain m space separated integers, denoting the values of the matrix.
 *
 * Constraints
 *
 * 1 <= T <= 10
 *
 * 1 <= n,m <= 1000
 *
 * 1 <= a[i][j] <= 1000
 *
 *
 * Output
 * Print a single integer, denoting the sum of all the elements of the matrix, which do not lie on the border, on a new line.
 *
 *
 * Sample Input 1
 *
 * 1
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Sample Output 1
 *
 * 5
 * Hint
 *
 * In the sample test case, except for 5 all the elements lie on the border. Therefore, the required sum is 5.
 */
