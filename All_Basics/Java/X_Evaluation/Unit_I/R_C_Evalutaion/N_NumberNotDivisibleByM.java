package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class N_NumberNotDivisibleByM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            isNotDivisibleBy3(n,m,array);
            T--;
        }
    }

    static void isNotDivisibleBy3(int n, int m, int[] array) {
        for (int i = 0; i < n; i++) {
            if (array[i] % m != 0) {
                array[i] = -1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
