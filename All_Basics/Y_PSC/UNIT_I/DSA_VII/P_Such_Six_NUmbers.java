package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class P_Such_Six_NUmbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        res(n, arr);
    }

    static void res(int n, int[] arr) {
        int sum = 0;
        int a = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = i + 2; k < n; k++) {
                        sum = (arr[i] * arr[j] + arr[k]);
                        a = (sum / arr[i]) - arr[j];
                    }
                    break;
                }
            }
    }
}
/*
a*b+c / d -e = f
 */
