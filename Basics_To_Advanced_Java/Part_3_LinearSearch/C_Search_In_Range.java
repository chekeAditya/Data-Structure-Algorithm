package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_3_LinearSearch;

public class C_Search_In_Range {
    /**
     * arr = [18,122,-7,3,14,28]
     * range from 2 to 4
     */

    public static void main(String[] args) {
        int[] arr = {18, 122, -7, 3, 14, 28};
        int target = 17;
        System.out.println(searchInRange(arr, target, 2, 4));
    }

    private static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0)
            return -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
