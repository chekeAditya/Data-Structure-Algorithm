package Java.E_ConditionalOperator;

import java.util.Scanner;

public class E_ShushantMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if (marks == 100)
            System.out.println("A");
        else if (marks >= 90)
            System.out.println("B");
        else if (marks >= 80)
            System.out.println("C");
        else
            System.out.println("F");
    }
}
