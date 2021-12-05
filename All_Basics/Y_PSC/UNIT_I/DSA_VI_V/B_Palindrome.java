package Y_PSC.UNIT_I.DSA_VI_V;

import java.util.Scanner;

class B_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        palindrome(S);
    }

    public static void palindrome(String S) {
        int length = 1;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                int flag = 1;

                for (int k = 0; k < (j - i + 1) / 2; k++) {
                    if (S.charAt(i + k) != S.charAt(j - k)) {
                        flag = 0;
                    }
                }

                if (flag != 0 && (j - i + 1) > length) {
                    int a = 0;
                    a = 0;
                    length = j - i + 1;
                }
            }
        }
        System.out.println(length);
    }
}
/**
 * Link :- https://oj.masaischool.com/contest/1048/problem/3
Masai Palindromic Substring
Description

You are provided a string S. Write a program that returns length of the longest palindromic substring of that string.


Input
Input Format

You are provided with a string

Constraints

Length of string < 100


Output
Output Format

Output one number which is length of the longest substring which is a palindrome


Sample Input 1

thisracecarisgood
Sample Output 1

7
 */