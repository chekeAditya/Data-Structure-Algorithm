package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_2;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            res(n, arr);
        }
    }

    static void res(int n, int[] arr) {
        int[] arr1 = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.empty()) {
                while (!stack.empty() && stack.peek() <= arr[i])
                    stack.pop();
            }
            arr1[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr1[i] + " ");
    }
}

