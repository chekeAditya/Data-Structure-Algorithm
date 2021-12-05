package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class M_ArrayofZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(res(N, arr));
    }

    static String res(int N, int[] array) {
        for (int i = 0; i < N; i++)
            if (N == 1 && array[i] != 0) return "NO";
            else
                for (int j = i + 1; j < N; j++) {
                    if (array[i] - array[j] == 0) return "YES";
                    else return "NO";
                }
        return "YES";
    }
}
/**
 * Array of Zeroes
 * Description
 *
 * You have an array of non-negative integers. You can perform one operation on it in which you can choose i-th index with 0 <= i < n and subtract 1 from both i-th and (i+1) th index of array.
 *
 * Your task is to write a program that can comment if it is possible to get an array of all zeros after several operations.
 *
 *
 * Input
 * Input Format
 *
 * The first line of test case is a number N. (0 < N <= 10000) The next line is N non-negative integers, 0 <= a_i <= 109
 *
 * Constraints
 *
 * 0 < N <= 10000
 *
 *
 * Output
 * Output Format
 *
 * If it can be modified into all zeros with several operations output “YES” in a single line, otherwise output “NO” instead.
 *
 *
 * Sample Input 1
 *
 * 2
 * 1 2
 * Sample Output 1
 *
 * NO
 * Sample Input 2
 *
 * 2
 * 2 2
 * Sample Output 2
 *
 * YES
 */