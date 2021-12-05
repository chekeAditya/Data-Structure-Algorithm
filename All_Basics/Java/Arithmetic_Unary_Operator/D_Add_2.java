package Java.Arithmetic_Unary_Operator;

import java.util.Scanner;

public class D_Add_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //assigning a value of 10
        int add = a + 2;
        System.out.println("Assigned variable is : " + a);
        System.out.println("1. Adding 2 to the same variable : " + add);
        int sub = a - 3;
        System.out.println("2. Subtracting 3 from the same variable : " +sub);
        double divide = a / 6d;
        System.out.println("3. Dividing same variable by 6 : " + divide);
        int multiply = a * 11;
        System.out.println("4. Multiply the same variable by 11 : "+ multiply);
        int remainder = a % 7;
        System.out.println("5. Take a remainder by 7 of the same variable : " + remainder);

    }
}
