package Basic_To_Advanced_DataStructure.Final450.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintAllDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
//        res(n, str);
        resHashmap(str);
    }

    static void res(int n, String str) {
        int count = 0;
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) count++;
            }
            if (count > 1) {
                arrayList.add(str.charAt(i));
            }
        }
        for (Character character : arrayList) {
            System.out.print(character + " " + count);
        }
    }

    static void resHashmap(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i)))
                hashMap.put(str.charAt(i), 1);
            else
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
        }
        printingHashMap(hashMap);
    }

    private static void printingHashMap(HashMap<Character, Integer> hashMap) {
        for (Map.Entry map : hashMap.entrySet()){
            char key = (char) map.getKey();
            int value = (int) map.getValue();
            if (value>1)
                System.out.println(key + "- count - " + value);
        }
    }
}
