package DataStructure.Collections;

import java.util.HashMap;
import java.util.Map;

public class C_Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();        //it's expecting two value key and value
        hashMap.put("Aditya", 883040);
        hashMap.put("karan", 822345);
        hashMap.put("ashish", 822345);
        hashMap.put("prajwal", 822345);

        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println("Key is :- " + map.getKey() + " " + "Phone number/Value is :- " + map.getValue());
        }

    }
}


/*
 * For order you can use linked hashmaps
 * Main difference between array and collection is Arrays are fixed in size whereas collection are dynamic in size
 * it the key is repeated and value too then it will print only one
 * it the key is repeated and value changing then it will print the last one i.e which has been overwritten
 * you cannnot have two key in the hashmap it will overwrite the existing value
 */