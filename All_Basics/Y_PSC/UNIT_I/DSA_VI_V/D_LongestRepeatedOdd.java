package Y_PSC.UNIT_I.DSA_VI_V;

import java.util.Scanner;

public class D_LongestRepeatedOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        longestRepeatedOdd(n, array);
    }

    static void longestRepeatedOdd(int n, int[] array) {
        int count = 0;
        int firstCount = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                count = 0;
                int temp = array[i];
                count += 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[j] == temp) {
                        count += 1;
                    } else {
                        break;
                    }
                }
                if (count > firstCount) {
                    firstCount = count;
                }
            }
        }
            System.out.println(firstCount);
    }
}
