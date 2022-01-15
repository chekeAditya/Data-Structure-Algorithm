package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_5_BinarySearch_Interview_Questions;

public class C_FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 12;
        System.out.println(findFloorNumber(arr, target));
    }

    private static int findFloorNumber(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
