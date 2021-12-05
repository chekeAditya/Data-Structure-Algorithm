package Java.G_Loops_II;

import java.util.Scanner;

public class B_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) { //used for the row's

            //space handling
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }

            //used for x's
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
