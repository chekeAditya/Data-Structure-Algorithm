/**
 * Binary Equivalent - Recursive
 * Description
 *
 * Given an integer n, you need to find out its binary representation using recursion.
 *
 * Here multiple test cases exist and the expected time complexity is - O(t*logn) where is t is the number of test cases.
 *
 *
 * Input
 * The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.
 *
 * The first line of each test case contains a single integer n (1 ≤ n ≤ 100000) — the number.
 *
 *
 * Output
 * For each test case, print the answer: The binary representation of the integer.
 *
 *
 * Sample Input 1
 *
 * 2
 * 15
 * 128
 * Sample Output 1
 *
 * 1111
 * 10000000
 */
package Basic_To_Advanced_DataStructure.Recursion.OJ;

import java.util.Scanner;

public class B_BinaryEquivalentRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            res(n);
        }
        System.out.println();
    }

    static void res(int n) {
        if (n == 0) {
            return;
        } else {
            res(n / 2);
            System.out.print(n % 2);
        }
    }
}
