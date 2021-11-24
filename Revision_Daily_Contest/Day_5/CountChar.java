package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_5;

/**
 * Count Chars -0:30:18
 * Description
 *
 * You are provided a string S. Your task is to print a string which also contains the number of times that character is repeated. (Read explanation of test case for better understanding)
 *
 *
 * Input
 * Input Format :
 * First and the only line contains the string S.
 *
 *
 *
 * Constraints :
 *
 * Length of S is always lesser than 100
 *
 *
 * Output
 * Output one string.
 *
 * Read sample test case and explanation for better understanding.
 *
 *
 * Sample Input 1
 *
 * aaabbbbcc
 * Sample Output 1
 *
 * a3b4c2
 * Hint
 *
 * Output Explanation :
 *
 * In the given string, character 'a' is repeated 3 times.=>a3
 *
 * Character 'b' is repeated 4 times =>b4
 *
 * Character 'c' is repeated 2 times =>c2
 *
 * So, you have to print "a3b4c2" (without quotes).
 */

import java.util.Scanner;
import java.util.Stack;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        res(str);
    }

    static void res(String str) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(str.charAt(i));
                count++;
            } else if (stack.peek().equals(str.charAt(i))) { //i = 2
                count++;
            } else if (!stack.peek().equals(str.charAt(i))) {
                System.out.print(stack.peek() + "" + count);
                count = 0;
                stack.add(str.charAt(i));
                count++;
            }
            if (i == str.length() - 1 && count >0){
                System.out.println(stack.peek() + "" + count);
            }
        }
    }
}
/*
aaabbbbcc
 */
