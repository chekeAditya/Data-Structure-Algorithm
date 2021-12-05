package Y_PSC.UNIT_I.DSA_VI_V;

import java.util.Scanner;

public class A_Sum_Of_Special_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        specialPairSum(n, array);
    }

    static void specialPairSum(int n, int[] array) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j) {
                    int number = j - i;
                    boolean flag = false;
                    for (int p = 2; p <= number / 2; ++p) {
                        if (number % p == 0) {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag && number != 1) {
                        sum = Math.abs(array[j] - array[i]) + sum;
                    }

                }
            }

        }
        System.out.println(sum);
    }
}

/**
 * Link :- https://oj.masaischool.com/contest/1048/problem/1
 * Sum of Special Pairs
 * Description
 * <p>
 * You are given an array A of N integers. Write a program to find the sum of the absolute difference between all such pairs (A[i], A[j]) such that i < j and ( j-i ) is prime.
 * <p>
 * <p>
 * Input
 * Input Format :
 * <p>
 * First line contains N
 * <p>
 * Second line contains N space separated integers which are elements of A
 * <p>
 * Constraints :
 * <p>
 * N<1000
 * <p>
 * <p>
 * Output
 * Output one number as per condition mentioned above
 * <p>
 * <p>
 * Sample Input 1
 * <p>
 * 6
 * 1 2 3 5 7 12
 * <p>
 * Sample Output 1
 * <p>
 * 45
 */