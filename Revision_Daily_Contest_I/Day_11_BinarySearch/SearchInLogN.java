package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_11_BinarySearch;

/*
Search in O(logn) -1:10:51
Description

You need to find index (0-based) of a given key in a sorted array. Use only Binary Search.


Input
Input Format :
The first line contains N.Next line contains N integers of the array. The next line contains the key to be searched. If element is not found print -1.

Constraints :

N<=1000000


Output
Single Integer index or -1.


Sample Input 1

5
1 2 3 5 6
4
Sample Output 1

-1
 */

import java.util.Scanner;

public class SearchInLogN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(res(n, 0, arr.length - 1, k, arr));
    }

    static int res(int n, int low, int high, int k, int[] arr) {
        int mid = low + (high - low) / 2;
        if (low > high) {
            return -1;
        }
        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] > k) {
            return res(n, low, mid - 1, k, arr);
        } else {
            return res(n, mid + 1, high, k, arr);
        }
    }
}
