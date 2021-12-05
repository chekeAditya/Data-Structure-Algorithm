package Java.W_ExtraQuestion;

import java.util.Scanner;

public class B_KeyPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //n = 12
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int k = scanner.nextInt();
        checkKye(n, x, k, arr);
    }

    public static void checkKye(int n, int x, int k, int[] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(count);
        if (count == k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
/*
i.p - 1
13
21 23 56 65 34 54 76 32 23 45 21 23 25
23
5

i.p - 2
7
5 8 7 12 14 3 9
8
2
 */
