package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_9_Sorting;

import java.util.Scanner;

public class Generate_Permutations {
    public static void main(String[] args) {
        String str = "A B C";
        int n = str.length();
        permute(str, 0, n - 1);
    }

    static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }


    static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
    }

//    static void res1()
}


