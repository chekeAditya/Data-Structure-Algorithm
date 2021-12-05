package Y_PSC.UNIT_II.DSA_VI;

import java.util.Scanner;

public class SubarrayAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        System.out.println(res(n, k, arr));
    }

    static int res(int n, int k, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}
