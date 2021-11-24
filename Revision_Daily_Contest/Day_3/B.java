package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String name = "Ai";
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.print(res(n, arr, 0) + " ");
            System.out.print(res1(arr, n) + " ");
            System.out.print(res2(arr, n));
            System.out.println();
        }
    }

    static int res(double n, int[] arr, int start) {
        double mean = 0;
        while (start < n) {
            mean += arr[start];
            start++;
        }
        int mean1 = (int) (mean / n);
        return mean1;
    }

    static int res1(int[] arr, int n) {
        Arrays.sort(arr);
        int div = n / 2;
        if (n % 2 != 0) {
            int number = arr[div];
            return number;
        }
        int median = (int) ((arr[(n - 1) / 2] + arr[div]) / 2.0);
        return median;
    }

    static int res2(int[] a, int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 1, maxCount = 0;

        for (int number : a) {
            if (hashMap.get(number) != null) {
                int current = hashMap.get(number);
                current++;
                hashMap.put(number, current);
                if (current > count) {
                    count = current;
                    maxCount = number;
                }
            } else
                hashMap.put(number, 1);
        }
        int value = 0, key1 = 0;
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > value){
                value = map.getValue();
                key1 = map.getKey();
            }
        }
        return key1;
    }
}
