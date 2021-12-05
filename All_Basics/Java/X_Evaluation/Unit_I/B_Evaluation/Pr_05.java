//Pattern Printing I
package Java.X_Evaluation.Unit_I.B_Evaluation;

import java.util.Scanner;

public class Pr_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N ||j==1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
