package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_5;

import java.util.Scanner;

public class SumOfSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int k = scanner.nextInt();
        if (res(n, arr, k))
            System.out.println("yes");
        else
            System.out.println("no");
    }

    static boolean res(int n, int[] arr, int sum) {
        boolean[][] array = new boolean[sum + 1][n + 1];
        for (int i = 0; i <= n; i++)
            array[0][i] = true;
        for (int i = 1; i <= sum; i++)
            array[i][0] = false;
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                array[i][j] = array[i][j - 1];
                if (i >= arr[j - 1]) {
                    array[i][j] = array[i][j] || array[i - arr[j - 1]][j - 1];

                }
            }
        }
        return array[sum][n];
    }
}
/*
9
1 2 3 4 5 6 7 8 9
5
 */
