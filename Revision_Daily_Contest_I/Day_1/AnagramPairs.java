package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_1;

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
            System.out.println(res(arr));
        }
    }

    static int res(String[] arr) {
        HashMap<String, Integer> hash = new HashMap<>();
        for (String s : arr) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if (hash.containsKey(str)) {
                hash.put(str, hash.get(str) + 1);
            } else {
                hash.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> map : hash.entrySet()) {
            count = count + (map.getValue() * (map.getValue() - 1)) / 2;
        }
        return count;
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
