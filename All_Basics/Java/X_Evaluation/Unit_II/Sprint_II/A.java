//package Java.X_Evaluation.Unit_II.Sprint_II;
//
//import java.util.Scanner;
//
//public class A {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0) {
//            int n = scanner.nextInt();
//            int[][] arr = new int[n][n];
//            for (int i = 0; i < n; i++)
//                for (int j = 0; j < n; j++)
//                    arr[i][j] = scanner.nextInt();
////            System.out.println(res(n, arr));
//            res(n,arr);
//        }
//    }
//
//    static void res(int n, int[][] arr) {
//        {
//            if (i >= m || j >= n) {
//                return;
//            }
//
//            for (int p = i; p < n; p++) {
//                System.out.print(arr[i][p] + " ");
//            }
//
//            for (int p = i + 1; p < m; p++) {
//                System.out.print(arr[p][n - 1] + " ");
//            }
//            if ((m - 1) != i) {
//                for (int p = n - 2; p >= j; p--) {
//                    System.out.print(arr[m - 1][p] + " ");
//                }
//            }
//
//            if ((n - 1) != j) {
//                for (int p = m - 2; p > i; p--) {
//                    System.out.print(arr[p][j] + " ");
//                }
//            }
//            print(arr, i + 1, j + 1, m - 1, n - 1);
//        }
////        int sum = 0;
////        for (int i = 0; i < arr.length; i++)
////            for (int j = 0; j < arr[0].length; j++) {
////                // Check for main diagonal element.
////                if (i == j) {
////                    sum += arr[i][j];
////                }
////
////                if (i + j == arr.length - 1 && i != j) {
////                    sum += arr[i][j];
////                }
////            }
////        return sum;
////    }
////}
///*
//3
//1
//1
//2
//1 2 3 4
//3
//1 2 3 4 5 6 7 8 9
// */
