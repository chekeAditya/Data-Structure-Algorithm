package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_2;

/**
 * Anagram Pairs Ended
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

public class AnagramsPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String[] ar = new String[n];
            for (int i = 0; i < n; i++) {
                ar[i] = scanner.next();
            }
            System.out.println(res(ar));
        }
    }

    static int res(String[] arr) {
        int count = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : arr) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if (hashMap.containsKey(str)) {
                hashMap.put(str, hashMap.get(str) + 1);
            } else {
                hashMap.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            count = count + (map.getValue() * (map.getValue() - 1)) / 2;
        }
        return count;
    }
}
