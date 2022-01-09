package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_1_Funtion_Methods;

import java.util.Arrays;

public class A_Swap_Two_Numbers {

    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;
        swap(a, b);
        /**
         * Here the value will not be changes at it is pointing to another reference
         */
        System.out.println("Value of a is " + a + " and b is " + b);


        int[] arr = {10, 20, 30, 40, 50};
        /**
         * Here it will change the value as it is pointing to the same reference
         * If you make the change of the object via this ref variable, then same variable will be changed
         */
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void changeValue(int[] number) {
        number[0] = 100;
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = a;
    }
}
