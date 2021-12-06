package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_1;
/*
Largest X -23:14:35
Description

You are given an array of size N. You need to find the largest number X such that the array has both +X and -X in it.


Input
Input Format

First-line contains T, no of test cases.

The first line of each test case contains N, the size of the array.

The second line of each test case contains N space-separated numbers, elements of the array.

Constraints

1 <= T <= 10

1 <= N <= 10^5

-10^5 <= A[i] <= 10^5, A[i]!=0


Output
For each test case, print X or else print -1, if it doesn't exist.


Sample Input 1

2
5
2 1 -1 -2 3
5
-3 2 -4 4 -2
Sample Output 1

2
4
 */
import java.util.Arrays;
import java.util.Scanner;

public class Largest_X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            System.out.println(res(n, arr));
        }
    }

    static int res(int n, int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] +  arr[j];
            if (sum == 0)
                return arr[j];
            else if (sum > 0)
                j--;
            else
                i++;
        }
        return -1;
    }
}
