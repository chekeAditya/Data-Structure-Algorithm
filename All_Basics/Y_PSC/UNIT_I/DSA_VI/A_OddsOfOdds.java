package Y_PSC.UNIT_I.DSA_VI;

import java.util.Scanner;

public class A_OddsOfOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
//        while (T != 0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0)
                    count++;
            }
            if (count % 2 == 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            T--;
        }
    }
}

