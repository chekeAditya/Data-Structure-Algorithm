/**
 * Description
 *
 * In mathematics, the Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is
 *
 * F (0) = 0 , F (1) = 1
 *
 * and
 *
 * F (n) = F (n − 1) + F (n − 2) ,
 *
 * for n > 1.
 *
 * Your task is to write a program that calculates n-th fibonacci numbers when you are provided with n
 *
 *
 * Input
 * Input Format
 *
 * First line of input contains n
 *
 * Constraints
 *
 * n<35
 *
 *
 * Output
 * Output Format
 *
 * Output the n-th fibonacci number
 *
 *
 * Sample Input 1
 *
 * 4
 * Sample Output 1
 *
 * 3
 */

package Basic_To_Advanced_DataStructure.Recursion.OJ;

import java.util.Scanner;

public class A_FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(res(n));
    }

    static int res(int n) {
        if (n <= 1) {
            return n;
        } else {
            return res(n - 1) + res(n - 2);
        }
    }
}
