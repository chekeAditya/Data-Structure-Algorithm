package Basic_To_Advanced_DataStructure.BinarySearch;//package Unit_4.BinarySort;
//
//import java.util.Scanner;
//
//public class B_LowerBoundInLogn {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
//        print()

//    }
//
//    static void print(){
//        if (lowerBound(arr, n, k, 0, n - 1) == n) System.out.println(-1);
//        System.out.println(lowerBound(arr, n, k, 0, n - 1));
//    }
//
//    static int lowerBound(int[] arr, int n, int k, int low, int high) {
//        while (low < high) {
//            int mid = low + (high - low) / 2;
//            if (k <= arr[mid])
//                high = mid;
//            else low = mid + 1;
//        }
//        if (low < n && arr[low] < k) {
//            low++;
//        }
//        return low;
//    }
//}
