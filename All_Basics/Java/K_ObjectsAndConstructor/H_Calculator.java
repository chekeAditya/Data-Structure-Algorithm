package Java.K_ObjectsAndConstructor;

import java.util.Scanner;

public class H_Calculator {
    int a;
    int b;

    public H_Calculator() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        H_Calculator calculator = new H_Calculator();
        System.out.printf("Enter your choice \n" + "1.Add \n" + "2.Subtract \n" + "3.Divide \n" + "4.Multiply \n");


        for (int i = 0; i < 4; i++) { // 4
            int choice = scanner.nextInt();
            if (choice == 1) {
                calculator.add();
            } else if (choice == 2) {
                calculator.subtract();
            } else if (choice == 3) {
                calculator.divide();
            } else if (choice == 4) {
                calculator.multiply();
            }
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public void add() {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public void subtract() {
        int subtract = a - b;
        System.out.println("The subtract of " + a + " and " + b + " is " + subtract);
    }

    public void divide() {
        int divide = a / b;
        System.out.println("The divide of " + a + " and " + b + " is " + divide);
    }

    public void multiply() {
        int multiply = a * b;
        System.out.println("The multiply of " + a + " and " + b + " is " + multiply);
    }
}
