//Split in Half
package Java.X_Evaluation.Unit_I.B_Evaluation;

import java.util.Scanner;

public class
Pr_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();

        if (A > B) {
            K = K-B;
            K = K - A;
            if (K % 2 == 0) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        } else if (B > A) {
            K = K - A;
            if (K % 2 == 0) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
