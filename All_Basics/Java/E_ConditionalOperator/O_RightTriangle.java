package Java.E_ConditionalOperator;

import java.util.Scanner;

public class O_RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int A = a*a;
        int B = b*b;
        int C = c*c;
        if(A + B == C){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
