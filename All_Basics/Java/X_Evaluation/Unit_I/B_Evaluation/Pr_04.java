//Pythagoras Theorem
package Java.X_Evaluation.Unit_I.B_Evaluation;

import java.util.Scanner;

public class Pr_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int b = scanner.nextInt();
        int h = (int) (Math.pow(p,2) + Math.pow(b,2));
        System.out.println(h);
    }
}
