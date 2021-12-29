package Basic_To_Advanced_DataStructure.RandomQuestion.Day_1;

public class D_PrintElementOfArray {

    /**
     * Given an array Arr of size N, print all its elements.
     *
     * Example 1:
     *
     * Input:
     * N = 5
     * Arr[] = {1, 2, 3, 4, 5}
     * Output: 1 2 3 4 5
     * Example 2:
     *
     * Input:
     * N = 4
     * Arr[] = {2, 3, 5, 5}
     * Output: 2 3 5 5
     * Your Task:
     * Complete the function printArray() which takes an array arr, single integer n, as input parameters and prints the value of the array space separated.
     *
     * Expected Time Complexity: O(N)
     * Expected Auxiliary Space: O(1)
     *
     *
     * Constraints:
     * 1 <= N <= 105
     * 1 <= Arr[i] <= 105
     */

    void printArray(int arr[], int n) {
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
