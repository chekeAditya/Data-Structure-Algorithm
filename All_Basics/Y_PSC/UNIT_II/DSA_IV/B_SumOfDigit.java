package Y_PSC.UNIT_II.DSA_IV;

import java.util.Scanner;

public class B_SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            System.out.println(sum(n,arr));
        }
    }

    static int sum(int n, int[] arr) {
        int sum = 0;int temp;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                temp = arr[i] % 10;
                sum += temp;
                arr[i] = arr[i] / 10;
            }
        }
        return sum;
    }
}
/**
 * Sum of Digits
 * Description
 * <p>
 * You are given an arrayAofNintegers.
 * <p>
 * You have to find the sum of the individual digit sum of all the elements in the array
 * <p>
 * The digit sum here refers to the sum of digits, present in a given element
 * <p>
 * Refer the sample I/O for better understanding
 * <p>
 * <p>
 * Input
 * The first line of the input containsT, the number of test cases
 * <p>
 * The first line of each test case containsN, the number of elements in the array
 * <p>
 * The next line containsNspace separated integers, denoting the elements of the array
 * <p>
 * Constraints
 * <p>
 * 1 <=T<= 10
 * <p>
 * 1 <=N<= 10000
 * <p>
 * 1 <=A[i]<= 10000
 * <p>
 * <p>
 * Output
 * For each test case, print a single integer denoting the sum of individual digit sum of all elements in the array, on a new line.
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 2
 * 5
 * 12 14 16 17 29
 * 6
 * 1 2 3 4 5 51
 * Sample Output 1
 * <p>
 * 34
 * 21
 * Hint
 * <p>
 * In the first sample test case, the sum of digits for various values, is as given below
 * <p>
 * 12 -> 1 + 2 = 3
 * <p>
 * 14 -> 1 + 4 = 5
 * <p>
 * 16 -> 1 + 6 = 7
 * <p>
 * 17 -> 1 + 7 = 8
 * <p>
 * 29 -> 2 + 9 = 11
 * <p>
 * Therefore, the output is3 + 5 + 7 + 8 + 11 = 34.
 * <p>
 * Similarly, in the second test case, the output is1 + 2 + 3 + 4 + 5 + 6 = 21
 */