package Java.M_OOPS.H_Billing;

public class BillTestDrive {
    public static void main(String[] args) {
        Commercial commercial = new Commercial("Raj Kumar");
        System.out.println("Customer : " + commercial.customerName);
        commercial.calculateBill();
        System.out.println();
        Domestic domestic = new Domestic("Lalith Raj");
        System.out.println("Customer : " + domestic.customerName);
        domestic.calculateBill();
    }
}
