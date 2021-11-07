package Basic_To_Advanced_DataStructure.BinarySearch;

import java.util.Scanner;

/**
 * Everything related to Binary Search
 * Description
 * <p>
 * Given a sorted array with repeating integers. You need to find the first occurence , last occurence and count of a given key in the array. USE ONLY BINARY SEARCH. Your algorithm should run in LogN time.If element is not present print -1 -1 0.
 * <p>
 * <p>
 * Input
 * Input Format
 * <p>
 * First line contains N , then N integers in next line , then key in the next line.
 * <p>
 * Constraints
 * <p>
 * N<=1000000
 * <p>
 * <p>
 * Output
 * Output Format
 * <p>
 * 3 space separated integers for lower bound , upper bound and count/frequency of that key.
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 6
 * 1 1 1 2 2 2
 * 1
 * Sample Output 1
 * <p>
 * 0 2 3
 */

public class EverythingRelatedToBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.print(firstOccurence(arr, k) + " ");
        System.out.print(lastOccurence(arr, k) + " ");
        System.out.println(frequency(arr,k));
    }

    static int firstOccurence(int[] arr, int k) {
        int start = 0, end = arr.length - 1, temp = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[start] == k) {
                temp = mid;
                end = mid - 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return temp;
    }

    static int lastOccurence(int[] arr, int k) {
        int start = 0, end = arr.length - 1, temp = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[start] == k) {
                temp = mid;
                start = mid + 1;
            } else if (arr[mid] > k) end = mid - 1;
            else start = mid + 1;
        }
        return temp;
    }

    static int frequency(int[] arr, int k) {
        int y = lastOccurence(arr, k), x = firstOccurence(arr, k);

        if (y != -1 || x != -1) {
            return y - x + 1;
        }
        return 0;
    }
}
