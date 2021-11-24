package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_5;

import java.util.Scanner;
import java.util.Stack;

/**
 * String Challenge
 * Have the function StringChallenge(str) take the str parameter being passed and return the smallest number you can get through the following reduction method. The method is: Only the letters a, b, and c will be given in str and you must take two different adjacent characters and replace it with the third. For example "ac" can be replaced with "b" but "aa" cannot be replaced with anything. This method is done repeatedly until the string cannot be further reduced, and the length of the resulting string is to be outputted.
 * <p>
 * For example: if str is "cab", then "ca" can be reduced to "b" and you get "bb" (you can also reduce it to "cc"). The reduction is done so the output should be 2. If str is "bcab", "bc" reduces to "a", so you have "aab", then "ab" reduces to "c", and the final string "ac" is reduced to "b" so the output should be 1.
 * Examples
 * Input: "abcabc"
 * Output: 2
 * Input: "cccc"
 * Output: 4
 */

public class F_StringChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(res(str));
    }

    static int res(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(str.charAt(i));
            } else if (!stack.peek().equals(str.charAt(i))) {
                if (stack.peek() == 'a' && str.charAt(i) == 'b') {
                    stack.pop();
                    stack.add('c');
                }else if (stack.peek() == 'b' && str.charAt(i) == 'a'){
                    stack.pop();
                    stack.add('c');
                }else if (stack.peek() == 'a' && str.charAt(i) == 'c'){
                    stack.pop();
                    stack.add('b');
                } else if (stack.peek() == 'a' && str.charAt(i) == 'c'){
                    stack.pop();
                    stack.add('b');
                } else if (stack.peek() == 'b' && str.charAt(i) == 'c'){
                    stack.pop();
                    stack.add('a');
                }else if (stack.peek() == 'c' && str.charAt(i) == 'b'){
                    stack.pop();
                    stack.add('a');
                }
            }else {
                stack.add(str.charAt(i));
            }
        }
        return stack.size();
    }
}
