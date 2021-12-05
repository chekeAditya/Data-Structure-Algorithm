/*
Description

You are provided with a sentence S, your task is to write a program that reverses the order/sequence in which words are present in the sentence keeping the case of each character preserved (upper case character should remain upper and lower case character is lower case). (Refer to the sample test case for better understanding)

Try using the stack data structure

DO NOT ANY BUILT-IN FUNCTION FOR REVERSING A STRING


Input
Input Format

You are provided with a sentence having one or more than one word.

Constraints

At least one word is present in the string




Output
Output the sentence by reversing the sequence of words


Sample Input 1

A Transformation in education
Sample Output 1

education in Transformation A
Hint

Sample 1 Explanation

The sentence has been reversed in the sense that the sequence in which the words were present in the initial sentence is reversed.

Also, there is no change in the case of characters present in the sentence.

 */
package Y_PSC.UNIT_I.DSA_V;

import java.util.Scanner;

public class A_PSC_01_MasaiSentenceReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] s = S.split(" ");
        String reverse = "";
        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1) {
                reverse = s[i] + reverse;
            }else {
                reverse = " " + s[i] + reverse;
            }
        }
        System.out.println(reverse);
    }
}

/**
Count Consonant
Description

You are provided a string S. Your task is to write a program that counts the number of consonants (non-vowels characters) present in the string.


Input
Input Format:

First-line contains a string S

Constraints:

Length of String is always lesser than 1000


Output
Output one number which is the count of number of consonants present in the string.


Sample Input 1

masaischool
Sample Output 1

6
 */