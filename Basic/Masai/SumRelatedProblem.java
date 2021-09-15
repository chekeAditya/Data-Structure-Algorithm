package Basic_To_Advanced_DataStructure.Basic.Masai;

import java.util.Scanner;

/**
 * Sum Related Problem
 * Description
 * <p>
 * You are given a number N, find sum of all even numbers which occur before N (inclusive of N if N is even)
 * <p>
 * <p>
 * Input
 * Input Format
 * <p>
 * First and the only line contains one number N.
 * <p>
 * Constraints
 * <p>
 * N<10000
 * <p>
 * <p>
 * Output
 * Output Format
 * <p>
 * Output one number which is sum (under above condition)
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 8
 * Sample Output 1
 * <p>
 * 20
 */

public class SumRelatedProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(res(n));
    }

    static int res(int n) {
        int sum = 0, a = 0;
        while (a <= n) {
            if (a % 2 == 0) {
                sum += a;
            }
            a++;
        }
        return sum;
    }
}
