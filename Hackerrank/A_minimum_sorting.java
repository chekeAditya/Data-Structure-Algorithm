package Basic_To_Advanced_DataStructure.Hackerrank;

import java.util.Scanner;

public class A_minimum_sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for (int i = 0; i < n; i++) A[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) B[i] = scanner.nextInt();
            System.out.println(res(n, A, B));
        }
    }

    static int res(int n, int[] A, int[] B) {
        int end = n - 1;
        if (checkSorted(A, end) == 0) {
            return 0;
        } else {
            doOperation(A, B, n, end);
        }
        return -1;
    }

    //checking sorted or not
    static int checkSorted(int[] A, int end) {
        for (int i = 0; i < A.length; i++) {
            if (i == end || A[i] < A[i + 1]) {
                if (A[end] < A[end - 1]) {
                    return -1;
                }
            }
        }
        return 0;
    }

    static void doOperation(int[] A, int[] B, int n, int end) {
        for (int i = 0; i < A.length; i++) {
            if (i <= 1 && i < n) {
//  swap A[i] & B[i+1]
                int temp = A[i];
                A[i] = B[i + 1];
                B[i + 1] = temp;
//  swap A[i+1] & B[i]
                int temp1 = A[i + 1];
                A[i + 1] = B[i];
                B[i] = temp;
            }
            res(n, A, B);
        }
    }
}
