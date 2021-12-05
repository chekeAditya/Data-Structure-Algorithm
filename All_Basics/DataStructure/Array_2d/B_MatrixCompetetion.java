package DataStructure.Array_2d;

import java.util.Scanner;

public class B_MatrixCompetetion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (
                int i = 0;
                i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt(); // row of second matrix
        int l = scanner.nextInt(); // col of second matrix
        int[][] arrayB = new int[k][l];
        for (
                int i = 0;
                i < k; i++) {
            for (int j = 0; j < l; j++) {
                arrayB[i][j] = scanner.nextInt();
            }
        }

        // logic
        int sum1 = 0;
        int sum2 = 0;

        for (
                int i = 0;
                i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum1 += array[i][j];
            }
        }
        for (
                int i = 0;
                i < k; i++) {
            for (int j = 0; j < l; j++) {
                sum2 += arrayB[i][j];
            }
        }
        if (sum1 > sum2) {
            System.out.println(sum1);
        } else {
            System.out.println(sum2);
        }
    }
}


/*

Description

You are given two matrices (2D array). The first array A (n rows and m columns) and second array B (i rows and j columns).

Output sum of the matrix which is greater than the sum of other matrix.

PLEASE DON'T CONVERT YOUR 2D ARRAY TO 1D ARRAY FOR THIS TASK** because this question is to make you comfortable in 2d array


Input
Input Format

First line contains n and m (number of rows and columns of first matrix).

Next n lines contain m elements which are elements of first matrix.

Next line contains i and j (number of rows and columns of second matrix).

Next, i lines contain j elements which are elements of the second matrix.

Constraints

n<100

m<100

i<100

j<100




Output
Output one number, which is the sum of elements of that matrix whose sum is greater than other.


Sample Input 1

3 4
1 2 3 4
0 5 6 1
9 3 0 8
2 2
8 8
8 8
Sample Output 1

42
Hint

Sample 1 Explanation

Sum of elements present in the first matrix is 42 and the sum of elements present in the second matrix is 32.

So, the answer is 42

 */
