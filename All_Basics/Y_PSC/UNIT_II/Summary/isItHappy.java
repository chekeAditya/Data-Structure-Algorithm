package Y_PSC.UNIT_II.Summary;

import java.util.Scanner;

public class isItHappy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(res(n));
        }
    }

    static boolean res(int n) {
        int temp, a;
        while (n > 0) {
            a = n / 10;
            temp = n % 10;
            double sq = Math.pow(a, 2);
            double sq1 = Math.pow(temp, 2);
            n = (int) (sq + sq1);
            if (n == 1) return true;
            n--;
        }
        return false;
    }
}
