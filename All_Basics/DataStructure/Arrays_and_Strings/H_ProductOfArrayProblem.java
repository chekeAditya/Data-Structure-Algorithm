package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class H_ProductOfArrayProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        //program's logic
        int product = 1;
        for (int i = 0; i < N; i++) {
            product *= array[i];
        }
        System.out.println(product);
    }
}
