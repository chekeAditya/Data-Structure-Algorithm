package Java.X_Evaluation.Unit_I.A_Evalutaion;

import java.util.Scanner;

public class E_MissedPerfectScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int totalMarks = 450;
        int missed = totalMarks -  (A + B + C) ;
        System.out.println(missed);
    }
}
