package Java.L_StaticNonStaticAndExceptionHandliing;

import java.util.ArrayList;
import java.util.Scanner;

public class Z_O_MoveZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        zeroToOneSide(n, arrayList);
    }

    static void zeroToOneSide(int n, ArrayList<Integer> arrayList) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        String zero = " ";
        String nonZero = " ";
        for (int i = 0; i < n; i++) {
            if (arrayList.get(i) == 0) {
                zero += arrayList.get(i);
            } else if (arrayList.get(i) != 0) {
                nonZero += arrayList.get(i);
            }
        }

    }
}
/*
5
0 1 0 3 12
 */
