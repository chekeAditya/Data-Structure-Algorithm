package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class TakeOutMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        System.out.println(res(n, k, arr));
    }

    static int res(int n, int k, int[] arr) {
        int start = 0, end = k;
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        while (end < n) {
            sum -= arr[start];
            sum += arr[end];

            if (maxSum < sum) {
                maxSum = sum;
            }
            start++;
            end++;
        }
        return maxSum;
    }
}

//        for (int i = 0; i < k; i++) {
//            sum += arr[i];
//        }
//        while (end < n) {
//            sum -= arr[start];
//            maxSum += arr[end];
//            if (sum > maxSum) maxSum = sum;
//            start++;
//            end++;
//        }
//        return maxSum;
//    }
//}
