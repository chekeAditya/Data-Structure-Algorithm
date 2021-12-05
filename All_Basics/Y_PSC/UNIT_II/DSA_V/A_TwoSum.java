package Y_PSC.UNIT_II.DSA_V;

import java.util.Scanner;

public class A_TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            int[] a = res(arr,k);
            if (a.length == 2)
                System.out.println(a[0] + " " + a[1]);
            else
                System.out.println("-1" + "-1");
        }
    }

    static int[] res(int[] arr, int k) {
        int count = 0;
        for (int i = 0, j = i + 1; i < arr.length && j < arr.length; i++, j++) {
            if (arr[i] + arr[j] == k)
                return new int[]{i, j};

        }
        return new int[]{};
    }
}
