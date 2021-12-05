package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class G_RemoveEvenNumber {
    public static void main(String[] args) {
        removeEven();
    }

    public static void removeEven() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }
}
