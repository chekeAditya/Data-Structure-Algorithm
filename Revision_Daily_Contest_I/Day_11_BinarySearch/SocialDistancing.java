package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_11_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SocialDistancing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            System.out.println(res(N, M, arr, 2, arr[N - 1]));
        }
    }

    static int res(int N, int M, int[] arr, int start, int end) {
        int res = -1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (check(mid, arr, N, M,arr[0])) {
                res = Math.max(res, mid);
                start = mid + 1;
            } else
                end = mid;
        }
        return res;
    }

    static boolean check(int mid, int[] arr, int n, int k,int temp) {
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] - temp >= mid) {
                temp = arr[i];
                count++;
                if (count == k)
                    return true;
            }
        }
        return false;
    }
}
