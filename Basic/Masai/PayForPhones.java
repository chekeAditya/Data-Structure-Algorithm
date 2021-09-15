package Basic_To_Advanced_DataStructure.Basic.Masai;

/**
 * Pay for Phones! -12412:33:30
 * Description
 * <p>
 * You are given prices of 4 different mobile phones and also provided with the number of each of the phones that you need to buy.
 * <p>
 * You have with you 150000 units of money. Comment if it is possible to buy those phones or not.
 * <p>
 * <p>
 * Input
 * Input Format :
 * <p>
 * First line contains 4 space separated positive values which are prices of the 4 mobile phones respectively.
 * <p>
 * Second line contains the quantity/count of each mobile phones that you need to buy
 * <p>
 * <p>
 * <p>
 * Constraints :
 * <p>
 * price of each phone < 100000
 * <p>
 * <p>
 * Output
 * Output "Possible" (without quotes) if it is possible to buy desired numbers of mobile phones.
 * <p>
 * Else in all other case, print "Not Possible" (without quotes)
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 10000 20000 15000 5000
 * 2 3 4 3
 * Sample Output 1
 * <p>
 * Not Possible
 */

import java.util.Scanner;

public class PayForPhones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int p3 = scanner.nextInt();
        int p4 = scanner.nextInt();
        int q1 = scanner.nextInt();
        int q2 = scanner.nextInt();
        int q3 = scanner.nextInt();
        int q4 = scanner.nextInt();
        System.out.println(res(p1, p2, p3, p4, q1, q2, q3, q4));
    }

    static String res(int p1, int p2, int p3, int p4, int q1, int q2, int q3, int q4) {
        int budget = 150000;
        int cart = (p1 * q1) + (p2 * q2) + (p3 * q3) + (p4 * q4);
        if (budget < cart) return "Not Possible";
        else return "Possible";
    }
}
