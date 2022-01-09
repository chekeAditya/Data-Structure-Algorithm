package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_2_Arrays_ArrayList;

import java.util.*;

public class B_2D_Array {
    public static void main(String[] args) {
        /**
         *  This is the e.g of 2D matrix
         1 2 3
         4 5 6
         7 8 9
         * while Declaring and initializing. Initializing row is mandatory but not column
         * It's an arrays of array
         * ___Internally how it stores in the memory___
         * arr = {{ref},{ref},{ref}} -> now this reference will refer to another array like -> {1,2,3,4} same goes with other references'
         * Here if we took arr[1] -> {1,2,3,4}
         * and if i say arr[1][0] -> 1 -> it will give you 1 as arr[1] -> {1,2,3,4} and its arr[0] -> 1
         */
//        int[][] arr = new int[3][];
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //input
        Scanner scanner = new Scanner(System.in);
        int[][] arr2D = new int[3][3];
        for (int i = 0; i < arr2D.length; i++) {
            //for each col in every row
            for (int j = 0; j < arr2D.length; j++) {
                arr2D[i][j] = scanner.nextInt();
            }
        }
        //output
        System.out.println("Printing the arrays");
        for (int i = 0; i < arr2D.length; i++) {
            //for each col in every row
            for (int j = 0; j < arr2D.length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        //output
        System.out.println("For loops using Arrays.toString");
        for (int i = 0; i < arr2D.length; i++) {
            //for each col in every row
            System.out.println(Arrays.toString(arr2D[i]));
        }

        //output
        System.out.println("Enhanced for loop");
        for (int[] ints : arr2D) {
            //for each col in every row
            System.out.println(Arrays.toString(ints));
        }
    }
}
