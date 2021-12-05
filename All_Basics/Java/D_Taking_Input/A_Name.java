package Java.D_Taking_Input;

import java.util.Scanner;

public class A_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        System.out.println(name + " " +age);
    }
}
