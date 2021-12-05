package Java.M_OOPS.G_Bank;

import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of the user");
        String name = scanner.nextLine();
        System.out.println("Enter the bank Balance");
        double bankBalance = scanner.nextDouble();
        System.out.println("Enter the amount to be withdraw");
        double withdraw = scanner.nextDouble();

        System.out.println("Welcome " + name + " to HDFC Bank Atm");
        ATM atm = new ATM(name, bankBalance);
        atm.withdraw(withdraw, bankBalance);
    }
}
