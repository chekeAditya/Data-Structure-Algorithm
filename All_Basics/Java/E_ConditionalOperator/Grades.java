package Java.E_ConditionalOperator;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade obtained");
        String grade = sc.next();
        switch (grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Needs a lot of Improvement");
                break;
            case "F":
                System.out.println("Failed");
                break;
        }

    }
}
