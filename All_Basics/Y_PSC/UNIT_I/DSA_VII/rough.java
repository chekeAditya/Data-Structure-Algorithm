package Y_PSC.UNIT_I.DSA_VII;

import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        returnCount(n,array,s);
    }
    static void returnCount(int n, int[] array, int s) {
        String v = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] * array[j] == s)
                    v = array[i] + " "+ array[j];
            }
                System.out.println(v);
        }
//        System.out.println(v);
    }
}

