package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class J_AddNumebrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        int n1 = scanner.nextInt();
        System.out.println("Enter second Number");
        int n2 = scanner.nextInt();
        System.out.println("Enter third Number");
        int n3 = scanner.nextInt();
        System.out.println("Sum is : ");
        int addition = addNumbers(n1,n2,n3);
        System.out.println(addition);


    }

    public static int addNumbers(int n1, int n2, int n3) {
        int sum = n1+n2+n3;
        return sum;
    }
}
