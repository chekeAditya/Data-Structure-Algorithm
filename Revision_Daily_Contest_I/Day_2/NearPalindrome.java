package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_2;

/**
 * Near Palindrome Ended
 * Description
 *
 * Given a string s consisting of N lowercase characters, you have to find whether the given string is Near Palindrome or not.
 *
 * Near Palindrome- A string is said to be near palindrome if after performing at most k operations string s will become palindromic.
 *
 * Operation- In one operation you can change any character of the string to any lower case character.
 *
 *
 * Input
 * Input Format
 *
 * First-line contains T, no of test cases.
 *
 * First-line of each test case contains N, the length of the string, and an integer k.
 *
 * Second-line of each test case contains string s of length N.
 *
 * Constraints
 *
 * 1 <= T <= 10
 *
 * 1 <= N <= 10^5
 *
 * 1 <= k <= 10^5
 *
 *
 * Output
 * For each test case you have to print "True" (without quotes) if the string can be near palindrome otherwise print "False" (without quotes) in a new line.
 *
 *
 * Sample Input 1
 *
 * 2
 * 5 1
 * abdca
 * 6 2
 * abcdef
 * Sample Output 1
 *
 * True
 * False
 * Hint
 *
 * For the first test case changing character b to c can make it near palindrome in one operation which is equal to k therefore answer is True.
 *
 * For the second test case changing character a to f, b to e and c to d make it near palindrome in three operations which is greater than k therefore answer is False.
 */

import java.util.Scanner;

public class NearPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.next();
//            System.out.println(res(n, k, str));
            System.out.println(res1(n, k, str));
        }
    }



    static String res1(int n, int k, String str) {
        int start = 0, end = str.length() - 1, count = 0;
        while (start < str.length() / 2) {

            if (str.charAt(start) != str.charAt(end) && start != end) {
                count++;
            }
            start++;
            end--;
        }
        if (count <= k)
            return "True";
        else
            return "False";
    }
}

/*
 static String res(int n, int k, String str) {
        int count = 0;
        for (int start = 0, end = str.length() - 1; start < str.length() / 2; start++, end--) {
            if (str.charAt(start) != str.charAt(end) && start != end) {
                count++;
            }
        }
        if (count <= k)
            return "True";
        else
            return "False";
    }
 */
