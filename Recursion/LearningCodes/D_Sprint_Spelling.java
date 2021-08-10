/**
 * i/p -> 12 -> o/p -> One Two
 * i/p -> 23 -> o/p -> Two Three
 * i/p -> 431 -> o/p -> Four Three One
 * you had to print output using recursion
 */

package Basic_To_Advanced_DataStructure.Recursion.LearningCodes;

import java.util.Scanner;

public class D_Sprint_Spelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int n = scanner.nextInt();
        res(n, str);
    }

    static void res(int n, String[] str) {
        if (n == 0) {
            return;
        } else {
            res(n / 10, str);
            System.out.print(str[n % 10] + " ");
        }
    }
}
