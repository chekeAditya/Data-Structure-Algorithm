package Java.E_ConditionalOperator;

import java.util.Scanner;

public class B_PrintOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number % 2 ==1)
            System.out.println("Odd number");
    }
}
