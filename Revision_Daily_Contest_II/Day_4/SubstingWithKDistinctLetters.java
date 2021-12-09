package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_4;

import java.util.HashSet;
import java.util.Scanner;

public class SubstingWithKDistinctLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        char[] arr = scanner.next().toCharArray();
        System.out.println(res(n,arr));
    }

    static int res(int n, char[] arr) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        return hashSet.size() - 1;
    }
}
/*
4 2
abcc
 */