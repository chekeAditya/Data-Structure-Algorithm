package Basic_To_Advanced_DataStructure.Recursion.OJ;

import java.util.Scanner;

public class H_QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int start = 0;
        int last = array.length - 1;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        QuickelySort(array, start, last);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static void QuickelySort(int[] array, int start, int last) {
        if (start < last) {
            int q = partition(array, start, last);
            QuickelySort(array, start, q - 1);
            QuickelySort(array, q + 1, last);

        }
    }

    private static int partition(int[] array, int start, int last) {
        int end = array[last];
        int i = start - 1, j = 0, temp = 0;
        for (j = start; j <= last - 1; j++) {
            if (array[j] <= end) {
                i = i + 1;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        temp = array[i + 1];
        array[i + 1] = end;
        array[last] = temp;

        return i + 1;
    }
}
