/**
 * Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
 * <p>
 * Example:
 * <p>
 * Input: exp = “[()]{}{[()()]()}”
 * Output: Balanced
 * <p>
 * Input: exp = “[(])”
 * Output: Not Balanced
 */

package Basic_To_Advanced_DataStructure.StackDS;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    static boolean res(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            String str = scanner.next();
            if (res(str))
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        }
    }
}
