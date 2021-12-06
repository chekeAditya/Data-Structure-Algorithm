package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_9_Sorting;

/*
Sort an array using the selection sort
 */

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        selection_sort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
    }

    static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mid_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mid_index])
                    mid_index = j;

                int temp = arr[mid_index];
                arr[mid_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
/*
5
3 5 0 9 8

Time Complexity:- O(n^2)
Space Complexity:- O(1)
 */