package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class N_ToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        toLowerCase(word);
    }

    public static void toLowerCase(String word) {
        char newWord = ' ';
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                newWord = (char) (word.charAt(i) + 32);
            } else {
                newWord = word.charAt(i);
            }
            System.out.print(newWord);
        }
    }
}
