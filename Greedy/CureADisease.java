package Basic_To_Advanced_DataStructure.Greedy;

/**
 * Cure a disease Ended
 * Description
 *
 * A new deadly virus has infected large population of a planet. Scientists have discovered a new strain of virus which can cure this disease. Vaccine produced from this virus has various strength.
 *
 * A person is cured only if strength in vaccine batch is more than midichlorians count of person.
 *
 * A doctor receives a new set of report which contains midichlorians count of each infected patient, You have all vaccine doctor has and their strengths. You need to determine if doctor can save all patients with the vaccines he has. The number of vaccines and patients are equal.
 *
 *
 * Input
 * Input Format
 *
 * First line contains the number of vaccines - N.
 *
 * Second line contains N integers, which are strength of vaccines.
 *
 * Third line contains N integers, which are midichlorians count of patients.
 *
 *
 *
 * Constraints
 *
 * N < = 10
 *
 *
 * Output
 * Output Format
 *
 * Print a single line containing "Yes" (without quotes) or "No" (without quotes).
 *
 *
 * Sample Input 1
 *
 * 5
 * 123 146 454 542 456
 * 100 328 248 689 200
 * Sample Output 1
 *
 * No
 */

import java.util.Arrays;
import java.util.Scanner;

public class CureADisease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) arr1[i] = scanner.nextInt();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(res(arr, arr1));

    }

    static String res(int[] arr, int[] arr1) {
        for (int i = 0, j = 0; i < arr.length && j < arr1.length; j++, i++) {
            if (arr1[i] > arr[i]) return "No";
        }
        return "Yes";
    }
}
