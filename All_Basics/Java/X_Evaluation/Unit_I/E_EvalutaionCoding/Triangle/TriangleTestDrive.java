package Java.X_Evaluation.Unit_I.E_EvalutaionCoding.Triangle;

import java.util.Scanner;

public class TriangleTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        System.out.print("base = ");
        int base = scanner.nextInt();
        System.out.print("side = ");
        int side2 = scanner.nextInt();
        Triangle triangle = new Triangle(side, side2, base);
        triangle.calculatePerimeter(side, side2, base);
    }
}
