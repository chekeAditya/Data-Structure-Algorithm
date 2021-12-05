package Y_PSC.UNIT_II.DSA_VI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubArrayUnderCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            arr2[i] = Integer.parseInt(arr[i]);
        res(arr2);
    }

    static void res(int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = 0;
            for (int j = i; j < arr2.length; j++) {
                sum += arr2[j];
                if (sum == 0) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
