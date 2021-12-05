//Pattern of N
package Java.X_Evaluation.Unit_I.B_Evaluation;

import java.util.Scanner;

public class Pr_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int p = 1;
        for (int i = 1; i <= N; i++, p++) {
            for (int j = 1, k = 3, l = 6, m = 9; j <= N; j++, k--, l -= 2, m -= 3) {
                if (i == 1) {
                    System.out.print(i * j + " ");
                }
                if (i == 2) {
                    System.out.print(i * j + k + " ");
                }
                if (i == 3) {
                    System.out.print(i * j + l + " ");
                }
                if (i == 4) {
                    System.out.print(i * j + m + " ");
                }
            }
            System.out.println();
        }
    }
}
