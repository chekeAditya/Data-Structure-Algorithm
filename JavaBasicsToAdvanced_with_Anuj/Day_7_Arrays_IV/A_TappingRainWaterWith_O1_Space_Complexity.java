package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_7_Arrays_IV;

public class A_TappingRainWaterWith_O1_Space_Complexity {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(tappingRainWater(arr));
    }

    private static int tappingRainWater(int[] arr) {
        int left = 0, right = arr.length - 1, ans = 0, leftMax = 0, rightMax = 0;
        while (left < right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] > leftMax)
                    leftMax = arr[left];
                else
                    ans += leftMax - arr[left];
                left++;
            } else {
                if (arr[right] > rightMax)
                    rightMax = arr[right];
                else
                    ans += rightMax - arr[right];
                right--;
            }
        }
        return ans;
    }
}
