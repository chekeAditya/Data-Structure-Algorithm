package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class C_zigZag {
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
        zigzag(N, M, array);
    }

    static void zigzag(int N, int M, int[][] array) {
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = M - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                for (int j = 0; j < M; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

}
/**
 * Go in Zig-Zag
 * Description
 * <p>
 * Given a matrix with n rows and m columns. Print the matrix elements starting from the top right corner and follow a zig-zag pattern.
 * <p>
 * Look at the image for better understanding
 * <p>
 * Image
 * <p>
 * <p>
 * Input
 * Input Format
 * <p>
 * First line contains n and m
 * <p>
 * Next n line contains m space separated integers which describe each row of the 2d array
 * <p>
 * Constraints
 * <p>
 * n,m <=50
 * <p>
 * <p>
 * Output
 * Print all matrix elements in a single line separated by spaces.
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 5 5
 * 4 7 1 1 7
 * 8 9 9 6 1
 * 6 4 9 5 1
 * 7 7 4 7 7
 * 8 6 2 5 5
 * Sample Output 1
 * <p>
 * 7 1 1 7 4 8 9 9 6 1 1 5 9 4 6 7 7 4 7 7 5 5 2 6 8
 */
