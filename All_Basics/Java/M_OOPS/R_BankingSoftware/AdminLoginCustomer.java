package Java.M_OOPS.R_BankingSoftware;

public class AdminLoginCustomer extends SignUpCustomer {


    public AdminLoginCustomer( ) {

    }

    public void depositMoney(int depositAmt) {
        int deposit = depositAmt + cStartingBalance;
        System.out.println("Deposit Successful: Balance is :- " + deposit);
    }

    public void withdrawMoney(int withdrawAmt) {
        if (cStartingBalance < withdrawAmt) {
            System.out.println("Insufficient Fund");
        } else {
            int withdraw = cStartingBalance - withdrawAmt;
            System.out.println("Withdraw Successful: Balance is :- " + withdraw);
        }
    }

    public void transfer(int transferAmt) {
        if (cStartingBalance < transferAmt) {
            System.out.println("Insufficient Fund");
        } else {
            int transfer = cStartingBalance - transferAmt;
            System.out.println("Transfer Successful: Balance is  :- " + transfer);
        }
    }

    @Override
    public String getcName() {
        return super.getcName();
    }

    @Override
    public int getcStartingBalance() {
        return super.getcStartingBalance();
    }

    @Override
    public int getCAccountNumber() {
        return super.getCAccountNumber();
    }

    @Override
    public String getcPassword() {
        return super.getcPassword();
    }
}
