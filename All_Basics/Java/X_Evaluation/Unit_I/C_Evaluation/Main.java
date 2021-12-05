package Java.X_Evaluation.Unit_I.C_Evaluation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        System.out.println();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            loopInArray(N,array);
        }
    }

    static void loopInArray(int N, int[] array) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (N % 2 == 0) {
                    System.out.println("Loop");
                    return;
                } else {
                    System.out.println("No Loop");
                    return;
                }
            }
        }
    }
}
