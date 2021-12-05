package Y_PSC.UNIT_I.DSA_V;

import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != 'a' && S.charAt(i) != 'A' &&
                    S.charAt(i) != 'e' && S.charAt(i) != 'E' &&
                    S.charAt(i) != 'i' && S.charAt(i) != 'I' &&
                    S.charAt(i) != 'o' && S.charAt(i) != 'O' &&
                    S.charAt(i) != 'u' && S.charAt(i) != 'U' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
