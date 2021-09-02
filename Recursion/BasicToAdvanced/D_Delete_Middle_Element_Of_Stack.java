/**
 * Removing the Middle element from the stack
 * Input :-
4 2
1 2 3 4
 * Output :-
1 3 4
 */

package Basic_To_Advanced_DataStructure.Recursion.BasicToAdvanced;

import java.util.Scanner;
import java.util.Stack;

public class D_Delete_Middle_Element_Of_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        //taking input in the stack
        while (n-- > 0) {
            stack.push(scanner.nextInt());
        }
        removeMiddleElement(n, stack, k);
        //printing stack
        for (int i = 0; i < stack.size(); i++)
            System.out.print(stack.get(i) + " ");
    }

    static Stack<Integer> removeMiddleElement(int n, Stack<Integer> stack, int k) {
        if (stack.size() == 0)
            return stack;
        k = stack.size() / 2 + 1;
        solve(stack, k);
        return stack;
    }

    private static void solve(Stack<Integer> stack, int k) {
        if (k == 1) {
            stack.pop();
            return;
        }
        int temp = stack.peek();
        stack.pop();
        solve(stack, k - 1);
        stack.push(temp);

    }
}
