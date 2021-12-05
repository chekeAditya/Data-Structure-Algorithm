package Java.M_OOPS.G_Bank;

public class ATM extends Bank {

    public ATM(String accountHolderName, double bankBalance) {
        super(accountHolderName, bankBalance);
    }

    public void withdraw(double withdrawAmt, double totalBalance) {
        double remaining = totalBalance - withdrawAmt;
        System.out.println("Remaining balance is " + remaining);
    }
}
