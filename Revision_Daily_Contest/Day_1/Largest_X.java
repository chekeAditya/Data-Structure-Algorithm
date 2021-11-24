package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_1;
/**
 * Largest X -10:3:4
 * Description
 * <p>
 * You are given an array of size N. You need to find the largest number X such that the array has both +X and -X in it.
 * <p>
 * <p>
 * Input
 * Input Format
 * <p>
 * First-line contains T, no of test cases.
 * <p>
 * The first line of each test case contains N, the size of the array.
 * <p>
 * The second line of each test case contains N space-separated numbers, elements of the array.
 * <p>
 * Constraints
 * <p>
 * 1 <= T <= 10
 * <p>
 * 1 <= N <= 10^5
 * <p>
 * -10^5 <= A[i] <= 10^5, A[i]!=0
 * <p>
 * <p>
 * Output
 * For each test case, print X or else print -1, if it doesn't exist.
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 2
 * 5
 * 2 1 -1 -2 3
 * 5
 * -3 2 -4 4 -2
 * Sample Output 1
 * <p>
 * 2
 * 4
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Largest_X {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.println(res(n, arr));
        }
    }


    static int res(int n, int[] arr) {
        int count = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && (arr[i] + arr[j]) == 0) {
                    if (count < arr[i])
                        count = arr[i];
                    break;
                }
            }
        }
        return count;
    }
}
/*
2
5
2 1 -1 -2 3
i j
5
-3 2 -4 4 -2

-1 -2 1 2 3
 */
