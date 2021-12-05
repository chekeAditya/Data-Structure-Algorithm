package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class G_RotateBy90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        rotateBy90(N,array);
    }

    static void rotateBy90(int N, int[][] array) {
        for (int j = N - 1; j >= 0; j--) {
            for (int i = 0; i < N; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
