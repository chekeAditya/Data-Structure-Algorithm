package Basic_To_Advanced_DataStructure.Recursion.BasicToAdvanced;

import java.util.Scanner;
import java.util.Stack;

public class E_Reverse_A_Stack_Using_Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = scanner.nextInt();
        while (n-- > 0) {
            stack.push(scanner.nextInt());
        }
        //calling function
        reverse(stack);
        for (Integer integer : stack) System.out.print(integer + " ");
    }

    static void reverse(Stack<Integer> stack) {
        if (stack.size() == 1) return;
        int temp = stack.peek();
        stack.pop();
        reverse(stack);
        insert(stack, temp);
    }

    static void insert(Stack<Integer> stack, int element) {
        if (stack.size() == 0) {
            stack.push(element);
            return;
        }
        int temp = stack.peek();
        stack.pop();
        insert(stack, temp);
        stack.push(temp);
    }
}
/*
5
1 2 3 4 5
 */
