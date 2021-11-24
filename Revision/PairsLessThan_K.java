package Basic_To_Advanced_DataStructure.Revision;

import java.util.Arrays;
import java.util.Scanner;

public class PairsLessThan_K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            int k = scanner.nextInt();
//            System.out.println(res(n, arr, k));
            System.out.println(usingTwoPointer(n, arr, k));
        }
    }

    //using brute force
    static int res(int n, int[] arr, int k) {
        int i, j, sum = 0, sum1 = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum > sum1 && sum < k)
                    sum1 = sum;
            }
        }
        if (sum1 > 0)
            return sum1;
        else return -1;
    }

    //using while loop
    static int usingTwoPointer(int n, int[] arr, int k) {
        Arrays.sort(arr);
        int sum = 0, sum1 = 0;
        int start = 0, end = arr.length - 1;
        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum > sum1 && sum < k)
                sum1 = sum;
            if (sum < k)
                start++;
            else
                end--;
        }
        if (sum1 > 0) return sum1;
        else return -1;
    }
}
