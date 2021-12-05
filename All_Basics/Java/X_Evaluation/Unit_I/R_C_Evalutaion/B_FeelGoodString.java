package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class B_FeelGoodString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();

        String vowels = "";
        int l = N/2;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a' || S.charAt(i) == 'A' ||
                    S.charAt(i) == 'e' || S.charAt(i) == 'E' ||
                    S.charAt(i) == 'i' || S.charAt(i) == 'I' ||
                    S.charAt(i) == 'o' || S.charAt(i) == 'O' ||
                    S.charAt(i) == 'u' || S.charAt(i) == 'U') {
                vowels += S.charAt(i);
            }
        }

        if (vowels.length() >= N || vowels.length() == l) {
            System.out.println("Feel good!");
        } else {
            System.out.println("Feel bad!");
        }
    }
}
/*
if(vowels >= N || vowels == N/2)
 */
