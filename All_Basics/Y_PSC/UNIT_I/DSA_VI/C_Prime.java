package Y_PSC.UNIT_I.DSA_VI;

import java.util.Scanner;

public class C_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        primeOrNot(n);

    }

    static void primeOrNot(int n) {
        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && n != 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
