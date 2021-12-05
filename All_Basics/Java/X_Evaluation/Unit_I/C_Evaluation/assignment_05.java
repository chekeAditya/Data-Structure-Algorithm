package Java.X_Evaluation.Unit_I.C_Evaluation;

import java.util.Scanner;

public class assignment_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(between(N,M));

    }

    static int between(int N, int M) {
        if (N == 0) {
            return M;
        }
        if (M == 0) {
            return N;
        }
        if (N == M) {
            return N;
        }

        if (N > M) {
            return between(N - M, M);
        }
        return between(N, M - N);
    }
}
