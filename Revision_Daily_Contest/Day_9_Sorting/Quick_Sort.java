package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_9_Sorting;

/*
Quickly Sort it
Description

You are given an array of N integers. Write QUICK SORT ALGORITHM to sort the numbers in ascending order

DO NOT USE ANY BUILTIN FUNCTION TO SORT

ALSO, YOU MUST NOT USE ANY OTHER ALGORITHM


Input
Input Format

First line contains N

Second line contains N space separated integers

Constraints

N < 1000


Output
Output Format

Print the sorted numbers separated by space


Sample Input 1

5
3 5 0 9 8
Sample Output 1

0 3 5 8 9

 */
import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        quickSort(arr, 0, n - 1);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
    }


    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = sortingAlgo(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    static int sortingAlgo(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
//            if (arr[j] < pivot) {    //ascending order
            if (arr[j] > pivot) {    //descending order
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
/*
5
3 5 0 9 8

Time Complexity :- O(n)
Space Complexity:- O(1)
 */
