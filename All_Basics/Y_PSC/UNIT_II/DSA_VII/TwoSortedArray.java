package Y_PSC.UNIT_II.DSA_VII;

import java.util.Scanner;

public class TwoSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            for (int i = 0; i < n; i++)
                arr2[i] = scanner.nextInt();
            System.out.println(res(arr,arr2,n));
        }
    }

    static int res(int[] arr, int[] arr2, int n) {
        int count = 0;
        int start = 0, end = n;
        for (int i = 0; i < arr.length; i++) {
            while (start < arr.length){
                if (arr[i] == arr2[start]) count++;
                start++;
            }
        }
        return count;
    }
}
