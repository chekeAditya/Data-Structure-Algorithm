/**
 * 0,1,1,2,3,5,8,13,...
 * By observing :- Nth element is the sum of previous two element i.e (n-1)th and (n-2)th
 * term_n = term(n-1) + term(n-2)
 * for 0th and 1st element return n only
 *
 * Question :- find fib(5) :- here n = 5
 */
package Basic_To_Advanced_DataStructure.Recursion.LearningCodes;

import java.util.Scanner;

public class C_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(res(n));
    }

    static int res(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return res(n - 1) + res(n - 2);
        }
    }
}
