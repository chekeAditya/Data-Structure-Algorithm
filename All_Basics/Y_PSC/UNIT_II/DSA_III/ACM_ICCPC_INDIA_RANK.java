package Y_PSC.UNIT_II.DSA_III;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ACM_ICCPC_INDIA_RANK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
        res(N, arr);
    }

    static void res(int N, String[] arr) {
        int count = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                count = hashMap.get(arr[i]);
                hashMap.put(arr[i], count);
            } else {
                hashMap.put(arr[i], count++);
            }
        }
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getKey().equals("India")) {
                System.out.println(map.getValue());
            }
        }
    }
}
