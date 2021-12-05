package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class B_UpperToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char word = scanner.next().charAt(0);
        upperToLower(word);
    }
    public static void upperToLower(char word){
        char out = (char) (word+32);
        System.out.println(out);
    }
}
