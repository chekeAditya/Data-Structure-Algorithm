package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_9_Sorting;
/**
 * Merge Sorting -23:8:42
 * Description
 *
 * You are given N numbers. Your task is to write MERGE SORT sorting algorithm (from scratch) to sort those N numbers.
 *
 * USING ANY OTHER ALGORITHM OR IN BUILT FUNCTION WOULD LEAD TO DISQUALIFICATION FROM NEXT HACKERRANK CONTEST
 *
 *
 * Input
 * Input Format:
 *
 * First line of input contains N
 *
 * Next line contains N space separated integers.
 *
 * Constraints:
 *
 * N < 1000000
 *
 *
 * Output
 * Output the sorted form of provided numbers
 *
 *
 * Sample Input 1
 *
 * 5
 * 3 5 0 9 8
 * Sample Output 1
 *
 * 0 3 5 8 9
 */

import java.util.Scanner;

public class Merge_Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        sort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int j : arr)
            System.out.print(j + " ");
    }

    static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            mergeSort(arr, l, m, r);
        }
    }

    private static void mergeSort(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1; // size of 1st sub-array
        int n2 = r - m;     // size of 2nd sub-array
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}
/*
5
3 5 0 9 8

Time Complexity:- O(nLogn)
Space Complexity:- O(n)
 */
