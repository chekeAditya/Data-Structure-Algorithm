package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_1_Funtion_Methods;

import java.util.Arrays;

public class F_FunctionOverloading {

    /**
     * When two or more function have the same name but the different argument then it's called method overloading
     * <p>
     * This happens at the time of Compilation like while compilation it will find which function if taking the integer or string
     * <p>
     * Here either number of parameter should be different or datatype should be different
     */

    public static void main(String[] args) {
        fun(1);
        fun("aditya");
        System.out.println(sum(10, 30));
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(String... v) {

    }
}
