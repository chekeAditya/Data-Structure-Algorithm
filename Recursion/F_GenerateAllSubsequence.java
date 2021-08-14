package Basic_To_Advanced_DataStructure.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class F_GenerateAllSubsequence {
    static ArrayList<String> arrayList = new ArrayList<>();
    static ArrayList<Integer> arrayList1 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
//        char[] arr = new char[str.length()];
        char[] arr = str.toCharArray();
//        for (int i = 0; i < str.length(); i++) {
//            arr[i] = str.charAt(i);
//        }
        int low = 0;
        int high = arr.length - 1;
        res("", arr, low, high);
    }

    static void res(String ans, char[] arr, int low, int high) {
        if (low <= high + 1 && !ans.equals(""))
            System.out.println(ans);
        for (int i = low; i <= high; i++)
            res(ans + arr[i], arr, i + 1, high);
    }
//


}
