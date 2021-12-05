package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.*;

public class E_UniqueElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] element = {10, 20, 30, 20, 10, 40};
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(scanner.nextInt(),scanner.nextInt());
        }

        int count = 0;
        //logic
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(element[i])) {
                count = hashMap.get(element[i]);
                hashMap.put(element[i], ++count);
            } else {
                hashMap.put(element[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() == 1) {
                System.out.println(map.getKey());
            }
        }
    }
}

