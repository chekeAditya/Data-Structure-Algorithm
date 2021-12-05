package Java.X_Evaluation.Unit_I.R_C_Evalutaion;

import java.util.Scanner;

public class S_StringValur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        stringValue(str);
    }

    static void stringValue(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - 'a' + 1;
        }
        System.out.println(sum);
    }
}
