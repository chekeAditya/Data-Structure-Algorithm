package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_2;

/**
 * Search Numbers Ended
 * Description
 *
 * You are given an array a of N integers a1,a2,…,aN.
 *
 * Your task is to respond to the queries like "How many numbers' values are betweenlandrinclusive ?".
 *
 *
 * Input
 * Input Format
 *
 * The first line of the input containsN— the length of the array.
 *
 * The second line containsNspace-separated integers a1,a2,…,aN.
 *
 * The third line contains integerk— the number of queries.
 *
 * The followingklines contain a pair of integersl r— query, described above.
 *
 * Constraints
 *
 * 1 <= N <= 10^5
 *
 * -10^9 <= a[i] <= 10^9
 *
 * 1 <= k <= 10^5
 *
 * -10^9 <= l <= r <= 10^9
 *
 *
 * Output
 * The output must consist of k integers — responses for the queries.
 *
 *
 * Sample Input 1
 *
 * 5
 * 10 1 10 3 4
 * 4
 * 1 10
 * 2 9
 * 3 4
 * 2 2
 * Sample Output 1
 *
 * 5 2 2 0
 * Hint
 *
 * For the first query, there are 5 numbers (10,1,10,3,4) in an array that lie between 1 and 10 inclusive, so the answer is 5.
 *
 * For the second query, there are 2 numbers (3,4) in an array that lie between 2 and 9 inclusive, so the answer is 2.
 *
 * For the third query, there are 2 numbers (3,4) in an array that lie between 3 and 4 inclusive, so the answer is 2.
 *
 * For the fourth query, there are no numbers in an array that lie between 2 and 2 inclusive, so the answer is 0.
 */

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
        }
    }

    static void res(int n, int start, int[] arr, int end) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= start && arr[i] <= end) {
                count++;
            }
        }
        System.out.print(count + " ");
    }
}
