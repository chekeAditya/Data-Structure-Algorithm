package Java.G_Loops_II;

import java.util.Scanner;

public class K_Square_Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i % 2 == 1) {
                    System.out.print(i * j + " ");
                } else if (i % 2 == 0) {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }
}
