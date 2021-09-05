package Basic_To_Advanced_DataStructure.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Upper Bound in LogN
 * Number of Occurences in logn
 * Description
 * <p>
 * You are given n different numbers and an integer k. Write a program that finds number of times k is present in log(n) time complexity.
 * <p>
 * NOTE: YOU MUST NOT USE BRUTE FORCE SOLUTION
 * <p>
 * WE KNOW THAT YOU KNOW BRUTE FORCE SOLUTION AND WANT YOU TRY THE LOGN SOLUTION
 * <p>
 * USING BRUTE FORCE/LINEAR SEARCH IN THIS CASE WOULD LEAD TO DISQUALIFICATION
 * <p>
 * <p>
 * Input
 * Input Format :
 * <p>
 * First line contains N and K
 * <p>
 * Second line contains N space separated sorted integers
 * <p>
 * Constraints :
 * <p>
 * N<100
 * <p>
 * <p>
 * Output
 * Print number of times that number is present in the given list
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 6 3
 * 2 3 3 3 6 9
 * Sample Output 1
 * <p>
 * 3
 */

public class NumberOfOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
//        System.out.println(occurence(n, k, arr, 0, n - 1));

    }

//    static int occurence(int n, int k, int[] arr, int low, int high) {
//        int count = 0;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (arr[mid] == k) count++;
//
//        }
//    }
}
