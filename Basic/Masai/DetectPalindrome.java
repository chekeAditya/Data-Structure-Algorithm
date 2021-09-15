package Basic_To_Advanced_DataStructure.Basic.Masai;

/**
 * Detect Palindrome -12398:6:46
 * Description
 *
 * Given an integer, print "Yes" (without quotes) if that integer is aPalindrome, else print "No" (without quotes)
 *
 * You must not use the reverse() function. Using that would lead to disqualification
 *
 *
 * Input
 * Input Format
 *
 * You are provided with one integer.
 *
 * Constraints
 *
 * The provided integer is always lesser than 1000000
 *
 *
 * Output
 * Print Yes or No depending upon the integer.
 *
 *
 * Sample Input 1
 *
 * 1221
 * Sample Output 1
 *
 * Yes
 * Hint
 *
 * Sample 1 Explanation
 *
 * Reading 1221 from either side is same, so Yes, it is a palindrome.
 */

import java.util.Scanner;

public class DetectPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println(res(n));
    }

    static String res(String n) {
        String number = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            number += n.charAt(i);
        }
            if (n.equals(number)) return "Yes";
            else return "No";
    }
}
