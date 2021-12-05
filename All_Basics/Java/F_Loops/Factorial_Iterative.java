package Java.F_Loops;

import java.util.Scanner;

public class Factorial_Iterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int multiply = 1;
        for (int i=N;i>1;i--){
            multiply *= i;
        }
            System.out.println(multiply);
    }
}
