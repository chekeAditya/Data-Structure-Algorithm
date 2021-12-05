package Y_PSC.UNIT_I.DSA_IV;

//https://oj.masaischool.com/contest/991/problems

import java.util.Scanner;

public class PSC_01_TicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstClass = scanner.nextInt();
        int secondClass = scanner.nextInt();
        int thirdClass = scanner.nextInt();
        int firstClassTicketNumber = scanner.nextInt();
        int secondClassTicketNumber = scanner.nextInt();
        int thirdClassTicketNumber = scanner.nextInt();

        int ticketOne = firstClassTicketNumber * firstClass;
        int ticketTwo = secondClassTicketNumber * secondClass;
        int ticketThird = thirdClassTicketNumber * thirdClass;

        int total = ticketOne + ticketThird + ticketTwo;
        System.out.println(total);
    }
}
