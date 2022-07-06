package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_4_Arrays;

public class E_FindSmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 6, 1, 18, 9, 0};
        System.out.println(smallestElement(arr));
    }

    private static int smallestElement(int[] arr) {
        int smallest = arr[0];
        for (int e : arr) {
            if (e < smallest) smallest = e;
        }
        return smallest;
    }
}
