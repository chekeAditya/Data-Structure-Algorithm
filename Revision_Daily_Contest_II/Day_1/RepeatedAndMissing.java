package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_1;
/**
 Repeated and Missing -7:59:35
 Description

 Given an array of size n. Array elements are in the range from 1 to n. In the given array, one number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

 Print the missing one first and then the repeated one with a space character in between them.

 Expected Auxillary Space Complexity - O(1)


 Input
 The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

 The first line of each test case contains a single integer n (2 ≤ n ≤ 100000).

 The second line of the test case contains n integers (1 ≤ Ai ≤ n).


 Output
 For each test case, print the answer.


 Sample Input 1

 3
 5
 1 2 3 3 4
 2
 1 1
 3
 1 2 2
 Sample Output 1

 5 3
 2 1
 3 2
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedAndMissing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            res1(arr, n);
        }
    }

    static void res1(int[] arr, int size) {
        int repeating_number = 0, missing_number = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (Integer i : arr) {
            if (hashMap.get(i) == null) {
                hashMap.put(i, 1);
            } else
                repeating_number = i;
        }
        for (int i = 1; i <= arr.length; i++) {
            if (hashMap.get(i) == null) {
                missing_number = i;
            }
        }
        System.out.println(missing_number + " " + repeating_number);
    }
}
