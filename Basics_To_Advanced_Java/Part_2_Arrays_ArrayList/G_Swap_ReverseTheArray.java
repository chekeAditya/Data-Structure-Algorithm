package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_2_Arrays_ArrayList;

import java.util.*;

public class G_Swap_ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

        reverseTheArray(arr, 0, arr.length - 1);
    }

    private static void reverseTheArray(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
