package Java.X_Evaluation.Unit_II.Sprint_I;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class B_CountNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }
        res(n, names);
    }

    static void res(int n, String[] names) {
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < names.length; i++) {
            if (hashMap.containsKey(names[i])) {
                int count = hashMap.get(names[i]);
                count++;
                hashMap.put(names[i], count);
            } else {
                hashMap.put(names[i], 1);
            }
        }
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
