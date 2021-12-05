package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class J_SumRelatedProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // logic begins
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
/*
D => You are given a number N, find sum of all even numbers which occur before N
    (inclusive of N if N is even)

I => 8
O => 20

 */