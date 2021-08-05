/*
Question :-
7 2
1 2 3 4 5 6 7

Rotate by K times--> Here N = 7 and k = 2 and arr = 1 2 3 4 5 6 7
 */

package Basic_To_Advanced_DataStructure.Array;

import java.util.Scanner;

public class ProgramForArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        res(n, arr, k);
    }

/**
 * Time Complexity = O(n*k)
 * Space Complexity = O(1)
 * Rotate one by one method
 */
    static void res(int n, int[] arr, int k) {
        int temp;
        while (k-- > 0) {
            temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
