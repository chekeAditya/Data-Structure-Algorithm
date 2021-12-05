package Java.M_OOPS.H_Billing;

public class Domestic extends Commercial {
    public Domestic(String customerName) {
        super(customerName);
    }

    @Override
    public String getCustomerName() {
        return super.getCustomerName();
    }

    @Override
    public void setCustomerName(String customerName) {
        super.setCustomerName(customerName);
    }

    @Override
    public void calculateBill() {
        int bill = (int) (2.5 * 100);
        System.out.println("Bill amount = " + bill + "Rs");
    }
}

/*
calculate bill for domestic user
 */
