package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_10_TwoPointerSlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class Gifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.println(res(arr, n));
        }
    }

    private static int res(int[] a, int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int start = 0, left = 0; start < n; start++) {
            left = Math.max(hashMap.getOrDefault(a[start], 0), left);
            count = Math.max(count, start - left + 1);
            hashMap.put(a[start], start + 1);
        }
        return count;
    }
}

