package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_6;

import java.util.Arrays;
import java.util.Scanner;

public class Two_String_And_Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        System.out.println(res(0, c1.length, 0, c2.length, c1, c2));
    }

    static String res(int start, int end, int start1, int end1, char[] c1, char[] c2) {
        Arrays.sort(c1);
        Arrays.sort(c2);
        while (start <= end) {
            while (start1 <= end1) {
                if (c1[start] == c2[start1]) {
                    start++;
                    start1++;
                } else {
                    return "No";
                }
            }
        }
        return "Yes";
    }


}
