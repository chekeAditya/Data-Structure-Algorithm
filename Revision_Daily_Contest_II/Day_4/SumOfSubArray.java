package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfSubArray {
    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.println(res(n, k, 0, 0, arr));
        }
    }

    static String res(long n, long k, long count, long sum, long[] arr) {
        HashMap<Long, Integer> hashMap = new HashMap<>();
        for (long j : arr) {
            sum += j;
            if (sum == k) return "Yes";
            if (hashMap.containsKey(sum - k))
                return "Yes";
            hashMap.put(sum, 1);
        }
        return "No";
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
