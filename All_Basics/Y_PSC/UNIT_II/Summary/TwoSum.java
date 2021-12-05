package Y_PSC.UNIT_II.Summary;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            int[] indices = res(n, arr, k);
            if (indices.length == 2) System.out.println(indices[0] + " " + indices[1]);
            else System.out.println("-1" + " " + "-1");
        }
    }

    static int[] res(int n, int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == k)
                    return new int[]{i, j};
        }
        return new int[]{};
    }
}
