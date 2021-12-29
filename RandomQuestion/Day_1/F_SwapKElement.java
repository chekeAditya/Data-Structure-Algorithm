package Basic_To_Advanced_DataStructure.RandomQuestion.Day_1;

import java.util.Scanner;

/**
 * Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 8, K = 3
 * Arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
 * Output: 1 2 6 4 5 3 7 8
 * Explanation: Kth element from beginning is
 * 3 and from end is 6.
 * Example 2:
 * <p>
 * Input:
 * N = 5, K = 2
 * Arr[] = {5, 3, 6, 1, 2}
 * Output: 5 1 6 3 2
 * Explanation: Kth element from beginning is
 * 3 and from end is 1.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function swapKth() which takes the array of integers arr, n and k as parameters and returns void. You have to modify the array itself.
 * <p>
 * Expected Time Complexity: O(1)
 * Expected Auxiliary Space: O(1)
 * <p>
 * Constraints:
 * 1 ≤ K ≤ N ≤ 105
 * 1 ≤ Arr[i] ≤ 103
 */

public class F_SwapKElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int k = scanner.nextInt();
        swapKth(arr, n, k);
    }


    static void swapKth(int arr[], int n, int k) {
        int start = 0, end = arr.length - 1;
        while (start <= k) {
            if (start != k) {
                start++;
                end--;
            } else {
                int temp = 0;
                temp = arr[start-1];
                arr[start-1] = arr[end+1];
                arr[end+1] = temp;
                break;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
