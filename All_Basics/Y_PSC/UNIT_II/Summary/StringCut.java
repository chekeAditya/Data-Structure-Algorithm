package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(res(str));
    }

    static String res(String str) {
        String newStr = "";
        String newStr2 = "";
        String strSum = "";
        for (int i = str.length() / 2 - 1, j = str.length() - 1; i >= 0 && j >= str.length() / 2; i--, j--) {
            newStr += str.charAt(i);
            newStr2 += str.charAt(j);
        }
        strSum = newStr.concat(newStr2);
        return strSum;
    }
}
