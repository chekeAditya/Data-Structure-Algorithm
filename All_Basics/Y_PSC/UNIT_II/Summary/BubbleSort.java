package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        res(n, arr);
    }

    static void res(int n, int[] arr) {
        int swap_count = 0;
        n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            swap_count = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) swap(arr, j, j );
                swap_count++;
            }
            if (swap_count == 0) break;
        }
        printArray(arr);
    }

    static int swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[j];
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