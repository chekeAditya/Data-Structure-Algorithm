package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_7_Arrays_IV;

/*
 * Given an array arr[], find the maximum j-i such that arr[j] > arr[i]
 */

public class FindMaxJ_I {
    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 1, 7, 2, 6, 5, 4};
        int[] arr = {3,5, 1, 4, 2, 1};
        System.out.println(bruteForce(arr));
        System.out.println(optimised(arr));
    }


    private static int bruteForce(int[] arr) {
        int n = arr.length, ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }


    private static int optimised(int[] arr) {
        int n = arr.length;
        int[] rightMax = new int[n];
        int[] leftMin = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
        }
        int i = 0, j = 0, ans = 0;
        while (i < n && j < n) {
            if (leftMin[i] < rightMax[j]) {
                ans = Math.max(ans, j - i);
                j++;
            }else
                i++;
        }
        return ans;
    }
}
