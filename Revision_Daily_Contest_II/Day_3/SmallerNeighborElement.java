package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_II.Day_3;
/**
 * Smaller Neighbour Element -9:40:34
 * Description
 *
 * Given an array, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.
 *
 * Mathematically,
 *
 * G[i] for an element A[i] is an element A[j] such that
 *
 * j is maximum possible AND
 *
 * j < i AND
 *
 * A[j] < A[i]
 *
 * Note: Elements for which no smaller element exist, consider next smaller element as -1.
 *
 *
 * Input
 * Input Format:
 *
 * First line contains an integer N denoting the number of elements in the array (not necessarily distinct).
 *
 * Second line contains N space separated integers denoting the elements of the array.
 *
 * Constraints:
 *
 * N <= 100000
 *
 *
 * Output
 * Print N space separated integers denoting the array G.
 *
 *
 * Sample Input 1
 *
 * 8
 * 39 27 11 4 24 32 32 1
 * Sample Output 1
 *
 * -1 -1 -1 -1 4 24 24 -1
 */

import java.util.Scanner;
import java.util.Stack;

public class SmallerNeighborElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        res(n, arr, stack);
    }

    static void res(int n, int[] arr, Stack<Integer> stack) {
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i])
                stack.pop();

            if (!stack.isEmpty())
                System.out.print(stack.peek() + " ");

            else
                System.out.print(-1 + " ");

            stack.push(arr[i]);
        }
    }
}
