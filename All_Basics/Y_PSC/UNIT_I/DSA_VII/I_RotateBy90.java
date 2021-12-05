package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class I_RotateBy90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            int N = scanner.nextInt();
            int[][] array = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            rotateBy90(N, array);
            T--;
        }
    }

    static void rotateBy90(int N, int[][] array) {
        for (int j = 0; j < N; j++) {
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
