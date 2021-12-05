package Java.Z_CWD_Basic_To_Advanced;

import java.util.Scanner;

public class M_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] array = new float[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextFloat();
        }
//        sumOfFloatNumber(n, array);
//        presentOrNot(n, array);
        averageMarks(n, array);
    }

    //Question 1
//    taking input as the array
    public static void sumOfFloatNumber(int n, float[] array) {
        float sum = 0;
        for (float element : array) {
            sum = sum + element;
        }
        System.out.println(sum);
    }

    //Question 2
    public static void presentOrNot(int n, float[] array) {
        boolean present = false;
        float number = 12.2f;
        for (int i = 0; i < n; i++) {
            if (number == array[i]) {
                present = true;
                break;
            }
        }
        if (present) {
            System.out.println("Present");
        } else
            System.out.println("Not present");
    }

    //Question 3
    public static void averageMarks(int n, float[] array) {
        float averageMarks = 0;
        for (int i = 0; i < n; i++) {
            averageMarks += array[i] / n;
        }
        System.out.println(averageMarks);
    }

    //Question 4
    public static void addTwoMatrix(){
        int[][] matrix1 = { {1,2,3},
                            {4,5,6}};
        int[][] matrix2 = { {5,7,9},
                            {7,43,34}};

        int[][] resultMatrix = {{0,0,0},
                                {0,0,0}};
    }
}
