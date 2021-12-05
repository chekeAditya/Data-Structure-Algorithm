package Y_PSC.UNIT_I.DSA_VI_V;

import java.util.Scanner;

public class E_MasaiPalindromeSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] n = name.split("");
        longestPalindrome(name, n);
    }

    static void longestPalindrome(String name, String[] n) {
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                String str = "";
                for (int k = i; k < j; k++) {
                    str = str + n[k];
                }
                System.out.println(str);
                if (check_palindrome(name)) {
                }
            }
        }
    }

    static boolean check_palindrome(String name) {
        int length = 1;
        for (int i = 0; i < name.length(); i++) {
            for (int j = i; j < name.length(); j++) {
                int flag = 1;

                for (int k = 0; k < (j - i + 1) / 2; k++) {
                    if (name.charAt(i + k) != name.charAt(j - k)) {
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
        return true;
    }
}
