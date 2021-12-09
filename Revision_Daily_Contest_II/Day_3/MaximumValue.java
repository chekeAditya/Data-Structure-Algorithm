package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_3;

/**
 * Maximum value -0:7:20
 * Description
 *
 * You are given a array A of integers.
 *
 * You need to find maximum possible value of( i - j )where A[i]=A[j].
 *
 *
 * Input
 * First line contains T, no of test cases.
 *
 * First line contains N, no of arrays.
 *
 * Second line contains N space separated integers, elements of array.
 *
 * Constraints
 *
 * 1 <= T <= 10
 *
 * 1 <= N <= 10^6
 *
 * 1 <= A[i] <= 1000
 *
 *
 * Output
 * For each test case outputmaximum possible value of(i-j)where A[i]=A[j].
 *
 *
 * Sample Input 1
 *
 * 2
 * 5
 * 1 1 1 1 1
 * 5
 * 2 1 2 1 1
 * Sample Output 1
 *
 * 4
 * 3
 * Hint
 *
 * For 1st test case, maximum value is when i=5 and j=1 => 5-1 => 4.       [1 based indexing]
 *
 * For 2nd test case maximum value is when i=5 and j=2 => 5-2 => 3[1 based indexing]
 */

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            int start = 0;
            System.out.println(res(n, 0, start, start + 1, arr));
        }
    }

    static int res(int n, int count, int start, int end, int[] arr) {
        while (end < n) {
            if (arr[start] == arr[end]) {
                int sum = end - start;
                if (count < sum) count = sum;
            }
            end++;
            if (end == n) {
                start++;
                end = start + 1;
            }
        }
        return count;
    }
}
