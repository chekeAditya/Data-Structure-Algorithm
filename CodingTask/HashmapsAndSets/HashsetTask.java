package Basic_To_Advanced_DataStructure.CodingTask.HashmapsAndSets;

import java.util.HashSet;

public class HashsetTask {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("India");
        hashSet.add("Pak");
        hashSet.add("China");
        hashSet.add("India");
        hashSet.add("Aus");
        hashSet.add("Pak");
        hashSet.add("Japan");
        printAllElement(hashSet);
        System.out.println("----------------");
        elementLengthGreaterThan3(hashSet);
        System.out.println("----------------");
        removeElement(hashSet);
    }

    private static void printAllElement(HashSet<String> hashSet) {
        for (String i : hashSet) {
            System.out.println(i);
        }
    }

    private static void elementLengthGreaterThan3(HashSet<String> hashSet) {
        for (String i : hashSet) {
            if (i.length() > 3) {
                System.out.println(i);
            }
        }
    }

    private static void removeElement(HashSet<String> hashSet) {
        for (String i : hashSet) {
            if (i.equals("India")) {
                hashSet.remove(i);
            }else System.out.println(i);
        }
    }
}
