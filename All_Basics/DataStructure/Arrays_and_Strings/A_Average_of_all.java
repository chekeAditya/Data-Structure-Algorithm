package DataStructure.Arrays_and_Strings;

import java.util.Scanner;

public class A_Average_of_all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int average = 0;

        for (int i = 0; i < n; i++) { //arr[i].length instead of this we can write n also
            sum += arr[i];
        }
        average = sum / n;
        System.out.println(average);
    }
}
