package Java.X_Evaluation.Unit_II.Sprint_II;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(res(n, str));
    }

    static String res(int n, String str) {
        String maxString = "";
        for (int i = 0; i < str.length(); ++i) {
            if (maxString.compareTo(str.substring(i)) <= 0) {
                maxString = str.substring(i);
            }
        }
        return maxString;
    }
}
