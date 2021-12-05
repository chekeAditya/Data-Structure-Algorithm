package Java.M_OOPS.L_Abstraction_Bank;

public abstract class A_Bank {

    protected double depositAmount;
    protected abstract void getBalance();

    protected void setDepositAmount(double amount) {
        this.depositAmount = amount;
    }
}
