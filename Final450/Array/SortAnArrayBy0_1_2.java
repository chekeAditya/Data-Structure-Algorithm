package Basic_To_Advanced_DataStructure.Final450.Array;

import java.util.Scanner;

public class SortAnArrayBy0_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        sort012(arr, n);
    }

    public static void sort012(int[] arr, int n) {
        int l = 0, h = arr.length - 1, m = 0;
        while (m <= h) {
            switch (arr[m]) {
                case 0:
                    int temp = arr[l];
                    arr[l] = arr[m];
                    arr[m] = temp;
                    l++;
                    m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    temp = arr[m];
                    arr[m] = arr[h];
                    arr[h] = temp;
                    h--;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
