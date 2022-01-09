package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_3_LinearSearch;

import java.util.Arrays;

public class E_Search_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 5},
                {12, -1, 0},
                {73, 90, 8}
        };
        int target = -1;
        System.out.println("If Present print boolean " + search2DArray(arr, target));
        int[] ans = search2DArrayAndReturnIndex(arr, target);
        System.out.println("Element present at index " + Arrays.toString(ans));
        System.out.println("Minimum value is " + search2DArrayAndReturnIndex_MinValue(arr, target));
        System.out.println("Maximum value is " + search2DArrayAndReturnIndex_MaxValue(arr, target));
    }

    private static boolean search2DArray(int[][] arr, int target) {
        if (arr.length == 0)
            return false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    private static int[] search2DArrayAndReturnIndex(int[][] arr, int target) {
        if (arr.length == 0)
            return new int[]{-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    private static int search2DArrayAndReturnIndex_MaxValue(int[][] arr, int target) {
        int max = Integer.MIN_VALUE;
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    private static int search2DArrayAndReturnIndex_MinValue(int[][] arr, int target) {
        int min = Integer.MAX_VALUE;
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        return min;
    }
}
