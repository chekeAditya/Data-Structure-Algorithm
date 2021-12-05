package Java.F_Loops;

import java.util.Scanner;

public class OddSumBelowN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int N = scanner.nextInt();
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 1){
                sum = sum + i;
            }
        }
                System.out.println(sum);
    }
}
