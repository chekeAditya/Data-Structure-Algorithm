package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class C_NotPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean prime = isNotPrime(n);
        if (prime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    public static boolean isNotPrime(int n) {
        if (n==1){
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
