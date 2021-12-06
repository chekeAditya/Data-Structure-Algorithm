package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_7;

/*
Infix to Postfix -2:15:25
Description

You are given an infix expression, you need to convert it to a postfix expression.

Infix expression is an expression that is in the form of (a operator b). eg. a + b, a * b.

Postfix expression is an expression that is in the form of (a b operator). eg. a b +, a b *.


Input
Input Format

First-line of input contains the infix expression

Constraints

Number of the operands<=26


Output
Print the postfix expression


Sample Input 1

a+b-c+d*(e-f)/g+(h*(i/j))
Sample Output 1

ab+c-def-*g/+hij/*+
 */
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix_Problem {

    static int res1(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(res(str));
    }

    static String res(String str) {
        StringBuilder str1 = new StringBuilder("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); ++i) {
            char convert = str.charAt(i);
            if (Character.isLetterOrDigit(convert))
                str1.append(convert);
            else if (convert == '(')
                stack.push(convert);
            else if (convert == ')') {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    str1.append(stack.pop());
                stack.pop();
            } else {
                while (!stack.isEmpty() && res1(convert)
                        <= res1(stack.peek())) {
                    str1.append(stack.pop());
                }
                stack.push(convert);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            str1.append(stack.pop());
        }
        return str1.toString();
    }

}
