package Basic_To_Advanced_DataStructure.Revision_Daily_Contest.Day_7;

/*
Next Greater Element -2:14:46
Description

Given an array of N elements, find the next greater element for each element in the array, print -1 if it does not exits. Refer to the sample I/O for better understanding


Input
The first line contains T, the number of test cases.

The first line of each test case contains N, the number of elements in the array. The next line contains N space separated integers denoting the elements of the array

Constraints

1 <= T <= 10

1 <= N <= 10^5

0 <= A[i] <= 10000


Output
For each test case, print N space separated integers, denoting the next greater element for each element,  on a new line.


Sample Input 1

1
4
1 3 2 4
Sample Output 1

3 4 4 -1
Hint

In the sample test case, the array contains 4 elements, and for the first element, the next greater element will be 3, similarly for the next element, the next greater element will be 4, and for the third element as well, the next greater element will be 4. Since, the last element has no elements ahead of it, the next greater element will be -1.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            res(n, arr);
        }
    }

    static void res(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    count = 1;
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (count == 0) {
                System.out.print(-1 + " ");
            }
        }
        System.out.println(-1);
    }
}