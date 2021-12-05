package Java.X_Evaluation.Unit_I.C_Evaluation;

import java.util.Scanner;

public class Pr_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 2 * N - 3;
        int b = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k = 1; k <= a; k++) {
                System.out.print(" ");
            }
            if (i < N) {
                System.out.print("/");
            }
            System.out.println();
            a = a - 2;
            b = b + 1;
        }
    }
}
