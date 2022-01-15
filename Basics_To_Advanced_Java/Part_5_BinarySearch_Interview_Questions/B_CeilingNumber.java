package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_5_BinarySearch_Interview_Questions;

public class B_CeilingNumber {
    /**
     * arr = {2,3,5,9,14,16,18}  target => 14
     * Ceiling => the smallest element in array which is greater or == target <br>
     * e.g ceiling(arr,target = 14) -> 14 <br>
     * e.g ceiling(arr,target = 15) -> 16 -> here element greater than 15 are 16 and 18 but 16 is the smallest.
     */

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 6;
        System.out.println(findCeilingNumber(arr, target));
    }

    private static int findCeilingNumber(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}

