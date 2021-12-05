package Java.M_OOPS.L_Abstraction_Bank;

public class BankC extends A_Bank {
    @Override
    protected void getBalance() {
        System.out.println("Bank C had " + depositAmount);
    }
}
