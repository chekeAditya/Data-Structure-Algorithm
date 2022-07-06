package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_5_Arrays_II;

public class B_MaxSumArray {
    public static void main(String[] args) {
        int[] arr = {-2, 7, -6, 4, 1, -3, 8};
        System.out.println(maxSumArray(arr));
    }


    private static int maxSumArray(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (maxSum < currSum) maxSum = currSum;
            if (currSum < 0) currSum = 0;
        }
        return maxSum;
    }
}
