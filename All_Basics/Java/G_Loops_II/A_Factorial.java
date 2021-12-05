package Java.G_Loops_II;

import java.util.Scanner;

public class A_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int factorial = 1;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
            System.out.println(factorial);
    }
}

