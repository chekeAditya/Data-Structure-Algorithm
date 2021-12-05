package Java.X_Evaluation.Unit_I.D_Evalutaion;

import java.util.Scanner;

public class B_SUmOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(sumOfOdd(N,array));
            T--;
        }
    }

    static int sumOfOdd(int N, int[] array) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
