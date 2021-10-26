package Basic_To_Advanced_DataStructure.Revision;

import java.util.Arrays;
import java.util.Scanner;

public class A_MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.println(res(n, arr));
        }
    }

    //logic
    static int res(int n, int[] arr) {
        for (int i = 0; i <= n / 2; i++) {
            if (arr[i] == arr[i + n / 2]) return arr[i];
        }
        return -1;
    }
}