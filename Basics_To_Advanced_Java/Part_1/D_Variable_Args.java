package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class D_Variable_Args {

    public static void main(String[] args) {
        fun(2, 3, 4, 5, 5);
        multipleArgument(2,3,"Aditya","Karan","Shivom","Pawan");
    }

    /**
     * Here if you don't know how much variable you are passing then it's internally taking array of numbers
     * if we do it String then it will be String of v, or Double of v
     * <p>
     * This is known as variable known arguments
     */
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }


    /**
     * If you want to take the multiple lever of argument's
     * varible args parameter must be the last in this list
     */
    static void multipleArgument(int a, int b, String... v) {

    }
}
