package Basic_To_Advanced_DataStructure.Final450.Array;

import java.util.Scanner;

public class SignalCapacity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        }
    }

    static void res(int n, int[] arr) {
        int count = 0, end = n - 1, left = 0, p = end - 1;
        while (end >= left){
            if (arr[end] < arr[p]){
                count++;
                p--;
            }

        }
    }
}
