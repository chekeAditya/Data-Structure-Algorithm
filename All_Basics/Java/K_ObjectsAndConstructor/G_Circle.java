package Java.K_ObjectsAndConstructor;

import java.util.Scanner;

public class G_Circle {
    int radius;

    public G_Circle() {
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle");
        G_Circle circle = new G_Circle();
        circle.getCircumference();
    }

    //method
    public void getCircumference() {
        double pi = 3.14f;
        double circumference = 2 * pi * radius;
        System.out.println("The circumference of the circle is " + circumference);
    }
}
