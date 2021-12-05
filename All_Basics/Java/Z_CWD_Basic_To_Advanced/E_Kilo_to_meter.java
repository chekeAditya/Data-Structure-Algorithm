package Java.Z_CWD_Basic_To_Advanced;

import java.util.Scanner;

public class E_Kilo_to_meter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Kilometer");
        int kilometer = scanner.nextInt();
        double kiloToMile = kilometer / 1.609d;
        System.out.println("Miles is " + kiloToMile);
    }
}
