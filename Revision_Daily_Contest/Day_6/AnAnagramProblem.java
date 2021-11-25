package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_6;

/**
 * An Anagram Problem -0:24:20
 * Description
 *
 * Given an integer n, we have n strings of length 4. Now we have to remove all those strings which is an anagram of previously appeared string.
 *
 * Print the final number of strings left and the strings after the required execution. See the sample testcase for I/O clarifications.
 *
 * Note -The final vector of strings is sorted.
 *
 *
 * Input
 * The first line contains a single integer n (1 ≤ n ≤ 100000).
 *
 * The next n lines contain a string Si whose length is 4.
 *
 *
 * Output
 * For each test case, print the answer.
 *
 *
 * Sample Input 1
 *
 * 5
 * eodc
 * odec
 * code
 * baca
 * aabc
 * Sample Output 1
 *
 * 2
 * baca
 * eodc
 */


import java.util.*;

public class AnAnagramProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> hashmap = new HashMap<>();
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
            char[] ch = arr[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if (hashmap.containsKey(str)) {
                hashmap.put(str, hashmap.get(str) + 1);
            } else {
                hashmap.put(str, 1);
                arrayList.add(arr[i]);
            }
        }
        System.out.println(hashmap.size());
        Collections.sort(arrayList);

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
