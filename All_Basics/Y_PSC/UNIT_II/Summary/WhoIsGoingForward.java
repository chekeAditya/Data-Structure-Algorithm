package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class WhoIsGoingForward {
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
        for (int i = k; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] <= arr[j]) count = i;
                else count = j;
        return count;
    }
}
