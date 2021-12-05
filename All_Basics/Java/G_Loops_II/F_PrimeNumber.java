package Java.G_Loops_II;

import java.util.Scanner;

public class F_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        String prime = "";

        for (int i = l; i <= r; i++) {
            int tempNumber = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    tempNumber += 1;
                }
            }
            if (tempNumber == 2) {
                prime = prime + i + " ";
            }
        }
        System.out.println(prime);
    }
}