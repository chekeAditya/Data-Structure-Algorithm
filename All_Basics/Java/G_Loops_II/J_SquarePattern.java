package Java.G_Loops_II;

import java.util.Scanner;

public class J_SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print("*" + " ");
                else if (i == n - 1)
                    System.out.print("*" + " ");
                else if (j == 0)
                    System.out.print("*" + " ");
                else if (j == n - 1)
                    System.out.print("*" + " ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
