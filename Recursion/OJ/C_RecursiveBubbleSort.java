package Basic_To_Advanced_DataStructure.Recursion.OJ;

import java.util.Arrays;
import java.util.Scanner;

public class C_RecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        res(n, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void res(int n, int[] arr) {
        int temp;
        if (n == 1) return;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            res(n - 1, arr);
        }
    }
}
