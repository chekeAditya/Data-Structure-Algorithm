package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_6;

/**
 * Anagram Pairs -0:23:59
 * Description
 *
 * Given n strings S1, S2, ... , Sn. Find the number of pairs i,j where i<j and i and j both range from 1 to n such that Si is an anagram of Sj.
 *
 *
 * Input
 * The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.
 *
 * The first line of each test case contains a single integer n (1 ≤ n ≤ 100000).
 *
 * The next n lines of each test case contain a string Si whose length is 10.
 *
 *
 * Output
 * For each test case, print the answer: The number of pairs.
 *
 *
 * Sample Input 1
 *
 * 2
 * 5
 * aaaaabbbbb
 * baabbbbaaa
 * aaaabbbbba
 * xxxxxxxxxy
 * yxxxxxxxxx
 * 2
 * abcdefghij
 * jighdefabc
 * Sample Output 1
 *
 * 4
 * 1
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramPairs {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
            }
            HashMap<String, Integer> hash = new HashMap<>();
            count = 0;
            for (String s : arr) {
                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                String str = new String(ch);
                if (hash.containsKey(str))
                    hash.put(str, hash.get(str) + 1);
                else
                    hash.put(str, 1);
            }
            for (Map.Entry<String, Integer> map : hash.entrySet())
                count = count + (map.getValue() * (map.getValue() - 1)) / 2;
            System.out.println(count);
        }
    }
}
/*
2
5
aaaaabbbbb
baabbbbaaa
aaaabbbbba
xxxxxxxxxy
yxxxxxxxxx
2
abcdefghij
jighdefabc

 */