package Basic_To_Advanced_DataStructure.StackDS;

import java.util.HashMap;
import java.util.Scanner;

public class C_Majority_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            System.out.println(bruteForceMethod(n,arr));
        }
    }

    //using brute-force
    static int bruteForceMethod(int n, int[] arr) {
        int count = 0, count1 = 0, number = 0;
        for (int k : arr) {
            count = 0;
            for (int i : arr) {
                if (k == i) {
                    count++;
                }
                if (count > count1) {
                    count1 = count;
                    number = k;
                }
            }
        }
        if (count1 > n / 2) return number;
        else return -1;
    }

    //using hashmap
    static int hashmapMethod(int n, int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int count = hashMap.get(arr[i]);
                count++;
                hashMap.put(arr[i], count);
            } else hashMap.put(arr[i], 1);
        }
        return -1;
    }
}
