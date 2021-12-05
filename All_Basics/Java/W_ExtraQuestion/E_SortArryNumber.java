package Java.W_ExtraQuestion;

import java.util.Scanner;

public class E_SortArryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
                System.out.print(array[i] + " ");

        }
    }
}

/*
Input: arr[] = {0, 23, 14, 12, 9}
Output: {0, 9, 12, 14, 23}
 */