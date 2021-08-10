package Basic_To_Advanced_DataStructure.Recursion.LearningCodes;

import java.util.Scanner;

public class A_Print_In_Ascending_And_Descending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Printing in Descending way");
        res(n);
        System.out.println();
        System.out.println("Printing in Ascending way");
        res1(n);
    }

    //    printing in descending manner
    static void res(int n) {
        if (n <= 0) {
            return;
        } else {
            System.out.print(n + " ");
            res(n - 1);
        }
    }

    //    printing in Ascending manner
    static void res1(int n) {
        if (n <= 0) {
            return;
        } else {
            res1(n - 1);
            System.out.print(n + " ");
        }
    }
}
