package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.*;

public class G_Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int t = 0; t < 3; t++) {
            String element1 = scanner.next();
            String element2 = scanner.next();
            HashMap<Character, Integer> hashMap = new HashMap<>();


            for (int i = 0; i < element1.length(); i++) {
                char a = element1.charAt(i);
                if (a != ' ') {
                    if (hashMap.containsKey(a)) {
                        int count = hashMap.get(a);
                        hashMap.put(a, ++count);
                    } else {
                        hashMap.put(a, 1);
                    }
                }
            }
            for (int i = 0; i < element2.length(); i++) {
                char b = element2.charAt(i);
                if (b != ' ') {
                    if (hashMap.containsKey(b)) {
                        int count = hashMap.get(b);
                        hashMap.put(b, --count);
                    } else {
                        System.out.println("False");
                        return;
                    }
                }
            }
            for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
                if (map.getValue() != 0) {
                    System.out.println("False");
                    return;
                }
            }
            System.out.println("True");
        }
    }
}

/*
listen silent
here heir
wind dwine
 */
