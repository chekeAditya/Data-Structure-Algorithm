package Java.X_Evaluation.Unit_I.B_Evaluation;

import java.util.Scanner;

public class Pr_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            String s = scanner.next();
//            String[] array = s.split("");

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
