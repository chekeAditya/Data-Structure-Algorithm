package Basic_To_Advanced_DataStructure.BinarySearch;

import java.util.Scanner;

public class ThePeakPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.println(res(n, arr, 0, n - 1));
        }
    }

    static int res(int n, int[] arr, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static class D_MinimumIn_Sorted_And_RotatedArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.println(res(n, arr, 0, n - 1));
        }

        static int res(int n, int[] arr, int low, int high) {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid];
                } else if (arr[low] == arr[high]) {
                    return arr[low];
                } else if (arr[mid] > arr[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }
    }
}
