package Basic_To_Advanced_DataStructure.BinarySearch;

/**
 * Binary Search - Recursive
 * Description
 *
 * Given n distinct numbers, implement a recursive binary search to check the presence of target number k.
 *
 * In case k is present among those n numbers, print 1
 *
 * Else print -1
 *
 *
 * Input
 * Input Format :
 *
 * First line of input contains n and k separated by a space
 *
 * Next line contains n space separated integers
 *
 * Constraints:
 *
 * n<1000
 *
 *
 * Output
 * In casekis present among those n numbers, print 1
 *
 * Else print -1
 *
 *
 * Sample Input 1
 *
 * 5 0
 * 2 -2 0 3 4
 * Sample Output 1
 *
 * 1
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Iterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println(iterativeWay(n, k, arr));
    }

    static int iterativeWay(int n, int k, int[] arr) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low / 2);
            if (arr[mid] == k) return 1;
            else if (arr[mid] < k) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
/*
5 0
2 -2 0 3 4
 */
