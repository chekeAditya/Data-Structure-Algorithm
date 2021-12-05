package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class D_Specific_Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int K = scanner.nextInt();
        specificDiagonal(N, M, array, K);
    }

    static void specificDiagonal(int N, int M, int[][] array, int K) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (array[i][j] == K) {
                    for (int a = 0; a < N; a++) {
                        for (int b = 0; b < M; b++) {
                            if (b - a == j - i) {
                                System.out.print(array[a][b] + " ");
                            }
                        }
                    }
                    System.out.println();
                    for (int c = 0; c < N; c++) {
                        for (int d = 0; d < M; d++) {
                            if (c + d == j + i) {
                                System.out.print(array[c][d] + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
/**
 * Specific Diagonals
 * Description
 * <p>
 * Given a matrix which contains distinct integers and you are given an integer and you need to print both the diagonals crossing through the given element , you can always assume that the given element always exist in the matrix.
 * <p>
 * <p>
 * <p>
 * image.png
 * <p>
 * <p>
 * <p>
 * In this 4*4 Matrix, suppose we need to print the diagonal of 11, So the output will be :
 * 1 6 11 16
 * <p>
 * 8 11 14
 * <p>
 * Note: You need to print the diagonal from top to bottom also make sure you print the diagonals going from left to right first then diagonal going right to left, and print both the diagonals in a new line.
 * <p>
 * <p>
 * Input
 * The first line of input will contain two integers R and C , denoting the Rows and Columns of the Matrix.
 * <p>
 * Next R (rows) lines contain C integers each denoting the matrix elements.
 * <p>
 * The next line will contain an integer K, denoting the element for which we need to print the diagonals.
 * <p>
 * <p>
 * <p>
 * Constraints:
 * 1<= R, C <= 100
 * <p>
 * 1<= Matrix[i][j] <= 10^4
 * <p>
 * 1<= K <= 10^4
 * <p>
 * <p>
 * Output
 * Output both the diagonals containing the given element , print both the diagonals in a new line and from top to bottom order.
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 6
 * Sample Output 1
 * <p>
 * 2 6
 * 6 8
 * <p>
 * Hint
 * <p>
 * In Sample 1:
 * R = 3, C = 3
 * <p>
 * we need to print the diagonals of 6, also we are printing diagonals from top to bottom and left to right first then right to left , So output will be
 * <p>
 * 2 6 -> left to right diagonal and from top to bottom order
 */