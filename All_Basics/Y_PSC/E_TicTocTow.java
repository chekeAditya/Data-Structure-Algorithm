package Y_PSC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E_TicTocTow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int sum = 0;
        int sum1 = 0;
        String[][] arr = new String[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.next();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            count1 = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j].equals("o")) {
                    count++;
                    if (sum < count)
                        sum = count;
                } else if (arr[i][j].equals("x")) {
                    count1++;
                    if (sum1 < count1)
                        sum1 = count1;
                }
            }
        }
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            if (arr[i][j].equals("o")) {
                count2++;
            } else if (arr[i][j].equals("x")) {
                count3++;
            }
        }
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            if (arr[i][i].equals("o")) {
                count4++;
            } else if (arr[i][i].equals("x")) {
                count5++;
            }
        }
        if (sum == 3 || count2 == 3 || count4 == 3) {
            System.out.println("o");
        } else if (sum1 == 3 || count3 == 3 || count5 == 3) {
            System.out.println("x");
        } else {
            System.out.println("Tie");
        }

    }
}
