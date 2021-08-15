/**
 * Print number from n to 1 using Recursion
 * Print Number from 1 to n using Recursion
 */

package Basic_To_Advanced_DataStructure.Recursion.BasicToAdvanced;

import java.util.Scanner;

public class A_Print_1_To_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Number from 1 to N");
        ascendingOrder(n);
        System.out.println();
        System.out.println("Number from N to 1");
        descendingOrder(n);
    }

    //number from 1 to n
    static void ascendingOrder(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        ascendingOrder(n - 1);
        System.out.print(n + " ");
    }

    //number from n to 1
    static void descendingOrder(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        descendingOrder(n - 1);
    }

}
