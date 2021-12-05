package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.ArrayList;
import java.util.Scanner;

public class R_IntersectionOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
//        System.out.println(arrayList);
        for (int j = 0; j < n; j++) {
            arrayList1.add(scanner.nextInt());
        }
//        System.out.println(arrayList1);
        intersectionOfArray(n, arrayList, arrayList1);
    }

    static void intersectionOfArray(int n, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1) {
        int num = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList1.size(); j++) {
                if (arrayList.get(i) == arrayList1.get(j)) {
                    num = arrayList.get(i);
                }
            }
        }
        System.out.println(num);
    }
}
/*
21 10 30 11 90 -56 8 56 7 0 1
56 2 2 2 2 2 2 2 2 2 2
 */