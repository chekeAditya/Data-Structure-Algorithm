package Y_PSC.UNIT_II.DSA_II;

import java.util.*;

public class A_Detect_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int N = scanner.nextInt();
            String S = scanner.next();
            if (res(N, S)) System.out.println("Possible!");
            else System.out.println("Not Possible!");
        }
    }

    static boolean res(int N, String S) {
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (arrayList.contains(S.charAt(i)))
                arrayList.remove((Character) S.charAt(i));
            else
                arrayList.add(S.charAt(i));
        }
        if (S.length() % 2 == 0 && arrayList.isEmpty() || (S.length() % 2 == 1 && arrayList.size() == 1))
            return true;
        else
            return false;
    }
}
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        char[] strArray = S.toCharArray();
//        for (char count : strArray) {
//            if (hashMap.containsKey(count)) {
//                hashMap.put(count, hashMap.get(count) + 1);
//            } else {
//                hashMap.put(count, 1);
//            }
//        }
//
//        for (Map.Entry entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }
//}

//        HashMap<String, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (hashMap.containsKey(arr[i])) {
//                int count = hashMap.get(arr[i]);
//                count++;
//                hashMap.put(arr[i], count);
//            } else {
//                hashMap.put(arr[i], 1);
//            }
//        }
//        int max_count = 0;
//        String res = "";
//        for (Map.Entry<String, Integer> val : hashMap.entrySet()) {
//            if (max_count == val.getValue()) {
//                res = val.getKey();
//                max_count = val.getValue();
//            }
//        }
//        System.out.println(res);
//    }
//}
/*
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
 */
