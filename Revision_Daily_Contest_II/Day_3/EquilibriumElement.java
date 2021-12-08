package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_3;
/**
 * Equilibrium Element -9:46:14
 * Description
 *
 * Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
 *
 *
 * Input
 * Input Format
 *
 * First line contains an integer N denoting the size of the array.
 *
 * Then in the next line are N space separated values of the array A.
 *
 * N <= 1000
 *
 * Ai <= 10000
 *
 *
 * Output
 * In a new line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.
 *
 *
 * Sample Input 1
 *
 * 5
 * 3 3 5 5 1
 * Sample Output 1
 *
 * 3
 */

import java.util.Scanner;

public class EquilibriumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(res(n, arr, 0, n - 1, 0, 0));
    }

    static int res(int n, int[] arr, int start, int end, int sum, int count) {
        while (start < end) {
            count = 0;
            sum = 0;
            int i = 0, j = end;
            while (i < start) {
                sum += arr[i];
                i++;
            }
            while (j > start) {
                count += arr[j];
                j--;
            }
            start++;
            if (sum == count)
                return start;
        }
        return -1;
    }
}
