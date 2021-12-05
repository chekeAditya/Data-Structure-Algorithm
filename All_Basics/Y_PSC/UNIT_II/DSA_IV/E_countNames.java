package Y_PSC.UNIT_II.DSA_IV;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E_countNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        Arrays.sort(arr);
        res(arr);
    }

    static void res(String[] arr) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (String key : arr) {
            if (linkedHashMap.containsKey(key)) {
                int count = linkedHashMap.get(key);
                linkedHashMap.put(key, ++count);
            } else {
                linkedHashMap.put(key, 1);
            }
        }
        for (Map.Entry<String, Integer> map : linkedHashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}