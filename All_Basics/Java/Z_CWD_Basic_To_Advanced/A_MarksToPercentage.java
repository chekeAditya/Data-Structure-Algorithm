package Java.Z_CWD_Basic_To_Advanced;

import java.util.Scanner;

public class A_MarksToPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Out of how many marks");
        int outOfMarks = scanner.nextInt();
        System.out.println("Enter marks in English");
        int engMarks = scanner.nextInt();
        System.out.println("Enter marks in Hindi");
        int hindiMarks = scanner.nextInt();
        System.out.println("Enter marks in Maths");
        int mathMarks = scanner.nextInt();
        System.out.println("Enter marks in Science");
        int sciMarks = scanner.nextInt();
        System.out.println("Enter marks in SSt");
        int sstMarks = scanner.nextInt();

        int sumOfMarks = engMarks + hindiMarks + mathMarks + sstMarks + sciMarks;
        int percentage = sumOfMarks * 100;
        double finalMarks = percentage / outOfMarks ;
        System.out.println("Final percentage of the student is " + finalMarks);
    }
}

