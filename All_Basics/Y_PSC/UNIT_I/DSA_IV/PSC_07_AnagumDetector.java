package Y_PSC.UNIT_I.DSA_IV;

import java.util.Arrays;
import java.util.Scanner;

public class PSC_07_AnagumDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phase1 = scanner.nextLine();

        char[] ch = new char[phase1.length()];
        for (int i = 0; i < phase1.length(); i++) {
            ch[i] = phase1.charAt(i);
        }
        char[] charArray = phase1.toCharArray();
        Arrays.sort(charArray);
        System.out.print(phase1);

        char phase4 = ' ';
        char phase5 = ' ';
        for (int i = 0; i < phase1.length(); i++) {
            if (phase1.length() == phase1.length()) {
                phase4 = phase1.charAt(i);
            }
        }
    }
}
/*
1. iterate char from each and every line
2. compare is that char present or not
 */
