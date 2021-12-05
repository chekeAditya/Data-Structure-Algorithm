package Java.D_Taking_Input;

import java.util.Scanner;

public class G_MarksSUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sub1 = scanner.nextInt();
        int sub2 = scanner.nextInt();
        int sub3 = scanner.nextInt();
        int sub4 = scanner.nextInt();
        int sub5 = scanner.nextInt();
        int sub6 = scanner.nextInt();
        double average = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6) / 6;
        System.out.println("Average is " +average);
    }
}
