package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_7;
/*
Strings with Parenthesis -2:4:3
Description

Given a string containing three types of parenthesis : (), [], {}, write a program to check whether the string contains a valid sequence of parentheses.


Input
Input Format

Input contains one line which is the string with parentheses whose validity you have to check

Constraints

length of string <= 1000


Output
Output Format

Print "balanced" (without quotes) if it has a sequence of valid parentheses, otherwise print "unbalanced" (without quotes)


Sample Input 1

(((((((((())))))))))
Sample Output 1

balanced
Sample Input 2

[one[two[three[four[five[six[seven[eight[nine[ten]]]]]]]]]]
Sample Output 2

balanced
 */
import java.util.Scanner;
import java.util.Stack;

public class StringWithParanthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(res(str));
    }

    static String res(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' ||
                    str.charAt(i) == '[' ||
                    str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' ||
                    str.charAt(i) == ']' ||
                    str.charAt(i) == '}') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }else
                    return "unbalanced";
            }
        }
        return "balanced";
    }
}
