package Z_Rivision;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] s = S.split(" ");
        System.out.println(stringReversal(S, s) );
    }

    static String stringReversal(String S, String[] s) {
        String reverse = "";
        for (int i = s.length - 1; i >= 0; i--) {
            reverse += s[i] + " ";
        }
        return reverse;
    }
}