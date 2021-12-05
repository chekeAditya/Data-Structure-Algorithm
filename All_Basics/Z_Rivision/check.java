package Z_Rivision;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(res(str));
    }

    static String res(String str) {
        String s = "";
        if (str.length() >= 1 && str.length() <= 100) {
            for (int i = str.length() - 1; i >= 0; i--) {
                s += str.charAt(i);
            }
        }
        return s;
    }
}
