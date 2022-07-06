package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Practise;

import java.util.ArrayList;

public class D_SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int sum = 12;

        /**
         * Dry run

         i = 0
         left = 0
         right = 0,1,2
         sum = 0,1,3,


         */
        System.out.println(subArraySum(arr, arr.length, sum));
    }

    private static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            int left = 0, right = 0;
            while (left < n && right < n) {
                currSum += arr[right];
                if (currSum == s) {
                    list.add(0, left + 1);
                    list.add(0, right + 1);
                } else if (currSum < s)
                    right++;
                else {
                    left++;
                }
            }
        }
        return list;
    }
}
