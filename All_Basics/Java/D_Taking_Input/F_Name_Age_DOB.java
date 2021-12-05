package Java.D_Taking_Input;

import java.util.Scanner;

public class F_Name_Age_DOB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        String DOB = scanner.next();
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("DOB is " + DOB);

    }
}
