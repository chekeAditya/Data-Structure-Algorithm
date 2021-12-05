package Y_PSC.UNIT_I.DSA_V;

import java.util.Scanner;

public class B_PSC_02_CountConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int k = 0; k < t; k++) {
            int n = scanner.nextInt();
            String S = scanner.next();

            String vowels = "";
            String consonents = "";
            for (int i = 0; i < n; i++) {
                if (S.charAt(i) != 'a' && S.charAt(i) != 'A' &&
                        S.charAt(i) != 'e' && S.charAt(i) != 'E' &&
                        S.charAt(i) != 'i' && S.charAt(i) != 'I' &&
                        S.charAt(i) != 'o' && S.charAt(i) != 'O' &&
                        S.charAt(i) != 'u' && S.charAt(i) != 'U') {
                    consonents += S.charAt(i);
                } else {
                    vowels += S.charAt(i);
                }
            }
            System.out.print(vowels);
            System.out.println(consonents);
        }
    }
}
