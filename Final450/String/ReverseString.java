package Basic_To_Advanced_DataStructure.Final450.String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        for (int i = 0; i < n; i++)
        reverseString(s);
    }


    public static void reverseString(char[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}
