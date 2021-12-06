package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_6;

/**
 * Check duplicate -23:18:21
 * Description
 *
 * Given an array of integers, check if it contains duplicate element. If present then print YES else print NO.
 *
 *
 * Input
 * 1<=T<=10
 *
 * 1<=N<=100000
 *
 * 1<=Ai<=100000
 *
 *
 * Output
 * output YES or NO as described for each test case.
 *
 *
 * Sample Input 1
 *
 * 3
 * 1
 * 1
 * 2
 * 1 1
 * 3
 * 1 2 3
 * Sample Output 1
 *
 * NO
 * YES
 * NO
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.println(res(n,arr));
        }
    }

    static String res(int n, int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(arr[i])) {
                int temp = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i], temp);
            } else
                hashMap.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > 1)
                return "YES";
        }
        return "NO";
    }
}
/*
3
1
1
2
1 1
3
1 2 3
 */
