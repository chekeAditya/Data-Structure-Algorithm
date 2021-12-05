package Y_PSC.UNIT_II.DSA_VII;

import java.util.Scanner;

public class DifferenceOfK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            System.out.println(res(n, k, arr));
        }
    }

    static String res(int n, int k, int[] arr) {
        for (int i = 0, j = arr.length - 1; j >= 0 && i < arr.length; j--, i++) {
            if (i != j)
                if (arr[i] - arr[j] == k) return "Yes";
        }
        return "No";
    }
}
/*
2
5 3
1 2 3 4 5
5 8
1 2 3 4 5
 */
