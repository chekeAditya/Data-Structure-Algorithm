/**
 *Length & Recursion
 * Description
 *
 * Given a string, S. Find the length of the string using recursion.
 *
 * Note: You are not allowed to use the length built-in property.
 *
 *
 * Input
 * Input Format
 *
 * The single line  consists of string S
 *
 * Constraints
 *
 * 1<= S length <= 200
 *
 *
 * Output
 * Print length of the given string S.
 *
 *
 * Sample Input 1
 *
 * masaischool
 * Sample Output 1
 *
 * 11
 */
package Basic_To_Advanced_DataStructure.Recursion;

import java.util.Scanner;

public class A_LengthAndRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(res(str));
    }

    static int res(String str) {
        if (str.equals(""))
            return 0;
        return res(str.substring(1)) + 1;
    }
}

