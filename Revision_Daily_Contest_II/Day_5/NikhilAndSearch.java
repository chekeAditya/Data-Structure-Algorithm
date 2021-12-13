package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_5;

import java.util.Scanner;

public class NikhilAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int number = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(res(n, arr, k, number, 0, n - 1, 0));
        }
    }

    static int res(int n, int[] arr, int k, int number, int start, int end, int count) {
        if (number == 0) {
            int low = 0, high = n;
            while (high > low) {
                int mid = (low + high) / 2;
                if (arr[mid] < k)
                    low = mid + 1;
                else
                    high = mid;
            }
            pi(n - low);
        } else {
            int ub = upper(arr, 0, n - 1, k) - a;
            printf("%d\n", n - ub);
        }
    }

    static int upper(int[] arr, int start, int end, int item, int count) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < item) {
                count++;
                start = mid + 1;
            } else end = mid;
        }
        return count;
    }

    static int lower(int start, int end, int item, int[] arr, int count) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > item) {
                count++;
                end = mid;
            } else start = mid + 1;
        }
        return count;
    }
}
