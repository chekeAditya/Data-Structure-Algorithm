package Java.X_Evaluation.Unit_I.F_Evalution;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        res(n, str);
    }

    static void res(int n, String str) {
        String name = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                name += str.charAt(i);
            }
        }
        isPalindrome(name);
    }

    static void isPalindrome(String name) {
        String n1 = "";
        for (int j = name.length() - 1; j >= 0; j--) {
            n1 += name.charAt(j);
        }
        if (n1.equals(name))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
/*
String newNumber = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            newNumber += number.charAt(i);
        }
        if (number.equals(newNumber)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
 */
