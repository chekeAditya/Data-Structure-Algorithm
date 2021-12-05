package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class H_GreaterThanSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            covertSmallest(N, array);
            T--;
        }
    }

    static void covertSmallest(int N, int[] array) {
        int smallest = array[0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (array[j] < smallest) {
                    smallest = array[j];
                }
            }
            if (array[i] != smallest) {
                array[i] = -1;
            }
//            System.out.print(array[i] + " ");
        }
        System.out.println(smallest);
    }
}
