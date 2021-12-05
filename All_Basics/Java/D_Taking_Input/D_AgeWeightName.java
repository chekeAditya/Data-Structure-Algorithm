package Java.D_Taking_Input;

import java.util.Scanner;

public class D_AgeWeightName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        float weight = scanner.nextFloat();
        String name = scanner.nextLine();
        System.out.println("Age is " +age);
        System.out.println("Weight is " +weight);
        System.out.println("Name is " +name);

    }
}
