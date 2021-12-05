package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class E_DivisibleBy7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        isDivisible(n);
    }

    public static void isDivisible(int n) {
        if (n%7==0){
            System.out.println("Divisible");
        }else {
            System.out.println("Not divisible");
        }
    }
}
