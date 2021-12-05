package Java.M_OOPS.R_BankingSoftware;

public class SignUpCustomer {

    protected String cName;
    protected String cPassword;
    protected int CAccountNumber;
    protected int cStartingBalance;
    protected int cRole;

    public SignUpCustomer(String cName, String cPassword, int CAccountNumber, int cStartingBalance,int cRole) {
        this.cName = cName;
        this.cPassword = cPassword;
        this.CAccountNumber = CAccountNumber;
        this.cStartingBalance = cStartingBalance;
        this.cRole = cRole;
    }

    public SignUpCustomer() {
    }

    public String getcName() {
        return cName;
    }

    public String getcPassword() {
        return cPassword;
    }

    public int getCAccountNumber() {
        return CAccountNumber;
    }

    public int getcStartingBalance() {
        return cStartingBalance;
    }

    public int getcRole() {
        return cRole;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public void setCAccountNumber(int CAccountNumber) {
        this.CAccountNumber = CAccountNumber;
    }

    public void setcStartingBalance(int cStartingBalance) {
        this.cStartingBalance = cStartingBalance;
    }

    public void setcRole(int cRole) {
        this.cRole = cRole;
    }
}
