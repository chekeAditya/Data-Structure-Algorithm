package DataStructure.Array_2d;

import java.util.Scanner;

public class D_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        diagonalDifference(n, matrix);
    }

    public static void diagonalDifference(int n, int[][] matrix) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            diagonal1 += matrix[i][i];
            diagonal2 += matrix[j][i];
        }
        int difference = diagonal1 - diagonal2;
        System.out.println(difference);
    }
}
/*

MATRIX DIAGONAL DIFFERENCE
Given a Matrix (Square), print its diagonal difference
Sample Input

1 2 3
4 5 6
0 8 9
Sample Output

 7
Explanation - (1+5+9) - (3+5+0)

 */
