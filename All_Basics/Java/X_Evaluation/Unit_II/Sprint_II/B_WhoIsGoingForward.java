package Java.X_Evaluation.Unit_II.Sprint_II;

import java.util.Scanner;

public class B_WhoIsGoingForward {
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
        int count = 0;
        if (n >= k) {
            for (int i = 0; i < n; i++)
                if (arr[i] >= arr[i] + 1 )
                    if (arr[i] > k) count++;
        }
        return count;
    }
}
