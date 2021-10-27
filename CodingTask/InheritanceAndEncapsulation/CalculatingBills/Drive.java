package Basic_To_Advanced_DataStructure.CodingTask.InheritanceAndEncapsulation.CalculatingBills;

public class Drive {
    public static void main(String[] args) {
        Commercial commercial = new Commercial();
        commercial.setNameOfCustomer("Raj Kumar");
        System.out.println("Customer: " + commercial.nameOfCustomer);
        commercial.CalculateBills(100);

        System.out.println();
        Domestic domestic = new Domestic();
        domestic.setNameOfCustomer("Lalith Raj");
        System.out.println("Customer: " + domestic.nameOfCustomer);
        domestic.CalculateBills(100);
    }
}
