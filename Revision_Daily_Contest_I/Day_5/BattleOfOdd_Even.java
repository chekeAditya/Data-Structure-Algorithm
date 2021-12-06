package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_5;

/**
 * Battle of Odd & Even -0:31:0
 * Description
 *
 * You are given an arrayarrofNintegers.
 *
 * You need to printOdd, if thesum of all odd numberspresent in the array is greater thansum of all the even numberspresent in the array, or else printEven.
 *
 *
 * Input
 * Input Format :
 *
 * First line contains N which is the number of elements present in the array.
 *
 * Second line contains N space separated integers which are the elements of array.
 *
 *
 *
 * Constraints :
 *
 * 1 <= N <= 100
 *
 * 1 <= arr[i] <= 100
 *
 *
 * Output
 * Print either "Odd" or "Even" depending upon the condition mentioned above.
 *
 *
 * Sample Input 1
 *
 * 4
 * 1 2 3 4
 * Sample Output 1
 *
 * Even
 * Hint
 *
 * Output Explanation :
 *
 * Odd numbers present are 1 and 3, whose sum is 4
 *
 * Even numbers present in array are 2 and 4, whose sum is 6
 */

import java.util.Scanner;

public class BattleOfOdd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(res(n, arr));
    }

    static String res(int n, int[] arr) {
        int sumOdd = 0, sumEven = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                sumEven += arr[i];
            else
                sumOdd += arr[i];
        }
        if (sumEven > sumOdd) return "Even";
        else if (sumEven == sumOdd)
            return "Even";
        else return "Odd";
    }
}
