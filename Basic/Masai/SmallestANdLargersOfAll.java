package Basic_To_Advanced_DataStructure.Basic.Masai;

/**
 * Smallest and Largest of all -12412:10:48
 * Description
 *
 * Given an array, A, of N integers, print the smallest and largest element present in the array
 *
 * YOU MUST NOT USE ANY BUILT-IN FUNCTION
 *
 *
 * Input
 * Input Format
 *
 * The first line contains an integer, N (the number of integers in A). The second line contains N space separated integers describing A.
 *
 * Constraints
 *
 * N<100
 *
 *
 * Output
 * Output Format
 *
 * Print 2 integers in different lines where first integer represents the minimum of all elements and second integer represents the maximum of all
 *
 *
 * Sample Input 1
 *
 * 4
 * -2 0 8 4
 * Sample Output 1
 *
 * -2
 * 8
 */

import java.util.Scanner;

public class SmallestANdLargersOfAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        res(n,arr);

    }

    static void res(int n, int[] arr) {
        int smallest = arr[0];
        int highest = arr[0];
        for (int i = 0; i < n; i++) {
            if (smallest > arr[i]) smallest = arr[i];
            if (highest < arr[i]) highest = arr[i];
        }
        System.out.println(smallest);
        System.out.println(highest);
    }
}
