package Y_PSC.UNIT_II.DSA_I;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C_MaximumOccuringElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(res(n,arr));
    }

    static int res(int n, int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = array[i];
            if (hashMap.containsKey(key)) {
                int count = hashMap.get(key);
                count++;
                hashMap.put(key, count);
            } else {
                hashMap.put(key, 1);
            }
        }
        int max_count = 0, res = -1;
        for (Map.Entry<Integer, Integer> val : hashMap.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        return res;
    }
}
/**
 * Maximum Occurring Element
 * Description
 *
 * Given an array A of N integers. Your task is to print that integer which presents maximum number of times in the given array.
 *
 * If there are two elements present the maximum number of times, print the one which comes first in the array.
 *
 *
 * Input
 * Input Format
 *
 * First line contains N
 *
 * The second line contains N integers separated by spaces.
 *
 * Constraints
 *
 * N < 100
 *
 * The array contains integers only
 *
 *
 * Output
 * Print one integer, the one which is present the maximum number of times.
 *
 *
 * Sample Input 1
 *
 * 5
 * 0 2 0 6 9
 * Sample Output 1
 *
 * 0
 * Hint
 *
 * Sample 1 Explanation
 *
 * Since 0 is present the maximum number of times (2 times) => The answer is 0
 */
