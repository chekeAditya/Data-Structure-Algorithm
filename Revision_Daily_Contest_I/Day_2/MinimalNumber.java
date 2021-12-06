package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_2;

/**
 * Minimal Number Ended
 * Description
 *
 * Given an array A of size n, we need the create a positive integer using all the elements from the array such that it is the least possible value and it doesn't have any leading zeroes as well.
 *
 * It is ensured that at least one non-zero element exists in the array so that one number can be formed without violating the rules of leading zeroes.
 *
 *
 * Input
 * The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.
 *
 * The first line of each test case contains a single integer n (1 ≤ n ≤ 100).
 *
 * The second line of the test case contains n integers (0 ≤ Ai ≤ 9).
 *
 *
 * Output
 * For each test case, print the answer.
 *
 *
 * Sample Input 1
 *
 * 3
 * 4
 * 2 1 0 0
 * 4
 * 1 4 2 3
 * 4
 * 5 2 3 2
 * Sample Output 1
 *
 * 1002
 * 1234
 * 2235
 */

import java.util.Arrays;
import java.util.Scanner;

public class MinimalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            res(arr);
            System.out.println();
        }
    }

    static void res(int[] arr) {
        int left = 0;
        if (arr[left] == 0) {
            while (left != arr.length) {
                if (arr[left] == 0)
                    left++;
                else {
                    int temp = arr[0];
                    arr[0] = arr[left];
                    arr[left] = temp;
                    break;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j);
        }
    }
}
