package Java.E_ConditionalOperator;

import java.util.Scanner;

public class H_ApplyBrakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int time = scanner.nextInt();
//        speed = distance/time
        int speed = distance/time;
        if (speed > 40)
            System.out.println("Apply Brake");
        else
            System.out.println("Keep Going");
    }
}
