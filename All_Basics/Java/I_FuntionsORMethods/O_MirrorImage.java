package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class O_MirrorImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        mirror(letter);
    }

    public static void mirror(String letter) {
        char m;
        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) >= 97 && letter.charAt(i) <= 122) {
                m = (char) ('z' - (letter.charAt(i) - 'a'));
                System.out.print(m);
            }
        }
    }
}