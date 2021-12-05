package Java.M_OOPS.H_Billing;

public class Commercial {

    String customerName;

    public Commercial(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //method
    public void calculateBill(){
        int bill = 5*100;
        System.out.println("Bill amount = " + bill+ "Rs");
    }
}

/*
contains code for calculating bill for commercial user
conains getters and setters
 */
