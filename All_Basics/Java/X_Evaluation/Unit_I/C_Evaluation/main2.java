package Java.X_Evaluation.Unit_I.C_Evaluation;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        System.out.println();
        while (T > 0) {
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            loops(T, N, array);
            T--;
        }
    }

    static void loops(int T, int N, int[] array) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (array[i] == array[j]) {
                    array[i] = array[j];
                }
            }
        }
    }
}