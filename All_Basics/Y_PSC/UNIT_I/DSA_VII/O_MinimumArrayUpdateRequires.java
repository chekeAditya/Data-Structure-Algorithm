package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class O_MinimumArrayUpdateRequires {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        res(n, k, arr);
    }

    static void res(int n, int k, int[] array) {
        int minOperation = 0;
        int smallest = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            minOperation = k - smallest;
        }
        System.out.println(minOperation);
    }
}
/*
3 4
1 2 5
 */
