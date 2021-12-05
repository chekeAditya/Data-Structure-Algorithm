package Java.E_ConditionalOperator;

import java.util.Scanner;

public class G_MasaiEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        if (integer % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
