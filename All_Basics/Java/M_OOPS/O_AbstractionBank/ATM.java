package Java.M_OOPS.O_AbstractionBank;

public class ATM extends Bank{

    public void withdraw(double withDrawAmt) {
        if (totalBalance < withDrawAmt) {
            System.out.println("Insufficient Fund");
        } else {
            totalBalance = totalBalance - withDrawAmt;
        }
    }

    public void printBalance(){
        System.out.println("Remaining balance is " + totalBalance);
    }

    public void Welcome(){
        System.out.println("Welcome " + bankHolderName + " to " + " HDFC Bank ATM");
    }
}
