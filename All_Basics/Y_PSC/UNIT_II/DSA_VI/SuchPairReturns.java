package Y_PSC.UNIT_II.DSA_VI;

import java.util.Scanner;

public class SuchPairReturns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            System.out.println(res(k, arr));
        }
    }

    static int res(int k, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (arr[start] < arr[end]) {
            if (arr[start] + arr[end] % 2 == 0) {

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == k)
                    return 1;
        }
        return -1;
    }
}
