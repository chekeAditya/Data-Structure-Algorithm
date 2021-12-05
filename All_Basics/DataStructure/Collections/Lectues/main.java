package DataStructure.Collections.Lectues;

import java.util.LinkedHashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("aditya", 82929028);
        hashMap.put("cheke", 2352345);

        String name = "cheke";

        for (Map.Entry<String, Integer> shubhum : hashMap.entrySet()) {
            if (shubhum.getKey() == name ) {
                System.out.println(shubhum.getValue());
            }
        }
    }
}

