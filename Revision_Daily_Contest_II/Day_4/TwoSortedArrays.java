package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TwoSortedArrays {
    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) arr1[i] = scanner.nextInt();
            System.out.println(res(n, 0, 0, n - 1, arr, arr1));
        }
    }

    static int res(int n, int count, int start, int end, int[] arr, int[] arr1) {
        while (start <= n - 1 && end >= 0) {
            if (arr[start] == arr1[end]) {
                count++;
                start++;
                end--;
            } else if (arr1[end] < arr[start])
                end--;
            else
                start++;
        }
        return count;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
