package Basic_To_Advanced_DataStructure.Basic;

/**
 * Tickets Booking -12412:34:25
 * Description
 *
 * You are provided price of three different types of ticket: 1st Class, 2nd class and 3rd class.
 *
 * Also, you know the number of tickets of each type you need to book. Find total cost you need to pay.
 *
 *
 * Input
 * Input Format:
 *
 * First line contains 3 space separated positive integers which represents prices of 1st class, 2nd class and 3rd class respectively.
 *
 * Second line contains 3 space separated integers which is the number of tickets you need to buy of 1st class, 2nd class and 3rd class respectively.
 *
 * Constraints:
 *
 * All provided numbers <10000
 *
 *
 * Output
 * Output one number which is the price of all tickets to be booked.
 *
 *
 * Sample Input 1
 *
 * 1200 1400 2000
 * 5 6 2
 * Sample Output 1
 *
 * 18400
 */

import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();
        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int p3 = scanner.nextInt();
        System.out.println(res(t1,t2,t3,p1,p2,p3));
    }

    static int res(int t1, int t2, int t3, int p1, int p2, int p3){
        return (t1*p1) + (t2*p2) + (t3*p3);
    }
}
