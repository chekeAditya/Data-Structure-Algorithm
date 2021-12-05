package Algorithm_Sorting;

import java.util.Scanner;

public class C_NewSortingAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        res(n, k, arr);
    }

    static void res(int n, int k, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] % k < arr[j + 1] % k) {
                }
                    swap(arr, i);
            }
        }
        printArray(arr);
    }

    static int swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        return temp;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
/*
5 6
12 18 17 65 46
 */
