package Basic_To_Advanced_DataStructure.BinarySearch;

/**
 * Search in sorted and rotated array -9279:37:56
 * Description
 *
 * Given a sorted(increasing order) array of length n and is rotated by some value beforehand. Find the index of the target element  K in the rotated array in O(logn) time. If not found print -1.
 *
 * Note: Array contains all distinct elements.
 *
 *
 * Input
 * Input Format
 *
 * First line consists of n and k separated by space.
 *
 * Second line consists of n integers separated by spaces
 *
 * Constraints
 *
 * 1 <= n <= 50
 *
 * k <= 50
 *
 *
 *
 *
 *
 *
 * Output
 * Print index of the target element
 *
 *
 * Sample Input 1
 *
 * 5 1
 * 3 4 5 1 2
 * Sample Output 1
 *
 * 3
 * Sample Input 2
 *
 * 6 6
 * 3 4 7 9 1 2
 * Sample Output 2
 *
 * -1
 */

import java.util.Scanner;

public class Search_In_Sorted_And_Rotated_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(res(n, arr, k));
    }

    static int res(int n, int[] arr, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) return mid;
            else if (arr[low] <= arr[mid]) {
//  low to mid is sorted
                if (k >= arr[low] && k <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if (arr[mid] <= arr[high]) {
//  mid to high is sorted
                if (k > arr[mid] && arr[high] >= k)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
