package Basic_To_Advanced_DataStructure.Basic;

/**
 * Equal to 42 or not! -12412:7:35
 * Description
 *
 * You are given an array of N integers. Output "Yes" if 42 is present in array, else print "No".
 *
 *
 * Input
 * Input Format :
 *
 * First line contains number of integers N present in the array.
 *
 * Second line contains  N  space separated integers.
 *
 * Constraints :
 *
 * N<100
 *
 *
 * Output
 * Output Yes/No based on condition mentioned above.
 *
 *
 * Sample Input 1
 *
 * 5
 * 3 7 0 9 8
 * Sample Output 1
 *
 * No
 */

import java.util.Scanner;

public class EqualTo42OrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(res(n,arr));
    }

    static String res(int n, int[] arr) {
        int k = 42;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) return "Yes";
        }
        return "No";
    }

}
