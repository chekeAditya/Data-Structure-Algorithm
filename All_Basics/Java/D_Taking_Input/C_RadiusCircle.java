package Java.D_Taking_Input;

import java.util.Scanner;

public class C_RadiusCircle {
    public static void main(String[] args) {
        double PI = 3.14d;
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double circumference = 2 * PI * radius;
        System.out.println("circumference of the circle is " + circumference );

    }
}
