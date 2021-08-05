package Basic_To_Advanced_DataStructure.Recursion;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(res(n));
    }

    static int res(int n) {
        if (n <= 1) {
            return n;
        } else {
            return res(n - 1) + res(n - 2);
        }
    }
}
