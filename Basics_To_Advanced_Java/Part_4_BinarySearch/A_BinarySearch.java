package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_4_BinarySearch;

public class A_BinarySearch {

    /**
     * Binary Search
     * It's used for sorted array (array is in ascending or descending order)
     * Q) What is Binary Search ?
     * -> Find the middle of the array
     * -> Check if target number is greater than mid the then search in right
     * -> Check if target number is smaller than mid the then search in left
     * -> If middle element == target element then print that's the answer
     * -> Time Complexity -> Best case = O(1), The Worst Case = O(logn)
     * <p>
     * Why Binary Search?
     * -> Find max number of such comparisons in worst case
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 18, 90, 1919};
        int target = 3;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return index
    //return -1 if it does not exist
    private static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        //find the middle element
//        int mid = (start + end) /2; //might be possible that (start + end) exceed the range of integer
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        //element not exist in the array
        return -1;
    }
}
