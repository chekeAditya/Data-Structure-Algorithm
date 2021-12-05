package Java.M_OOPS.L_Abstraction_Bank;

public class BankB extends A_Bank{
    @Override
    protected void getBalance() {
        System.out.println("Bank B had " + depositAmount);
    }
}
