package Java.X_Evaluation.Unit_I.C_Evaluation;

import java.util.Scanner;

public class Pr_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        checkage(age);
    }

    static void checkage(int age) {
        if (age < 13) {
            System.out.println("1 Kms");
        } else if (age >= 13 && age < 18) {
            System.out.println("5 Kms");
        }else if (age >=18 && age <30){
            System.out.println("10 Kms");
        }else {
            System.out.println("You can have friends from anywhere");
        }
    }
}
