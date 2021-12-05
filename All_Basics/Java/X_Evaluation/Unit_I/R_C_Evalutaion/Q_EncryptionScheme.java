package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class Q_EncryptionScheme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(encryptionNumber(n, array));
        System.out.println(encryptionNumberTwo(n,array));
    }

    static int encryptionNumber(int n, int[] array) {
        int sum = 0;
        for (int i = 0, j = 1; i < n; i++, j++) {
            if (array[i] != 0) {
                sum += j;
            }
        }
        return sum;
    }

    static int encryptionNumberTwo(int n, int[] array) {
        int sum = 0;
        for (int i = 0, j = 1; i < n; i++, j++) {
            if (array[i] == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
/*
0 1 1 1 1 -> 2 3 4 5 => 14
 */
