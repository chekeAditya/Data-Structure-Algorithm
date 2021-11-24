package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println();
        res(str);
    }

    static void res(String str) {
        int count = 1;
        String str1 = "";
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    str1 = String.valueOf(count + str.charAt(i));
                } else {
                }
            }
        }
        System.out.println(str1);
    }
}
