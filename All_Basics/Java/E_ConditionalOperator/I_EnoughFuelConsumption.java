package Java.E_ConditionalOperator;

import java.util.Scanner;

public class I_EnoughFuelConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fuel = scanner.nextInt();
        int distance = scanner.nextInt();
        if (fuel > 50){
            System.out.println("Enough");
        }else{
            System.out.println("Go on");
        }
    }
}
