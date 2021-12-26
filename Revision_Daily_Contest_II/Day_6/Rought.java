package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_6;

import java.util.Scanner;

public class Rought {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextLong();
        System.out.println(solve(n,arr));
    }

    public static long solve(int N, long[] A) {
        int k = 0;
        long temp = A[0];
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] >= temp) {
                k = i + 1;
                temp = A[i];
            }
        }
        return k;
    }
}
