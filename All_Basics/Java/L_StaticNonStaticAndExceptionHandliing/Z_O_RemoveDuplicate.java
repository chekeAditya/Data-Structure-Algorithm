package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Z_O_RemoveDuplicate {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            hashSet.add(scanner.nextInt());
        }
        removeDuplicate(n,hashSet);
    }

    static void removeDuplicate(int n, HashSet<Integer> hashSet) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            int data = (int) iterator.next();
            arrayList.add(data);
        }
        System.out.println(arrayList);
    }
}
