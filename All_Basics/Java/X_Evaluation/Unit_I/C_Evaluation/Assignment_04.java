package Java.X_Evaluation.Unit_I.C_Evaluation;

import java.util.Scanner;

public class Assignment_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int r = scanner.nextInt();
        while (r > 0) {
            int n = scanner.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            for (int i = 0; i < n - 2; i++) {
                if (array[i] % 2 == 1 && array[i + 1] % 2 == 1 && array[i + 2] % 2 == 1) {
                    a = 1;
                    break;
                }
            }
            if (a == 1) {
                System.out.println("Misbehave!");
            } else {
                System.out.println("Behave!");
            }
            a = 0;
            r--;
        }
    }
}
