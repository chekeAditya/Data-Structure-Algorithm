package Java.X_Evaluation.Unit_I.A_Evalutaion;

import java.util.Scanner;

public class F_FindRunnsNeedOnLastOver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int n6 = scanner.nextInt();
        int firstOverRun = N - (n1 + n2 + n3 + n4+ n5+ n6);
        System.out.println(firstOverRun);
    }
}
