package Y_PSC.UNIT_I.DSA_V;

import java.util.Scanner;

public class C_PSC_03_SubstringUnderCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)){
                    System.out.print(S.charAt(i));
                }
                System.out.println();
            }
        }
        System.out.println(count);
    }
}
/**
Substring under condition
Description

Given a string S, you need to find the count of all contiguous substrings starting and ending with same character.


Input
Input Format :

First and the only line contains a string S

Constraints:

Length of S <= 1000


Output
Output the count


Sample Input 1

abcab
Sample Output 1

7
 */
