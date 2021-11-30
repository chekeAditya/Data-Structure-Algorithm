package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_10_TwoPointerSlidingWindow;

/*
Two Sorted Arrays
Description

You are given two arraysAandB, each of size N.
The first array A, is sorted in ascending order, while the second array is sorted in descending order.
You have to find the number of elements common in both the arrays.
Try to solve this without using any extra space.


Input
The first line of the input containsT, the number of test cases.

The first line of each test case, contains N, the number of elements in the arrayAandB

The next line of the test case, containsNspace separated integers, denoting the number of elements of the arrayA

The next line containsNspace separated integers, denoting elements of the arrayB.

Constraints

1 <=T<= 10

1 <=N<= 1000000

1 <=A[i]<= 1000


Output
For each test case, print the number of elements common in both the arrays, on a new line.


Sample Input 1

1
6
1 2 2 3 4 5
4 4 3 2 1 1
Sample Output 1

4
Hint

In the sample test case, the number of elements common in both the arrays are {1,2,3,4}. Therefore, the required output is 4.
 */
import java.util.Scanner;

public class TwoSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) arr1[i] = scanner.nextInt();
            System.out.println(res(n, arr, arr1));
        }
    }

    static int res(int n, int[] arr, int[] arr1) {
        int start = 0, count = 0, end = arr1.length - 1;
        while (start < n && end >= 0) {
            if (arr[start] == arr1[end]) {
                count++;
                start++;
                end--;
            } else if (arr[start] > arr1[end]) {
                end--;
            } else {
                start++;
            }
        }
        return count;
    }
}
