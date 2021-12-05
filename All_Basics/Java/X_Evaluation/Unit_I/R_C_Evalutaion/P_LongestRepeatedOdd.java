package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class P_LongestRepeatedOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        longestRepeatedOdd(N, A);
    }

    static void longestRepeatedOdd(int N, int[] A) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (count > res) {
                res = count;
            }
            count = 0;
            for (int j = 0; j < N; j++) {
                if (A[j] % 2 == 1 && A[j] == A[i]) {
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
