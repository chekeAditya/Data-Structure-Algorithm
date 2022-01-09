package Basic_To_Advanced_DataStructure.Basics_To_Advanced_Java.Part_2_Arrays_ArrayList;

import java.util.*;

public class A_ArraysLearning {
    /**
     * It's the collection of datatype
     * 1. int[] -> represent what type of data it contains
     * 2. Declaration happens at compile time and memory allocation happens at the runtime
     * 3. Arrays are mutable in nature.
     * 4. new Keyword -> it is used to create an object happened at runtime.
     * 5. By Default array of int datatype contain all the 0 elements e.g [0,0,0,0]
     * 5. By Default array of String datatype contain all the 0 elements e.g [null,null,null,null]
     * <p>
     * <p>
     * Q) Why memory Allocation in java is not continuous?
     * -> In c++ its continuous allocation of memory but in case of java it's a bit different
     * -> Array object are in heap
     * -> heap objet are not continuous
     * -> Dynamic memory allocation (DMA)
     * -> hence memory allocation in java may not be continuous, and it depends on JVM
     * <p>
     * Q) Why by default Objects are null ?
     * -> String[] arr = new String[5];
     * ___Internally Working of Object___
     * arr -----> [object,object,object,object]
     * -> Here what ever data present inside the arr are stored as an object, and it stored as the different part of the memory
     * -> for each object there will be a reference variable e.g arr[0] here as we haven't assigned the value of arr[0] so by default we know all reference variable are pointing to none(null);
     * <p>
     * <p>
     * NOTE:- Primitive datatype stored in Stack Memory and Non-Primitive datatype store in Heap Memory
     */
    public static void main(String[] args) {

        //Syntax of array -> datatype[] variable_name = new datatype[size];
        //Store 5 roll numbers:
        int[] rnos = new int[5];


        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[8]; //actually here object is being created in the memory(heap)
        System.out.println(ros[1]);

        String[] arr = new String[3];
        System.out.println(arr[0]); //it's a special literal or null type

        String str = null; //we can assign it as null but for primitive datatype we can't do that. It's a

        System.out.println("------------------------------------------------------------------------------");
        int[] arr1 = new int[5];
        arr1[0] = 8;
        arr1[1] = 2;
        arr1[2] = 86;
        arr1[3] = 6;
        arr1[4] = 16;

        //Different ways to print an array
        System.out.print("Way 1 -> ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Way 2 -> ");
        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("Way 3 -> ");
        System.out.println(Arrays.toString(arr1));

    }

}
