package Y_PSC.UNIT_II.DSA_VI;

import java.util.Scanner;

public class RotateTheArrayReturnBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            res(n, k, arr);
        }
    }

    static void res(int n, int k, int[] arr) {
        k = k % n;
        for (int i = 0; i < n; i++) {
            if (i < k) System.out.print(arr[n + i - k] + " ");
            else System.out.print(arr[i - k] + " ");
        }
        System.out.println();
    }
}
