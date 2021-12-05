package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.ArrayList;
import java.util.Scanner;

public class I_FindArrayPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = {8, 4, 6, 2, 1, 3};
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter number of element");
        int n = scanner.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }

        System.out.println("Sum should be");
        int sum = scanner.nextInt();
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                try {
                    if (arrayList.get(i) + arrayList.get(j) == sum) {
                        n1 = arrayList.get(i);
                        n2 = arrayList.get(j);
                        System.out.println("Pair :- " + "(" + n1 + "," + n2 + ")");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

