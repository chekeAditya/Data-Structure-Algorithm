package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_6;

/*
Such Pair Returns -2:0:39
Description

For each test case, you are given N integers and K, your task is to write a program that prints "1" (without quotes) if there are 2 integers present in the array whose sum is K. Else print "-1" (without quotes).


Input
10^6Input Format :

First line contains T, no of test cases.

First line of each test case contains 2 space separated integers: N & K

Second line of each test case contains **N** space separated integers

Constraints :

1 <= T <= 10

1 <= N <=1000000

1 <= abs(A[i]) <=10^6<= abs(K) <= 2*10^6




Output
Output 1/-1 depending on the condition for each test case on new line


Sample Input 1

1
5 2
3 4 0 2 7
Sample Output 1

1
 */
import java.util.HashSet;
import java.util.Scanner;

public class SuchPairsReturns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                hashSet.add(arr[i]);
            }
            System.out.println(res(n,k,arr,hashSet));
        }
    }

    static int res(int n, int k, int[] arr, HashSet<Integer> hashSet) {
        for (int i = 0; i < n; i++) {
            int number =  k - arr[i];
            if (hashSet.contains(number)) {
                return 1;
            }
        }
        return -1;
    }
}
