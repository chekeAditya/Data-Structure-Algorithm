package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_4_BinarySearch;

public class B_Order_Agnostic_BinarySearch {
    /**
     * If we don't know which type of sorted array is it then we will find it using this method
     * arr = {90,75,18,12,6,4,3,1}
     * <p>
     * Take first and last element
     * Ascending Order => if first element is greater than last it's ascending
     * Descending Order => if first elem ent is smaller than last it's descending
     */
    public static void main(String[] args) {
        int[] arrAscending = {1, 2, 3, 4, 5, 6, 9, 18, 90, 1919};
        int[] arrDescending = {100, 90, 76, 56, 20, 6, 4, 2, 1};
        int target = 2;
        int ans = orderAgnosticBinarySearch(arrAscending, target);
        System.out.println("Ascending order: " + ans);
        System.out.println("Descending order: " + orderAgnosticBinarySearch(arrDescending, target));
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        //find weather the array is sorted in ascending or descending
        boolean isAscending;
        if (arr[start] < arr[end]) {
            isAscending = true;
        } else {
            isAscending = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
