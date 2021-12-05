package Java.E_ConditionalOperator;

import java.util.Scanner;

public class A_Smaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A>B)
            System.out.println("B is Smaller");
        else
            System.out.println("A is Smaller");
    }
}
