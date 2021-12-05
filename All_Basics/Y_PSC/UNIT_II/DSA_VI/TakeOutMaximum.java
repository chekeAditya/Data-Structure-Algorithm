package Y_PSC.UNIT_II.DSA_VI;

import java.util.Scanner;

public class TakeOutMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        int a = 0;
        int temp = 0;
        int initial = 0;
        for (int i = 0; i < arr.length; i++, initial++) {
            temp += arr[i];
            if (i >= k - 1) {
                a = Math.max(temp, a);
                temp -= arr[initial];
                initial++;
            }
        }
        System.out.println(a);
    }
}
