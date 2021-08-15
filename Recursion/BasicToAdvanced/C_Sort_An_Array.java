/**
 * Sorting an Array using Recursion
 * Input :-
 4
 1 0 5 2
 * Output :-
 0 1 2 5
 */
package Basic_To_Advanced_DataStructure.Recursion.BasicToAdvanced;

import java.util.ArrayList;
import java.util.Scanner;

public class C_Sort_An_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
            arrayList.add(scanner.nextInt());
        sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
    }

    static void sort(ArrayList<Integer> arrayList) {
        if (arrayList.size() == 1) {
            return;
        }
        int temp = arrayList.get(arrayList.size() - 1);
        arrayList.remove(temp);
        sort(arrayList);
        insert(arrayList, temp);
    }

    private static void insert(ArrayList<Integer> arrayList, int temp) {
        if (arrayList.size() == 0 || arrayList.get(arrayList.size() - 1) <= temp) {
            arrayList.add(temp);
            return;
        }
        int val = arrayList.get(arrayList.size() - 1);
        insert(arrayList, temp);
        arrayList.add(val);
        return;
    }
}
/*
4
1 0 5 2
 */
