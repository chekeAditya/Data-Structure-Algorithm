package Java.D_Taking_Input;

import java.util.Scanner;

public class E_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        int area = length * breadth;
        System.out.println("Area is "+area);
    }
}
