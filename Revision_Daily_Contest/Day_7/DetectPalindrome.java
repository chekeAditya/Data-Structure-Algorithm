package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_7;


/*
Detect Palindrome II -1:44:13
Description

You are given a string S. Find if the string, can be converted into a palindrome.

You are free to rearrange the string in any way you want. Rearrangement refers to the fact that the characters can be arranged in any way in the string.

Deletion or addition of characters is not allowed.


Input
The first line contains T, the number of test cases.

The first line of each test case contains N, the length of the string.

The next line contains the string.

Constraints

1 <= T <= 10

1 <= N <= 100


Output
If the string can be rearranged into a palindrome, print "Possible!", else print "Not Possible!".


Sample Input 1

2
6
aabbcc
5
aabcd
Sample Output 1

Possible!
Not Possible!
Hint

In the first sample test case, the string can be rearranged as "acbca", which is a palindrome.

In the second sample test case, the string cannot be rearranged into a palindrome.

 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DetectPalindrome {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String str = scanner.next();
            System.out.println(res(n, str));
        }
    }

    static String res(int n, String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                int temp = hashMap.get(str.charAt(i)) + 1;
                hashMap.put(str.charAt(i), temp);
            } else
                hashMap.put(str.charAt(i), 1);
        }
        count = 0;
        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            if (map.getValue() % 2 != 0) {
                count++;
            }
        }
        if (count >= 2)
            return "Not Possible!";
        else
            return "Possible!";
    }
}