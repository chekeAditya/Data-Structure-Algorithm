//package Y_PSC.UNIT_II.Summary;
//
//import java.util.Scanner;
//
//public class SubaarraySum {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = scanner.nextInt();
//    }
//
//    static int res(int n, int k, int[] arr) {
//        int left = -1, right = 0, sum = 0, min;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % k != 0) {
//                if (left == -1) left = i;
//                right = i;
//            }
//            sum += arr[i];
//        }
//        if (sum % k != 0) return 1;
//        if (left == -1) return 0;
//        left += 1;
//        right = arr.length - right;
//        int max_window_size = arr.length - min(left, right);
//        return max_window_size;
//    }
//
//    private static int min(int k, int left, int right, int[] arr) {
//        left = 0;
//        right = k - 1;
//        e (right < ar)
//            return 0;
//    }
//}
