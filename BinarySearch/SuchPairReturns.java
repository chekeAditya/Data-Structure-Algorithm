package Basic_To_Advanced_DataStructure.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Such Pair Returns -0:54:21
 * Description
 * <p>
 * For each test case, you are given N integers and K, your task is to write a program that prints "1" (without quotes) if there are 2 integers present in the array whose sum is K. Else print "-1" (without quotes).
 * <p>
 * <p>
 * Input
 * 10^6Input Format :
 * <p>
 * First line contains T, no of test cases.
 * <p>
 * First line of each test case contains 2 space separated integers: N & K
 * <p>
 * Second line of each test case contains **N** space separated integers
 * <p>
 * Constraints :
 * <p>
 * 1 <= T <= 10
 * <p>
 * 1 <= N <=1000000
 * <p>
 * 1 <= abs(A[i]) <=10^6<= abs(K) <= 2*10^6
 * <p>
 * <p>
 * <p>
 * <p>
 * Output
 * Output 1/-1 depending on the condition for each test case on new line
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 1
 * 5 2
 * 3 4 0 2 7
 * Sample Output 1
 * <p>
 * 1
 */

public class SuchPairReturns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            System.out.println(sumTwoNumber(n, k, arr, 0, n - 1));
        }
    }

    static int sumTwoNumber(int n, int k, int[] arr, int low, int high) {
        while (low < high) {
            if (arr[low] + arr[high] == k) {
                return 1;
            } else if (arr[low] + arr[high] > k) {
                high = high - 1;
            } else {
                low = low + 1;
            }
        }
        return -1;
    }
}
