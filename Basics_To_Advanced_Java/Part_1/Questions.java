package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_1;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
        System.out.println(checkArmStrongNumber(n));


        // It will print all the armstrong number
        for (int i = 100; i < 1000; i++) {
            if (checkArmStrongNumber(i)) {
                System.out.println(i + " ");
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        int c = 2;
        while (c * c <= n) {
            if (n % 2 == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    /**
     * print all the 3 digit armstrong numbers -> take every digit -> cube of it -> and it's sum should be equal to the number
     * e.g 153 -> 1^3 + 5^3 + 3^3 -> 1 + 125 + 27 -> 153
     */

    private static boolean checkArmStrongNumber(int n) {
        int rem, sum = 0, original = n;
        while (n > 0) {
            rem = n % 10; // 3
            n = n / 10; //
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }

}
