package Basic_To_Advanced_DataStructure.Revision;

import java.util.Scanner;
import java.util.Stack;

public class Seperation_Of_odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            Stack<Integer> stackMain = new Stack<>();
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) stackMain.add(scanner.nextInt());
            int k = scanner.nextInt();
            res(n, arr, k, stackMain);
        }
    }

    static void res(int n, int[] arr, int k, Stack<Integer> stackMain) {
        Stack<Integer> stackOdd = new Stack<>();
        Stack<Integer> stackEven = new Stack<>();
        if (k == 1) {
            for (Integer integer : stackMain) {
                if (integer % 2 == 0) stackEven.add(integer);
                else stackOdd.add(integer);
            }
            for (Integer integer : stackEven) {
                System.out.print(integer + " ");
            }
            for (Integer integer : stackOdd) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

        if (k == 2) {
            for (Integer integer : stackMain) {
                if (integer % 2 == 0) stackEven.add(integer);
                else stackOdd.add(integer);
            }
            for (Integer integer : stackOdd) {
                System.out.print(integer + " ");
            }
            for (Integer integer : stackEven) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
