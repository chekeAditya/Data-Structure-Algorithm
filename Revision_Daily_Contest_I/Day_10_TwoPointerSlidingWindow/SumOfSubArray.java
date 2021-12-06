package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_10_TwoPointerSlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long[] arr = new long[Math.toIntExact(n)];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextLong();
            System.out.println(res(arr, k));
        }
    }

    static String res(long[] arr, long k) {
        int count = 0;
        long sum = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        for (long j : arr) {
            sum += j;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        if (count >= 1)
            return "Yes";
        return "No";
    }
}


