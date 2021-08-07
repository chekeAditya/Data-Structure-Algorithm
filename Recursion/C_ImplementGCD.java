/**
 * Implement GCD
 * Description
 *
 * Implement the GCD Function using recursion. Given two integers a and b, find the greatest common divisor of a and b.
 *
 * The approach which uses logarithmic time complexity is expected here.
 *
 *
 * Input
 * The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.
 *
 * The first line of each test case contains two integers a and b (1 ≤ a, b ≤ 1000000000).
 *
 *
 * Output
 * For each test case, print the answer: GCD of the two numbers.
 *
 *
 * Sample Input 1
 *
 * 2
 * 6 9
 * 2 25
 * Sample Output 1
 *
 * 3
 * 1
 */
package Basic_To_Advanced_DataStructure.Recursion;

import java.util.Scanner;

public class C_ImplementGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(res(n, m));
        }
    }

    static int res(int n, int m) {
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        if (n == m) {
            return n;
        }
        if (n > m) {
            return res(n - m, m);
        } else return res(n, m - n);
    }
}
