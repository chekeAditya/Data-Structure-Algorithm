package Java.E_ConditionalOperator;

import java.util.Scanner;

public class J_MasaiSchoolHurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 35 == 0 )
            System.out.println("Masai School");
        else if (N % 5 ==0 )
            System.out.println("School");
        else if (N % 7 == 0)
            System.out.println("Masai");
        else
            System.out.println("Hurray!");
    }
}
