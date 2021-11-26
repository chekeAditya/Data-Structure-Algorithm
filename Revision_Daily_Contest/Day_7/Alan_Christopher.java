package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_7;

/**
 * Alan & Christopher -23:0:57
 * Description
 *
 * Its the year 1940, and the British along with the Allied forces, are being brutally assaulted on the battle field, by Hitler's Nazi Germany. The Britishers need to crack the secret communication that takes place between the German troops, with the help of their encryption device "Enigma". Alan Turing, the famous Mathematician, is assigned the task, to break the German encryption code, with his computer device "Christopher".
 *
 * The communication happens in the form of strings, and the strings are organized such that, given a string "S", when fed into a text editor "#" means backspace, on a conventional keyboard. Since, everyday, Britain is getting more behind in the war, Alan asks for your help. Help Alan, break the secret communication between German Troops.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 *
 * Input
 * The first line of the input contains T, the number of test cases. Each test case consists of a single line, which contains the encrypted string S.
 *
 *
 *
 * 0 <= length of string <= 100
 * 1 <= T <= 200
 * Sonly contain lowercase letters and'#'characters.
 *
 * Output
 * The output for each test case, is the decrypted string, on a new line.
 *
 *
 * Sample Input 1
 *
 * 2
 * ab#d
 * a#bc
 * Sample Output 1
 *
 * ad
 * bc
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringJoiner;

public class Alan_Christopher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            Stack<Character> stack = new Stack<>();
            String str = scanner.next();
            System.out.println(res(str, stack));
        }
    }

    static String res(String str, Stack<Character> stack) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else
                stack.add(str.charAt(i));
        }
        Iterator value = stack.iterator();
        while (value.hasNext()) {
            str1 += value.next();
        }
        return str1;
    }
}
/*
8
sgymjuuonkbk##oacv
lweagytvpzv#
yk#kk#n
#fho##zyn#bk#c#urbe
ca##mk#yqc
#m#ypi#y
un#c#demyk#djxq#
lysstuar
 */