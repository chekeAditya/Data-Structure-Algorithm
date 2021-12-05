package Y_PSC.UNIT_II.DSA_IV;

import java.util.Scanner;

public class A_RunningSumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            res(n, arr);
        }
    }

    static void res(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
/**
 * Running Sum of an Array
 * Description
 * <p>
 * You are given an arrayAcontaining N integers, find the running sum of the array.
 * <p>
 * The running sum of the array is defined as the sum of all the elements of the array that exists before the current element, including the current element
 * <p>
 * Refer the sample I/O for better understanding
 * <p>
 * <p>
 * Input
 * The first line of the input containsT, the number of test cases
 * <p>
 * For each test case, the first line containsN, the number of elements in the array
 * <p>
 * The next line containsNspace separated integers denoting the elements of the array
 * <p>
 * Constraints
 * <p>
 * 1 <= T <= 10
 * <p>
 * 1 <=N<= 10^6
 * <p>
 * 1 <=A[i]<= 10^4
 * <p>
 * <p>
 * Output
 * For each test case, printNspace separated integers, denoting the running sum of the array, at different indexes in the array
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 1
 * 5
 * 1 2 3 4 5
 * Sample Output 1
 * <p>
 * 1 3 6 10 15
 * Hint
 * <p>
 * In the sample test case, the array has 5 elements. For each element, we have to find the sum of all the elements that exist before it, and include the current element as well
 * <p>
 * Therefore, for all the elements, the sum becomes
 * <p>
 * index - 0->{1 = 1}
 * <p>
 * index - 1->{1 + 2 = 3}
 * <p>
 * index - 2->{1 + 2 + 3 = 6}
 * <p>
 * index - 3->{1 + 2 + 3 + 4 = 10}
 * <p>
 * index - 4->{1 + 2 + 3 + 4 + 5 = 15}
 */