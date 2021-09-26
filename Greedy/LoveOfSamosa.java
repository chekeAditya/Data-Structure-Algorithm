package Basic_To_Advanced_DataStructure.Greedy;

/**
 * Love of Samosa Ended
 * Description
 *
 * Amit went down to the Samosa street to have some. But he only has K units of money with him. There are N shops on the street and unfortunately, all of them have only one samosa remaining. You are also given an array A, where Ai is the cost of a samosa on the i'th shop.
 *
 * Find the maximum samosas that Amit can eat.
 *
 *
 * Input
 * Input Format
 *
 * First line contains two space-separated integers N and K.
 *
 * Second line contains N space separated integers, the cost of a samosa on the shops.
 *
 * Output Format
 *
 * 1 ≤ N ≤ 1000
 *
 * 0 ≤ K ≤ 1000
 *
 * 0 ≤ Ai ≤ 100
 *
 *
 *
 *
 * Output
 * Output Format
 *
 * Print the required answer
 *
 *
 *
 *
 * Sample Input 1
 *
 * 4 10
 * 5 4 2 4
 * Sample Output 1
 *
 * 3
 */

import java.util.Arrays;
import java.util.Scanner;

public class LoveOfSamosa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println(res(n,k,arr));
    }

    static int res(int n, int k, int[] arr) {
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] < k && sum <= k){
                count++;

            }
        }
        return count;
    }
}
