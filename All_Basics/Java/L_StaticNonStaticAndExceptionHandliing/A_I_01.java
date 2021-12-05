package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.LinkedHashMap;
import java.util.Map;

public class A_I_01 {
    public static void main(String[] args) {
        String[] names = {"Masai", "School"};
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>(); //object
//LinkedHashMap is the hashmap but it will arranged it the format


        //logic`
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                if (hashMap.containsKey(names[i].charAt(j))) {
                    int count = hashMap.get(names[i].charAt(j));
                    hashMap.put(names[i].charAt(j), ++count);     //count++ :- it won't work but in ++count it will work fine

                } else {
                    hashMap.put(names[i].charAt(j), 1);
                }
            }
        }

        for (Map.Entry<Character,Integer> map : hashMap.entrySet()){
            System.out.println(map.getKey() + "-" + map.getValue());
        }
    }
}
