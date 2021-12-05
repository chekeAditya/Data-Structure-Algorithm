package Java.X_Evaluation.Unit_I.C_Evaluation;

import java.util.Scanner;

public class Assigment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0) {
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }

            String zero = "";
            String nonZeros = "";
            for (int i = 0; i < N; i++) {
                if (array[i] == 0) {
                    zero += array[i];
                } else {
                    nonZeros += array[i];
                }
            }
            System.out.print(nonZeros + " " + zero);
            T--;
        }
    }
}
