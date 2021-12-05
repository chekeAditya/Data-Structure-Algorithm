package Java.X_Evaluation.Unit_I.C_Evaluation;

import java.util.Scanner;

public class Assignment_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0) {
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0 + i; j <= N; j++) {
                    if (array[i] == array[j]) {
                        System.out.println("Loop");
                    } else {
                        System.out.println("No Loop");
                    }
                    return;
                }
            }
            T--;
        }
    }
}
