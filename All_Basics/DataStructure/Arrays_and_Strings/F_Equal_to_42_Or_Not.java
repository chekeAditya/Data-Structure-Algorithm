package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class F_Equal_to_42_Or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int present = 42;
        for (int i = 0; i < N; i++) {
            if (array[i] == present) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            return;
        }
    }
}
