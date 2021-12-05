package Java.Z_CWD_Basic_To_Advanced;

import java.util.Scanner;

public class L_LoopsProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        pattern(n);
//        sumOfEvenNumber(n);
//        sumUSingForLoop(n);
//        multiplicationTable(n);
//        factorial(n);
//        factorialUsingWhileLoop(n);
//        patternUsingWhile(n);
        sumOfMultiplicationOf8Table(n);
    }

    //Question 1
    public static void pattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Question 2
    public static void sumOfEvenNumber(int n) {
        int sum = 0;
        int a = 0;
        while (a <= n) {
            if (a % 2 == 0) {
                sum += a;
            }
            a++;
        }
        System.out.println(sum);
    }

    public static void sumUSingForLoop(int n) {
        int add = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                add += i;
            }
        }
        System.out.println(add);
    }

    //Question 3
    public static void multiplicationTable(int n) {
        for (int i = 1; i <=     10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    //Question 4
    public static void factorial(int n) {     //factorial of 5 :- 5*4*3*2*1 = 120
        int factor = 1;
        for (int i = n; i > 0; i--) {
            factor *= i;
        }
        System.out.println(factor);
    }

    //Question 5
    public static void factorialUsingWhileLoop(int n) {
        int i = 1;
        int factors = 1;
        while (i <= n) {
            factors = factors * i;
            i++;
        }
        System.out.println(factors);
    }

    //Question 6
    public static void patternUsingWhile(int n) {
        // i = rows , j = column
        int i = 1;
        int j = 1;
        while (i < n) {
            System.out.print("* ");
            i++;
        }
        System.out.println();
    }

    //Question 7
    public static void sumOfMultiplicationOf8Table(int n) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int multiply = n * i;
            System.out.printf("%d X %d = %d \n", n, i, multiply);
            sum += multiply;
        }
        System.out.println("Now the sum is : " + sum);
    }
}