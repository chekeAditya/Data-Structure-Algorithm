package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_2_Arrays_ArrayList;

import java.util.Arrays;

public class H_Print_Max_Element_In_Arraylist {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 4, 5, 6, 7, 8};
        System.out.println(max(arr));
    }

    //imagine array is not empty here
    private static int max(int[] arr) {
        if (arr.length == 0)
            return 0;
        int temp = arr[0];
        for (int a : arr) {
            if (a > temp) {
                temp = a;
            }
        }
        return temp;
    }
}
