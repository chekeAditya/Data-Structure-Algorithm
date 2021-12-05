package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class I_LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            largestElement(n, array);
            T--;
        }
    }

    static void largestElement(int n, int[] array) {
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = -1;
                System.out.println(array[i]);
            }
        }
    }
}
/*
1 3 2
 */
