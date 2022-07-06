package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Day_5_Arrays_II;

public class C_Container_with_most_water {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 4, 5, 8, 3, 7};
        System.out.println(containerWithMostWater(arr));
    }

    private static int containerWithMostWater(int[] arr) {
        int maxArea = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int height = Math.min(arr[l], arr[r]);
            int distance = r - l; // as r will be more and l will be less everytime
            int area = height * distance;
            maxArea = Math.max(maxArea, area);

            if (arr[l] < arr[r]) l++;
            else r--;

        }
        return maxArea;
    }
}
