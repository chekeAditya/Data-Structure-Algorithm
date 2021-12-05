package Java.N_ObjectsAndCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOFIntegerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element :");
        int n = scanner.nextInt();
        System.out.println("Enter the element :");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }

        int count = 0;
        String name = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j && arrayList.get(i) == arrayList.get(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
