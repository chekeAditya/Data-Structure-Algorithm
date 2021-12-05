package Java.N_ObjectsAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Expense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of Quantities : ");
        int n = scanner.nextInt();
        System.out.println("Write Price and it's quantity");

//        Map<Integer, ArrayList<Integer>> expense = new HashMap<Integer, ArrayList<Integer>>();
        Map<Integer, Integer> expense = new HashMap<>();
        for (int i = 0; i < n; i++) {
//            expense.put(scanner.nextInt(), new ArrayList<Integer>());
            expense.put(scanner.nextInt(), scanner.nextInt());
//            expense.computeIfAbsent(scanner.nextInt(), scanner.nextInt()); //putting quantity,price per item

        }

        int bill = 0;
        double discountedBill = 0;
        for (Map.Entry<Integer, Integer> map : expense.entrySet()) {//trying for multimaping
//            bill += map.getKey() * expense.get(map.getValue()); //here i want the value but not getting can u tell what are the changes i had to do?
            bill += map.getKey() * map.getValue();
        }
        if (bill > 5000) {
            discountedBill = 0.1 * bill;
        }
        System.out.println("Discount applicable is " + discountedBill);
        System.out.print("Total bill : ");
        System.out.println(bill - discountedBill);
    }
}
