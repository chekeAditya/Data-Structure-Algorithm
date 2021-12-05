package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class DetectPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println(res(number));
    }

    static String res(String number) {
        int i = 0, j = number.length() - 1;
        while (j < number.length()) {
            if (number.charAt(i) != number.charAt(j)) return "No";
            i++;
            j++;
        }
        return "Yes";
    }
}
