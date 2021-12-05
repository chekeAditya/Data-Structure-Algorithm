package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class L_IsOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        isOdd(limit);

    }

    public static boolean isOdd(int limit) {
        boolean isOdd = true;
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                isOdd = false;
            } else
                System.out.println(i);
        }
        return isOdd;
    }
}
