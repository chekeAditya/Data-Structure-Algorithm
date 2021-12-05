package Y_PSC.UNIT_II.DSA_V;

import java.util.Scanner;

public class C_DetectPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(res(str));
    }

    static String res(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (rev.equals(str))
            return "Yes";
        return "No";
    }
}
