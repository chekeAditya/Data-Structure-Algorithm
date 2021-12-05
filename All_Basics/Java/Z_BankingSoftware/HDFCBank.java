package Java.Z_BankingSoftware;

import java.util.ArrayList;
import java.util.Scanner;

public class HDFCBank {
    private static ArrayList<Customer> customersList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("-*-*-*-*--Welcome to HDFC Bank--*-*-*-*");
        System.out.println();
        enterChoice();
    }

    static void enterChoice() {
        System.out.println("Enter a choice \n" +
                "1. Create an Account\n" +
                "2. Login\n" +
                "3. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                createAccount();
                break;
            case 2:
                login();
                break;
            case 3:
                exit();
                break;
            default:
                System.out.println("Invalid entry : Please try again");
        }
        sc.close();     //closing resource
    }

    private static void createAccount() {
        System.out.println("*-*--Create an Account--*-* ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter Password : ");
        String password = sc.nextLine();
        System.out.println("Enter Account Number : ");
        String accountNumber = sc.nextLine();
        System.out.println("Enter total Balance : ");
        double totalBalance = sc.nextDouble();
        System.out.println("Enter a role : ");
        String role = sc.next();
        if (role.equals("Customer")) {
            Customer customer = new Customer(name, password, accountNumber, totalBalance, role);
            for (Customer c : customersList) {
                if (c.getAccountNumber().equals(c.getAccountNumber())) {
                    System.out.println("Account already exist");
                    break;
                } else {
                }
            }
            System.out.println("Account created successfully!");
            System.out.println();
        } else {
            //create an employee
        }
        enterChoice();
        sc.close();
    }

    private static void login() {
        System.out.println("*-*--Login--*-*");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number to login : ");
        String accountNumber = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        boolean isAccountExist = false;
        Customer customer = null;
        for (int i = 0; i < customersList.size(); i++) {
            if (accountNumber.equals(customersList.get(i).getAccountNumber()) && password.equals(customersList.get(i).getPassword())) {
                isAccountExist = true;
                break;
            }
        }
        if (isAccountExist) {
            System.out.println("Login Successful\n" +
                    "---------------------------------------------------");
            handleCustomerLoginSuccessful(customer);
        } else {
            System.out.println("Invalid Credentials");
        }


    }

    private static void handleCustomerLoginSuccessful(Customer customer) {
        System.out.println("Enter the choice \n" +
                "1.Deposit\n" +
                "2.Withdraw\n" +
                "3.Transfer\n" +
                "4.Show Balance\n" +
                "5.Exit");
        Scanner sc = new Scanner(System.in);
        int choices = sc.nextInt();
        switch (choices) {
            case 1 -> depositAmount(customer);
            case 2 -> withdraw(customer);
            case 3 -> transfer(customer);
            case 4 -> showBalance(customer);
            case 5 -> exithere(customer);
            default -> System.out.println("Enter valid choices");
        }
    }

    private static void depositAmount(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit");
        double amount = scanner.nextDouble();
        customer.setStartingBalance(amount);
        System.out.println("The total balance is after deposit " + customer.getStartingBalance());
        scanner.close();
    }

    private static void withdraw(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        double amount = scanner.nextDouble();
        customer.withdrawAmount(amount);
        System.out.println("The total balance after withdraw is " + customer.getStartingBalance());
        scanner.close();
    }

    private static void transfer(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to transfer");
        double amount = scanner.nextDouble();
        customer.withdrawAmount(amount);
        System.out.println("The total balance after transfer is " + customer.getStartingBalance());
        scanner.close();
    }

    private static void showBalance(Customer customer) {
        System.out.println("The total balance is " + customer.getStartingBalance());
    }

    private static void exithere(Customer customer) {
        return;
    }

    private static void exit() {
        System.out.println("*-*--Exit--*-*");
    }
}
