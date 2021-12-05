//Find & Solve
package Java.X_Evaluation.Unit_I.B_Evaluation;

import java.util.Scanner;

public class Pr_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        //we can also write Y as
        int Y = 2 * X - K;
        int J = 2 * X + 3 * Y + 2;
        System.out.println(J);
    }
}
