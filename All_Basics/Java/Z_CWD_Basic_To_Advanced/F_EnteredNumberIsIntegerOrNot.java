package Java.Z_CWD_Basic_To_Advanced;

import java.util.Scanner;

public class F_EnteredNumberIsIntegerOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        boolean numberType = scanner.hasNextInt();
        System.out.println("Checking whether number is Integer or not:- "+ numberType);
    }
}
