package Java.X_Evaluation.Unit_I.A_Evalutaion;

import java.util.Scanner;

public class B_2_Area_Of_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Pi = 3;
        int radius = scanner.nextInt();
        int areaOfCircle = Pi * radius * radius;
        System.out.println(areaOfCircle);

    }
}
