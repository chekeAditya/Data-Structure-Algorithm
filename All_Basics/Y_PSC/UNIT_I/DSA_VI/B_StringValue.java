package Y_PSC.UNIT_I.DSA_VI;

import java.util.Scanner;


public class B_StringValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        stringValue(S);
    }

    static void stringValue(String S) {
        int value = 0;
        int sum = 0;
        char a[] = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            value = (char) ((a[i]) - 'a' + 1);
            sum += value;
        }
        System.out.println(sum);
    }
}
