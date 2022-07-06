package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_4_Arrays;

public class C_LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 5, 7, 19, 92};
        int max = 0;
        System.out.println(max(arr, max));
    }

    public static int max(int[] arr, int max) {
        int i = 0, n = arr.length;
        for (; i < n; i++) {
            if (arr[i] > arr[max]) max = i;
        }
        return arr[max];
    }
}
