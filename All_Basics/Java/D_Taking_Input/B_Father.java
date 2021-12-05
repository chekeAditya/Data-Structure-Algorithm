package Java.D_Taking_Input;

import java.util.Scanner;

public class B_Father {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int father_age = scanner.nextInt();
        scanner.nextLine();
        String father_name = scanner.nextLine();
        System.out.println("Father name is "+father_name);
        System.out.println("Father age is "+father_age);
    }
}
