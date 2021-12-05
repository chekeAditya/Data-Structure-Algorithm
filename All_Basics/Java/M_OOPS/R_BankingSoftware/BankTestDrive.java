package Java.M_OOPS.R_BankingSoftware;

import java.util.Scanner;

public class BankTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Welcome to HDFC Banking Software ***");
        System.out.println();
        for (int i = 1; i > 0; i++) {
            System.out.println(
                    "1.Create an account\n" +
                            "2.Login\n" +
                            "3.Exit");
            System.out.println();
            System.out.print("Enter Choice : ");
            int choices = scanner.nextInt();
            System.out.println();
            if (choices == 1) {
                System.out.println("-*-*--Create an Account--*-*-");
                System.out.println();
                System.out.print("Enter name : ");
                String cusName = scanner.next();
                System.out.print("Enter new password : ");
                String cusPassword = scanner.next();
                System.out.print("Enter Account Number : ");
                int cusAccountNum = scanner.nextInt();
                System.out.println("Enter Starting balance : ");
                int cusStartingBalance = scanner.nextInt();
                System.out.print(
                        "1.Customer\n" +
                                "2.Employee");
                System.out.print("Select role : ");
                int role = scanner.nextInt();
                SignUpCustomer signUpCustomer = new SignUpCustomer(cusName, cusPassword, cusAccountNum, cusStartingBalance, role);
                signUpCustomer.cStartingBalance = cusStartingBalance; //starting balance
                System.out.println("Signup Successful");
                System.out.println("---* Thanks For Visiting ! *---");
                System.out.println();
                System.out.println();


            } else if (choices == 2) {
                SignUpCustomer signUpCustomer = new SignUpCustomer();
                System.out.println("--------* Login *--------");
                System.out.println();
                System.out.print("Enter account Number : ");
                int loginAccNum = scanner.nextInt();
                System.out.print("Enter Password : ");
                String loginPass = scanner.next();
                System.out.println();
                AdminLoginCustomer loginCustomer = new AdminLoginCustomer();
                System.out.println("Current Balance is " + signUpCustomer.cStartingBalance);
                System.out.println("---*Login Successful,you are HDFC Customer *---");
                System.out.println();
                for (int j = 1; j > 0; j++) {
                    System.out.println(
                            "1.Deposit\n" +
                                    "2.Withdraw money\n" +
                                    "3.Transfer\n" +
                                    "4.Show Balance\n" +
                                    "5.Exit");
                    System.out.print("Select choice : ");
                    int customerChoice = scanner.nextInt();
                    System.out.println();
                    if (customerChoice == 1) {
//deposit money
                        System.out.print("Enter Deposit Amount : ");
                        int depositAmt = scanner.nextInt();
                        loginCustomer.depositMoney(depositAmt);
                        System.out.println("Thanks For Visiting !");
                        System.out.println();
                    } else if (customerChoice == 2) {
//withdraw money
                        System.out.print("Enter Withdraw Amount : ");
                        int withdrawAmt = scanner.nextInt();
                        loginCustomer.withdrawMoney(withdrawAmt);
                        System.out.println("Thanks For Visiting !");
                        System.out.println();

                    } else if (customerChoice == 3) {
//transfer money
                        System.out.print("Amount need to transfer : ");
                        int transferAmt = scanner.nextInt();
                        loginCustomer.transfer(transferAmt);
                        System.out.println("Thanks For Visiting !");
                        System.out.println();

                    } else if (customerChoice == 4) {
//show money
                        System.out.println("Balance :-" + signUpCustomer.cStartingBalance);
                        System.out.println("Thanks For Visiting !");
                        System.out.println();

                    } else if (customerChoice == 5) {
//exit
                        System.out.println("Thanks For Visiting !");
                        System.out.println();
                        return;
                    } else if (choices == 3) {
                        System.out.println("Thanks for Visiting ! Do visit Again");
                        System.out.println();
                        return;
                    }
                }
            }
        }
    }
}