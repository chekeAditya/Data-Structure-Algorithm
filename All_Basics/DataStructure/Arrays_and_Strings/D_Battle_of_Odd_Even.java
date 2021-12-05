package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class D_Battle_of_Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
            } else if (arr[i] % 2 == 1) {
                odd += arr[i];
            }
        }
        if (even < odd) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
