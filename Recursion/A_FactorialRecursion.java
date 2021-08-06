/**
 * Description
 *
 * The factorial of a positive integer N is the product of all positive integers less than or equal to n:
 *
 * Given a number N your task is to write a program that calculates factorial of N
 *
 *
 * Input
 * Input Format
 *
 * First and the only line contains N
 *
 *
 *
 * Constraints
 *
 * N<15
 *
 *
 * Output
 * Output the factorial value of N
 *
 *
 * Sample Input 1
 *
 * 5
 * Sample Output 1
 *
 * 120
 * Hint
 *
 * Sample Explanation
 *
 * Factorial of 5 = 5*4*3*2*1 = 120
 */

package Basic_To_Advanced_DataStructure.Recursion;

import java.util.Scanner;

public class A_FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(res(n));
    }

    static int res(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * (res(n - 1));
        }
    }
}
