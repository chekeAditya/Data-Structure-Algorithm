package Basic_To_Advanced_DataStructure.BinarySearch;
/**
 * Nearly Perfect Queue -9206:20:26
 * Description
 *
 * Some people are standing in a row according to their assigned number. If it were a perfect queue the numbers would be completely sorted, but since it's not there are some irregularities. Some people are standing adjacent to the position in which they should be. But no one is standing beyond one place of their assigned position. You want to find the current position of a person in this nearly perfect queue inLog(n)time.
 *
 *
 * Input
 * First line contains the number of cases (t)
 *
 * Next 2t lines contains the length of the queue, the number of the person you want to find and the queue, in two different lines
 *
 * 1 <= t <= 375
 *
 * Length of queue <= 10000
 *
 *
 * Output
 * Output the index of the person in the queue for each case
 *
 * Output "Not Found" if no index was found
 *
 *
 * Sample Input 1
 *
 * 1
 * 7 40
 * 10 3 40 20 80 70 90
 * Sample Output 1
 *
 * 2
 */

import java.util.Scanner;
import java.util.Stack;

public class Nearly_Perfect_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            if (res(n, arr, k) == -1) {
                System.out.println("Not Found");
            } else {
                System.out.println(res(n, arr, k));
            }
        }
    }

    static int res(int n, int[] arr, int k) {
        int low = 0, high = n - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == k) return mid;
            else if (arr[low] <= arr[mid]) {
                if (k >= arr[mid] && k <= arr[mid])
                    high = low - 1;
                else
                    low = mid + 1;
            } else if (arr[mid] <= arr[high]) {
                if (k >= arr[mid] && k <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
