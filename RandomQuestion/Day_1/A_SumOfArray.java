package Basic_To_Advanced_DataStructure.RandomQuestion.Day_1;

public class A_SumOfArray {
    /**
     * Input:
     * N = 4
     * Arr[] = {1, 2, 3, 4}
     * Output: 10
     * Explanation: 1 + 2 + 3 + 4 = 10.
     */

    int sum(int arr[], int n) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
