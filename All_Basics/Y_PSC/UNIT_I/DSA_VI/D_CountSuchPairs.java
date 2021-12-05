package Y_PSC.UNIT_I.DSA_VI;

import java.util.Scanner;

public class D_CountSuchPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int trgt = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        countSuchPairs(n, trgt, array);
    }

    static void countSuchPairs(int n, int trgt, int[] array) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == trgt) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
