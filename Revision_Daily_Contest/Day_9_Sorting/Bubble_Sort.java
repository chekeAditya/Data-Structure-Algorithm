package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_9_Sorting;
/*
Bubble Sort Problem -2:18:53
Description

You are given an array of N unsorted numbers. Your task is to write BUBBLE SORT such that numbers present in the array gets sorted.

USING ANY OTHER ALGORITHM OR USING IN BUILT SORT FUNCTION WOULD LEAD TO YOUR DISQUALIFICATION


Input
Input Format:

First line of input contains N

Second line of input contains N numbers

Constraints:

N < 500


Output
Output the numbers given after sorting it in increasnig order


Sample Input 1

5
3 5 0 9 8
Sample Output 1

0 3 5 8 9
 */

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        bubble_sort(arr);
//        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
    }

    static void bubble_sort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    count++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(count);
    }
}
/*
5
3 5 0 9 8

Time Complexity:- O(n^2);
Space Complexity:- O(1);
 */
