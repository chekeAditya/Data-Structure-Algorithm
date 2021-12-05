package Java.G_Loops_II;

import java.util.Scanner;

public class D_Number_In_Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) { //used for the row's

            //space handling
            for (int j = n - 1; j > 1; j--) {
                System.out.print("");
            }

            //used for x's
            for (int k = 1; k <= i; k++) {
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}
