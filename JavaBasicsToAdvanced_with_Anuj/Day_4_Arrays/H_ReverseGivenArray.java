package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_4_Arrays;

public class H_ReverseGivenArray {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 6, 1, 18, 0};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int temp, start = 0, end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
