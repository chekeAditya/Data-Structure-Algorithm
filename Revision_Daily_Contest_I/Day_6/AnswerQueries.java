package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_6;

/**
 * Answer Queries -23:26:1
 * Description
 * <p>
 * You are given an integer array arr of size n. This array is queried q times. In each query, an element x is given. For each query, you have to print "YES" if the element exists in the array or "NO" if it doesn't exist
 * <p>
 * <p>
 * Input
 * Input Format
 * <p>
 * First line contains n the number of elements in the array
 * <p>
 * Second line contains n space separated integers, the elements of the array
 * <p>
 * Third line contains q, the number of queries
 * <p>
 * Fourth line contains q space separated integers
 * <p>
 * <p>
 * <p>
 * Constraints
 * <p>
 * 1 <= n <= 10e5
 * <p>
 * 1 <= arr[i] <= 10e5
 * <p>
 * 1 <= q <= 10e5
 * <p>
 * 1 <= query[i] <= 10e5
 * <p>
 * <p>
 * Output
 * For each query, print on a new line, "YES" if the element exists in the array, "NO" otherwise
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 5
 * 1 2 3 4 5
 * 3
 * 3 5 7
 * Sample Output 1
 * <p>
 * YES
 * YES
 * NO
 */

import java.util.HashSet;
import java.util.Scanner;

public class AnswerQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) hashSet.add(scanner.nextInt());
        int q = scanner.nextInt();
        while (q-- > 0) {
            int query = scanner.nextInt();
            if (hashSet.contains(query)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
