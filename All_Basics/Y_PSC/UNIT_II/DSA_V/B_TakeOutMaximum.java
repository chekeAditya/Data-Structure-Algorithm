package Y_PSC.UNIT_II.DSA_V;

import java.util.Scanner;

public class B_TakeOutMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        System.out.println(res(n, arr, k));
    }

    static int res(int n, int[] arr, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= arr.length; j++) {
                if (sum < maxSum) {
                    maxSum = sum;
                }
                sum = 0;
                if (i == k) {
                    for (int a = i; a <= i; a++) {
                        sum += arr[k];
                    }
                }
            }
        }
        return maxSum;
    }
}
