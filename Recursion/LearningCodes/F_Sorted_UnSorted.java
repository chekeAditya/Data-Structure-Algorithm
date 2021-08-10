package Basic_To_Advanced_DataStructure.Recursion.LearningCodes;

import java.util.Scanner;

public class F_Sorted_UnSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        if (checkSorted(arr, n)) System.out.println("sorted");
        else System.out.println("Unsorted");
    }

    static boolean checkSorted(int[] arr, int n) {
        for (int i = 1; i < n; ) {
            if (i >= arr.length) {
                return true;
            }
            if (arr[i] < arr[i - 1]) return false;
            return checkSorted(arr, i + 1);
        }
        return false;
    }
}
