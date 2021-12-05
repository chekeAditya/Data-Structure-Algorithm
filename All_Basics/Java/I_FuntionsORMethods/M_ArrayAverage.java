package Java.I_FuntionsORMethods;

import java.util.Scanner;

public class M_ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{1, 2, 3, 4, 5};
        returnAverage(array);
    }

    public static int returnAverage(int[] array) {
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        System.out.println(average);
        return 0;
    }
}
