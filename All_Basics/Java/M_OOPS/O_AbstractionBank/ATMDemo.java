package Java.M_OOPS.O_AbstractionBank;

public class ATMDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.bankHolderName = "Ram Das Ghokale";
        atm.totalBalance = 10000;
        atm.withdraw(1000);
        atm.Welcome();
        atm.printBalance();
    }
}
