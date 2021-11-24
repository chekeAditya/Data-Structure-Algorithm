package Basic_To_Advanced_DataStructure.Revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(res(n, arr));
        }
    }
    //logic
    static int res(int n, int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(arr[i])) {
                int number = hashMap.get(arr[i]);
                number++;
                hashMap.put(arr[i], number);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        int temp = 0, result = 0;
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            int value = map.getValue();
            if (value > temp) {
                temp = map.getValue();
                result = map.getKey();
            }
        }

        if (checkNumber(n, temp)) {
            return result;
        } else return -1;
    }


    private static boolean checkNumber(int i, int temp) {
        return temp > i / 2;
    }
}
/*
2
6
1 1 1 1 2 3
5
1 1 2 2 3
 */