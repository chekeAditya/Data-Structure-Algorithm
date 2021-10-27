package Basic_To_Advanced_DataStructure.CodingTask.InheritanceAndEncapsulation.CalculatingBills;

public class Commercial {

    String nameOfCustomer;

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public void CalculateBills(int unit) {
        int bill_amt = 5 * 100;
        System.out.println("Bill amount = " + bill_amt + " Rs");
    }
}
