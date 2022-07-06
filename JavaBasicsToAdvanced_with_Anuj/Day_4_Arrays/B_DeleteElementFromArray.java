package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_4_Arrays;

import java.security.Key;

public class B_DeleteElementFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 7, 19, 92};
        int key = 100;
        for (int b : arr) System.out.print(b + " ");
        System.out.println();
        delete(arr, key);
        for (int e : arr) System.out.print(e + " ");
    }

    public static int delete(int[] arr, int key) {
        int i = 0;
        int n = arr.length;
        for (; i < n; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        if (i == n) return n;
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        return n - 1;
    }

}
