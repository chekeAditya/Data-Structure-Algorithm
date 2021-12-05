package Java.X_Evaluation.Unit_I.C_Evaluation;

import java.util.Scanner;

public class Pr_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); //testcase
        for (int j = 0; j < T; j++) {
        int N = scanner.nextInt(); //size of array
        int M = scanner.nextInt();//divisible by this
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println();
            notDivisibleByM(T, N, M, array);
        }
    }

    static void notDivisibleByM(int T, int N, int M, int[] array) {
        for (int i = 0; i < N; i++) {
            if (array[i] % M != 0) {
                array[i] = -1;
            }
            System.out.print(array[i] + " ");
        }
    }
}
