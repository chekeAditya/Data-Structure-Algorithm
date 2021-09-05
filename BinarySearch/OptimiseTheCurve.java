package Basic_To_Advanced_DataStructure.BinarySearch;

import java.util.Scanner;

public class OptimiseTheCurve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int K = scanner.nextInt();
            System.out.println(res(0, K - C, A, B, C, K));
        }
    }

    static int res(int low, int high, int a, int b, int c, int k) {
        int x = Integer.MAX_VALUE;
        if (k <= c)
            return 0;
        int h = k - c;
        int l = 0;
        while (l <= h) {
            int m = (l + h) / 2;
            int i = (a * m * m) + (b * m);
            if (i > (k - c)) {
                x = Math.min(x, m);
                h = m - 1;
            } else {
                if (i < (k - c))
                    l = m + 1;
                else
                    return m;
            }
        }
        return x;
    }
}
/*
1
3 2 4 15
 */
