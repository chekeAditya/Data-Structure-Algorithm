package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class SuchPairsReturns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            System.out.println(res(n, arr, k));
        }
    }

    static int res(int n, int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) return 1;
            }
        }
        return -1;
    }
}
