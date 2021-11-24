package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_3;

import java.util.Scanner;
import java.util.Stack;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            res(n,arr);
        }
    }


    static void res(int n, int[] arr) {

    }
}
