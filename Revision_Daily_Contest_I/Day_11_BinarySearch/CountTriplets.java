package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_11_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CountTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println(res(n, k, arr));
    }

    static int res(int n, int k, int[] arr) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            int result = search(arr[i] - k, arr, n, 0, n - 1, -1);
            if (result <= i - 2) {
                count += ((i - result) * (i - result - 1)) / 2;
            }
        }
        return count;
    }

    static int search(int temp, int[] arr, int n, int start, int end, int result) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= temp) {
                end = mid - 1;
                result = mid;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
