package Java.Arithmetic_Unary_Operator;

import java.util.Scanner;

public class E_CompoundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double Principal_amount = scanner.nextInt();
        double interest_percentage = scanner.nextInt();
        double time_calculate = scanner.nextInt();

//        A = P(1+r/n)*n*t -> compound interest formula

        double b = (100 + interest_percentage)/100;
        double A = Principal_amount * Math.pow(b,time_calculate);
        System.out.println("By compound interest after " + time_calculate + " years and interest rate of " + interest_percentage + " % will be " + A  );
    }
}
