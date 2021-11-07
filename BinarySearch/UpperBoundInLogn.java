package Basic_To_Advanced_DataStructure.BinarySearch;

import java.util.Scanner;

public class UpperBoundInLogn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(upperBound(arr, n, k, 0, n));
    }

    static int upperBound(int[] arr, int N, int k, int low, int high) {
        int res = -1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (k < arr[mid]) {
                res = mid;
                high = mid ;
            } else
                low = mid + 1;
        }
        return res;
    }
}
