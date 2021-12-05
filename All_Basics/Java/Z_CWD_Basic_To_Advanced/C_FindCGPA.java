package Java.Z_CWD_Basic_To_Advanced;

import java.util.Scanner;

public class C_FindCGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sub1, sub2, sub3, percentage, outOfMarks;
        sub1 = scanner.nextInt();
        sub2 = scanner.nextInt();
        sub3 = scanner.nextInt();
        outOfMarks = scanner.nextInt();
        percentage = (sub1 + sub2 + sub3 /  outOfMarks)  * 100d;
        double cgpa = percentage / 9.5d;
        System.out.println(cgpa);
    }
}
