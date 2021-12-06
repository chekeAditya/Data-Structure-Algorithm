package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_1;
/*
Gifts -7:59:1
Description

Given an array A of size n, which contains gift ids of various gifts kept in a row. You can select any subarray of gifts that contains all unique gift id.

What is the longest sequence of successive gifts where each gift id is unique?


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (1 ≤ n ≤ 100000).

The second line of the test case contains n integers (1 ≤ Ai ≤ 10000).


Output
For each test case, print the answer: The length of the required subarray.


Sample Input 1

3
8
1 2 1 3 2 7 4 2
5
1 2 1 3 4
4
1 2 2 1
Sample Output 1

5
4
2
 */
import java.util.HashMap;
import java.util.Scanner;

public class Gifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.print(res(arr, n));
            System.out.println();
        }
    }

    private static int res(int[] a, int n) {
        int count = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int start = 0, j = 0;
        while (start < n) {
            j = Math.max(hashmap.getOrDefault(a[start], 0), j);
            count = Math.max(count, start - j + 1);
            hashmap.put(a[start], start + 1);
            start++;
        }
        return count;
    }
}
