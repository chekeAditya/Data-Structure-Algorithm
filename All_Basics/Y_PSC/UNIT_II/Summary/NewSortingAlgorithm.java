package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class NewSortingAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        res(arr, n, k);
    }

    static void res(int[] arr, int n, int k) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] % k > arr[j + 1] % k) swap(arr, i, j);
        }
        printArray(arr);
    }

    static int swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        return temp;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}