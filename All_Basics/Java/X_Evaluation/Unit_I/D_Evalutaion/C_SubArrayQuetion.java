package Java.X_Evaluation.Unit_I.D_Evalutaion;

import java.util.Scanner;

public class C_SubArrayQuetion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            subArray(N, array);
            T--;
        }
    }

    static void subArray(int N, int[] array) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (array[i] % 2 == 1 && array[j] % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

