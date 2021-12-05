package Java.F_Loops;

import java.util.Scanner;

public class Rangeof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        while (L<= R){
            System.out.println(L + " " +L*2);
            break;
        }
    }
}
