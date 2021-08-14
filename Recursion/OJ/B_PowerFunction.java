/**
 * Power Function - Recursive
 * Description
 *
 * Given two integers a and b, we need to find the value of a^b recursively.
 *
 * Expected Time Complexity - O(logb).
 *
 *
 * Input
 * The first line of the input contains two integers a and b (1 ≤ a ≤ 10) and (0 ≤ b ≤ 9).
 *
 *
 * Output
 * For each test case, print the answer: The value of a^b.
 *
 *
 * Sample Input 1
 *
 * 2 4
 * Sample Output 1
 *
 * 16
 */

package Basic_To_Advanced_DataStructure.Recursion.OJ;

import java.util.Scanner;

public class B_PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(res(n, m));
    }

    static int res(int n, int m) {
        if (m == 0) {
            return 1;
        } else {
            return (int) (Math.pow(n, m));
        }
    }
}
/*
n =2 m = 4
2 + 2 + 2 +2

2*1
2*2

 */
