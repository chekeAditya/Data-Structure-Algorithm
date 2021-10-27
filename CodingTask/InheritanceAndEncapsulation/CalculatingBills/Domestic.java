package Basic_To_Advanced_DataStructure.CodingTask.InheritanceAndEncapsulation.CalculatingBills;

public class Domestic extends Commercial {

    @Override
    public String getNameOfCustomer() {
        return super.getNameOfCustomer();
    }

    @Override
    public void setNameOfCustomer(String nameOfCustomer) {
        super.setNameOfCustomer(nameOfCustomer);
    }

    @Override
    public void CalculateBills(int unit) {
        int bill_amt_domestic = (int) (2.5 * 100);
        System.out.println("Bill amount = " + bill_amt_domestic + " Rs");
    }
}
