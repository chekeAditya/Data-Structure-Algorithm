package Basic_To_Advanced_DataStructure.Recursion.OJ;

import java.util.Scanner;

public class G_PerformingMerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int addedSize = 2 * n;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[2 * n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();

        //calling function
        mergeSort(arr1, arr2, arr3);

        //printing array
        for (int i = 0; i < addedSize; i++)
            System.out.print(arr3[i] + " ");
    }

    static void mergeSort(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) arr3[k++] = arr1[i++];
            else arr3[k++] = arr2[j++];
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
    }
}
