package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class F_UpperToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        lowerToUpper(letter);
    }
    public static void lowerToUpper(char letter){
        char word = (char) (letter + 32);
        System.out.println(word);
    }
}
