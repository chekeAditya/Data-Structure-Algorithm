package Basic_To_Advanced_DataStructure.Final450.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(isPalindromeUsing2Pointer(str));
    }

    static int isPalindrome(String S) {
        StringBuilder n = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--) {
            n.append(S.charAt(i));
        }
        if (S.equals(n.toString())) return 1;
        else return 0;
    }

    static int isPalindromeUsing2Pointer(String S) {
        int start = 0, end = S.length() - 1;
        while (start < end) {
            if (S.charAt(start) == S.charAt(end)){
                start++;
                end--;
            }else
                return 0;
        }
        return 1;
    }
}

/*
abba
 */
