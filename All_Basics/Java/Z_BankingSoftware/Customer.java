package Java.Z_BankingSoftware;

public class Customer {
    private String name;
    private String password;
    private String accountNumber;
    private double startingBalance;
    private String role;

    public Customer(String name, String password, String accountNumber, Double startingBalance, String role) {
        this.name = name;
        this.password = password;
        this.accountNumber = accountNumber;
        this.startingBalance = startingBalance;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getStartingBalance() {
        return startingBalance;
    }

    public String getRole() {
        return role;
    }

    public void setStartingBalance(double amount) {
        startingBalance = startingBalance + amount;
    }

    public void withdrawAmount(double amount) {
        if (amount > startingBalance){
            System.out.println("Insufficient balance");
        }else {
            startingBalance = startingBalance - amount;
        }
    }
    public void transfer(String accountNumber, double amount){
        if (amount>startingBalance){
            System.out.println("Insufficient funds");
        }else {
            startingBalance = startingBalance - amount;
            System.out.println("Account to be transfered in " + accountNumber);
        }
    }

}
