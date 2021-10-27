package Basic_To_Advanced_DataStructure.StackDS;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * Just find minimum -9423:39:22
 * Description
 * <p>
 * You are given N which is the number of different types of operation you need to perform on a stack. There are 3 different types of operations:
 * <p>
 * PUSH V: Here V is an integer which you need to push in the stack
 * <p>
 * POP: Here POP out the top element from stack. (In case stack is empty print "EMPTY")
 * <p>
 * MIN: Print the minimum value present in the stack
 * <p>
 * <p>
 * Input
 * Input Format
 * <p>
 * First line contains N which is the number of operations you need to perform on stack
 * <p>
 * Next N line contains one of the 3 operations mentioned above
 * <p>
 * Constraints
 * <p>
 * N < 1000000
 * <p>
 * V < 100
 * <p>
 * <p>
 * <p>
 * <p>
 * Output
 * Output Format
 * <p>
 * The output consists of a line containing an integer with the smallest present value in the stack for queries of type "MIN" or "EMPTY" for "MIN" and "POP" operations when the stack is empty.
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 11
 * PUSH 5
 * PUSH 7
 * PUSH 3
 * PUSH 8
 * PUSH 10
 * MIN
 * POP
 * POP
 * MIN
 * POP
 * MIN
 * Sample Output 1
 * <p>
 * 3
 * 3
 * 5
 */
public class JustFindMinimum {

    static int min, min2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        HashMap<String,Integer> hashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        int t = scanner.nextInt();
        while (t-- > 0) {
            String str = scanner.next();
            switch (str) {
                case "PUSH":
                    pushFunction(scanner, stack);
                    break;
                case "POP":
                    popFunction(stack);
                    break;
                case "MIN":
                    printFunction(stack);
                    break;
            }
        }
    }

    private static void pushFunction(Scanner scanner, Stack<Integer> stack) {
        int n = scanner.nextInt();
        stack.push(n);
        min = stack.firstElement();
        if (stack.peek() < min) {
            min = stack.peek();
        }
    }

    private static void printFunction(Stack<Integer> stack) {
        int min = stack.firstElement();
        int start = 0;
        if (stack.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            System.out.println(min);
        }
    }

    private static void popFunction(Stack<Integer> stack) {
        stack.pop();
    }
}
/*

 */
