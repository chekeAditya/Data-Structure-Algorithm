package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_2;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = scanner.nextInt();
        }
        res(A, 0, n - 1);
        for (int j : A) {
            System.out.print(j + " ");
        }
    }

    public static void res(int[] A, int start, int end) {
        if (start < end) {
            int count = res1(A, start, end);
            res(A, start, count - 1);
            res(A, count + 1, end);
        }
    }

    public static int res1(int[] A, int start, int end) {
        int count = A[end];
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++) {
            if (A[j] > count) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i+1];
        A[i+1] = A[end];
        A[end] = temp;
        return (i + 1);
    }
}
