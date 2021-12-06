package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_1;

/**
 * Pasha and Shasha and valid anagram -1:35:21
 * Description
 * <p>
 * Pasha and Shasha are fighting over two strings, whether they are anagrams or not, help them.
 * <p>
 * <p>
 * Input
 * 1<=T<=10
 * <p>
 * next 2T lines consists of strings s1 and s2 for each test case
 * <p>
 * 1<=S1<=100000
 * <p>
 * 1<=S2<=100000
 * <p>
 * <p>
 * Output
 * output True if they are anagrams else False;
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 2
 * abcd
 * dcab
 * aa
 * aaa
 * Sample Output 1
 * <p>
 * True
 * False
 */

import java.util.HashMap;
import java.util.Scanner;

public class PashaShasha_Anagram {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println(res(str1, str2));
        }
    }

    static String res(String str1, String str2) {
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (hashMap1.containsKey(str1.charAt(i))) {
                count = str1.charAt(i);
                count++;
                hashMap1.put(str1.charAt(i), count);
            } else {
                hashMap1.put(str1.charAt(i), 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (hashMap2.containsKey(str2.charAt(i))) {
                count = str2.charAt(i);
                count--;
                hashMap2.put(str2.charAt(i), count);
            } else {
                hashMap2.put(str2.charAt(i), 1);
            }
        }

        if (hashMap1.equals(hashMap2))
            return "True";
        else
            return "False";
    }
}
/*
1
iuuyyxjjxb
nhurlyuzmo
 */
