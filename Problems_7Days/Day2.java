package Basic_To_Advanced_DataStructure.Problems_7Days;

import java.util.Arrays;
import java.util.Scanner;

public class Day2 {

    static int character = 256;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String str = scanner.next();
            String str1 = scanner.next();
            char[] string1 = str.toCharArray();
            char[] string2 = str1.toCharArray();
            int[] count1 = new int[character];
            int[] count2 = new int[character];
            Arrays.fill(count1, 0);
            Arrays.fill(count2, 0);
            if (res(string1, string2,count1,count2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    static boolean res(char[] str1, char[] str2, int[] count1, int[] count2) {
        for (int i = 0; i < str1.length && i < str2.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
        if (str1.length != str2.length)
            return false;
        for (int i = 0; i < character; i++)
            if (count1[i] != count2[i])
                return false;

        return true;
    }
}


