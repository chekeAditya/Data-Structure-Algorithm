package Basic_To_Advanced_DataStructure.Array;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        }
    }

//    static int res(int n, int[] arr) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (!hashMap.containsKey(arr[i])) {
//                hashMap.put(arr[i], 1);
//            } else {
//                int count = hashMap.get(arr[i]);
//                hashMap.put()
//            }
//        }
//    }
}
/*
6
1 1 1 1 2 3
 */
