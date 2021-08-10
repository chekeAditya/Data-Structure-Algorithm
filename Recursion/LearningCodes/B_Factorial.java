/**
 * find factorial of the given number using recursion
 */

package Basic_To_Advanced_DataStructure.Recursion.LearningCodes;

import java.util.Scanner;

public class B_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(res(n));
    }

    static int res(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * res(n - 1);
        }
    }
}
