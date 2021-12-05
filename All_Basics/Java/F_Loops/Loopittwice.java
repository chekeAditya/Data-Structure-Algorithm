package Java.F_Loops;

import java.util.Scanner;

public class Loopittwice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        for (int i = L; i <=R; i+=2) {
            System.out.print(i + " ");
        }

    }
}
