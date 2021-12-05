package Java.M_OOPS.L_Abstraction_Bank;

public class BankA extends A_Bank{
    @Override
    protected void getBalance() {
        System.out.println("Bank A had " + depositAmount);
    }
}
