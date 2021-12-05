package Y_PSC.UNIT_II.DSA_VII;

import java.util.Scanner;

public class XSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int x = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            System.out.println(res(n, k, x, arr));
        }
    }

    static int res(int n, int k, int x, int[] arr) {
        int start = 0, end = x;
        int count = 0, maxCount = 0;
        while (start <= end) {
            if (arr[start] <= k) {
                count++;
            }
            if (count == x) maxCount++;
            start++;
            end++;
        }
        return maxCount;

    }
}
/*
1
5 3 2
1 3 2 5 1
 */