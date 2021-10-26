package Basic_To_Advanced_DataStructure.Revision;

import java.util.Scanner;

public class A_AllTwiceExceptOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//            System.out.println(bruteForce(n, arr));
            System.out.println(sorting(n, arr));
        }
    }

    private static int sorting(int n, int[] arr) {
        for (int i = 0; i < n; i += 2) {
            if (i == n - 1) {
                if (arr[i] != arr[i+1]) return arr[i+1];
            }else {
                if (arr[i] != arr[i+1]) return arr[i];
            }
        }
        return -1;
    }

    static int bruteForce(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count != 2) return arr[i];
        }
        return count;
    }
}
