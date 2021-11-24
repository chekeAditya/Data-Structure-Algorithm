package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SuchPairsReturns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                hashSet.add(arr[i]);
            }
            System.out.println(res(n,k,arr,hashSet));
        }
    }

    static int res(int n, int k, int[] arr, HashSet<Integer> hashSet) {
        for (int i = 0; i < n; i++) {
            int number =  k - arr[i];
            if (hashSet.contains(number)) {
                return 1;
            }
        }
        return -1;
    }
}
