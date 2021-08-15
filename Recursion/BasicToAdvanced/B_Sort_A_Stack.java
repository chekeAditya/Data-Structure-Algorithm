/**
 * Sorting a stack using Recursion
 * Input :-
 4
 1 0 5 2
 * Output :-
 0 1 2 5
 */

package Basic_To_Advanced_DataStructure.Recursion.BasicToAdvanced;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class B_Sort_A_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        sort(stack);
        for (int i = 0; i < stack.size(); i++)
            System.out.print(stack.get(i) + " ");
    }

    static void sort(Stack<Integer> s) {
        if (s.size() == 1) {
            return;
        }
        int temp = s.peek();
        s.pop();
        sort(s);
        insert(s, temp);
    }

    static void insert(Stack<Integer> s, int temp) {
        if (s.size() == 0 || s.peek() <= temp) {
            s.push(temp);
            return;
        }
        int val = s.peek();
        s.pop();
        insert(s, temp);
        s.push(val);
        return;
    }
}
/*
4
1 0 5 2
 */
