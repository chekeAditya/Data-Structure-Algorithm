package Basic_To_Advanced_DataStructure.Final450.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) ar[i] = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(kthSmallest(ar, 0, n - 1, k));
        }

    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(arr);
        int number = 0;
        for (int i = l; i <= r; i++) {
            if (i == k - 1) number = arr[i];
        }
        return number;
    }
}
