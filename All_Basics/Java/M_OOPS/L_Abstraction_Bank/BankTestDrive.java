package Java.M_OOPS.L_Abstraction_Bank;

public class BankTestDrive {
    public static void main(String[] args) {
        A_Bank bankA = new BankA();
        bankA.setDepositAmount(1000);
        bankA.getBalance();

        A_Bank bankB = new BankB();
        bankB.setDepositAmount(140);
        bankB.getBalance();

        A_Bank bankC = new BankC();
        bankC.setDepositAmount(2050);
        bankC.getBalance();
    }
}
