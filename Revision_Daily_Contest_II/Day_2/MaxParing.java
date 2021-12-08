package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_2;

/*
Max pairing -8:6:17
Description

You are given two arrays A and B of sizes N and M respectively. You need to pair up maximum possible elements of the array. An element of A can be paired with an element of B if and only if the absolute difference between them is at most 1. An element used for pairing can not be used to form some other pair. You need to count maximum pairing possible in the given arrays.


Input
The first line of input contains two positive integer N and M denoting the size of the array A and B respectively.

The second will contain N space-separated integers A[i] denoting the elements of the array.

The third will contain M space-separated integers B[i] denoting the elements of the array.

Constraints

1 <= N <= 100

1 <= M <= 100

0 <= A[i],B[i] <= 10^6


Output
The single line of output should contain positive integers denoting themaximum pairing possible.


Sample Input 1

4 5
1 4 6 2
5 1 5 7 9
Sample Output 1

3
Sample Input 2

4 4
1 2 3 4
10 11 12 13
Sample Output 2

0
Hint

The possible pairing can be (1,1), (4,5), (6,5).
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaxParing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[m];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for (int i = 0; i < m; i++) arr1[i] = scanner.nextInt();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(res(n,m,arr,arr1,0,0,0));
    }

    static int res(int n, int m, int[] arr, int[] arr1,int start,int end,int count) {
        while (start < n && end < m) {
            int sum = Math.abs(arr[start] - arr1[end]);
            if (sum <= 1) {
                start++;
                end++;
                count++;
            } else if (arr[start] < arr1[end])
                start++;
            else
                end++;
        }
        return count;
    }
}
