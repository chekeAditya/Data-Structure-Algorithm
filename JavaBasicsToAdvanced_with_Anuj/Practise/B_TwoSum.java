package Basic_To_Advanced_DataStructure.JavaBasicsToAdvanced_with_Anuj.Practise;

public class B_TwoSum {
    /*
    [2,7,11,15], target = 9
     */

    public static void main(String[] args) {

    }


    private int[] twoSum(int[] arr, int target) {
        int[] arr1 = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
