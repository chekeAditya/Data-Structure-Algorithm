package Basic_To_Advanced_DataStructure.CodingTask.HashmapsAndSets;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Sudarshan", 1);
        hashMap.put("Prachi", 2);
        hashMap.put("Shubhum", 3);
        hashMap.put("Arya", 4);
        hashMap.put("Amol", 5);
        printHashMapElement(hashMap);
        System.out.println("-------------------");
        printElementLengthGreaterThan5(hashMap);
        System.out.println("-------------------");
        printAllElementLengthGreaterThan6(hashMap);
    }

    static void printHashMapElement(HashMap<String, Integer> hashMap) {
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println(map);
        }
    }

    static void printElementLengthGreaterThan5(HashMap<String, Integer> hashMap) {
        System.out.println("Roll number whose key length is greater than 5 are:- ");
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getKey().length() > 5) {
                System.out.println(map.getValue());
            }
        }
    }

    static void printAllElementLengthGreaterThan6(HashMap<String, Integer> hashMap) {
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getKey().length() <= 6) {
                System.out.println(map);
            }
        }
    }
}
