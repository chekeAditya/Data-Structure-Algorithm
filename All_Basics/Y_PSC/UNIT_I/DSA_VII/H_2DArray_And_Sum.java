package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class H_2DArray_And_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(returnSum(n, m, s, array));
    }

    static int returnSum(int n, int m, int s, int[][] array) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (m - j >= 3)
                    if (array[i][j] + array[i][j + 1] + array[i][j + 2] == s) count++;
                if ((n - i) >= 3)
                    if (array[i][j] + array[i + 1][j] + array[i + 2][j] == s) count++;
                if (m - j >= 3 && (n - i) >= 3)
                    if (array[i][j] + array[i + 1][j + 1] + array[i + 2][j + 2] == s) count++;
                if ((m - j >= 3) && (i >= 2))
                    if (array[i][j] + array[i - 1][j + 1] + array[i - 2][j + 2] == s) count++;
            }
        }
        return count;
    }
}
///*
//4 4 11
//1 2 1 8
//2 2 8 6
//8 1 2 5
//2 5 8 6     -> 7
//
//5 5 10
//3 2 5 3 2
//5 2 5 5 3
//2 2 2 4 5
//3 3 4 7 3
//5 2 5 3 2   -> 17
//
//8 8 8
//4 4 2 2 4 1 4 4
//3 4 1 1 1 3 4 5
//3 3 5 1 3 1 5 1
//2 3 1 4 3 4 4 5
//2 3 1 5 1 1 5 5
//2 2 2 1 4 2 3 2
//1 2 4 3 5 3 1 5
//2 5 2 5 3 3 2 4     -> 22
//
// */
/**
 * /**
 * 2D Array and Sum
 * Description
 * <p>
 * You are given an array of n rows and m columns which contains positive integers and sum s
 * <p>
 * You need to find occurrences of the sum of three consecutive numbers (i.e x,y, and z ) whose sum is equal to s appear horizontally, vertically and diagonally in the given matrix.
 * <p>
 * Image
 * <p>
 * <p>
 * Input
 * Input Format
 * <p>
 * First line: Three integers n, m and s, where n denotes the number of rows, m denotes the number of columns in the matrix and s is the sum.
 * <p>
 * Next n lines: Each line contains m characters which contain positive integers only.
 * <p>
 * Constraints
 * <p>
 * 1 <= n,m < 10
 * <p>
 * 1 <= s <= 50
 * <p>
 * <p>
 * Output
 * Print the number of times the sum s appear in the matrix.
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 3 3 6
 * 3 2 1
 * 2 2 2
 * 1 5 1
 * Sample Output 1
 * <p>
 * 4
 * Hint
 * <p>
 * Sample 1 Explanation
 * here s is 6 presents 4 times( 2 Horizontal + 1 Vertical + 1 Diagonal)
 */