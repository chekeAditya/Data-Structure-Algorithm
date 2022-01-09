package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_3_LinearSearch;

public class D_FindMinimum_Number {
    public static void main(String[] args) {
        int[] arr = {10, 28, 90, 8, -2, 0};
        System.out.println(findMiNumber(arr, arr[0]));
    }

    private static int findMiNumber(int[] arr, int number) {
        if (arr.length == 0)
            return -1;

        for (int a : arr) {
            if (a < number)
                number = a;
        }
        return number;
    }
}
